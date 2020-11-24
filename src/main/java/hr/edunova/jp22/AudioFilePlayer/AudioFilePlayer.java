package hr.edunova.jp22.AudioFilePlayer;

import static hr.edunova.jp22.view.Pjesme.Finished;
import static hr.edunova.jp22.view.Pjesme.sliderGlasnoca;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import org.tritonus.share.sampled.file.TAudioFileFormat;

public class AudioFilePlayer implements Runnable {

    public static boolean pauza = false;
    public static boolean stop = false;
    public static final Object LOCK = new Object();
    public static String filePath;
    public static SourceDataLine lineMain;
    public static long seconds;
    public static long minutes;
    public static int sec;
    public static int min;
    public static String title1;
    public static int trajanjeSekunde;
    public static int maksimumSekunde;

    public static void main(String[] args) {
        final AudioFilePlayer player = new AudioFilePlayer();
        player.run();
    }

    public void run() {
        final File file = new File(filePath);
        try (final AudioInputStream in = AudioSystem.getAudioInputStream(file)) {
            final AudioFormat outFormat = getOutFormat(in.getFormat());
            final Info info = new Info(SourceDataLine.class, outFormat);

            try (final SourceDataLine line
                    = (SourceDataLine) AudioSystem.getLine(info)) {
                getLine(line);
                line.getMicrosecondPosition();
                if (line != null) {
                    line.open(outFormat);
                    line.start();

                    long millis;
                    AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(file);
                    Map<?, ?> properties = ((TAudioFileFormat) fileFormat).properties();
                    String key = "duration";
                    String title = "title";
                    Long microseconds = (Long) properties.get(key);
                    maksimumSekunde = (int)TimeUnit.MICROSECONDS.toSeconds(microseconds);
                    title1 = (String) properties.get(title);
                    int mili = (int) (microseconds / 1000);
                    sec = (mili / 1000) % 60;
                    min = (mili / 1000) / 60;

                    setVolumeDown(sliderGlasnoca.getValue());
                    //STREAM
                    int n = 0;
                    final byte[] buffer = new byte[4096];
                    AudioInputStream inp = getAudioInputStream(outFormat, in);

                    while (n != -1) {
                        if (pauza == true) {
                            break;
                        }
                        if (stop == true) {
                            synchronized (LOCK) {
                                LOCK.wait();
                            }

                        }
                        n = inp.read(buffer, 0, buffer.length);
                        if (n != -1) {
                            line.write(buffer, 0, n);
                        }
                        millis = TimeUnit.MICROSECONDS.toMillis(line.getMicrosecondPosition());
                        trajanjeSekunde = (int)TimeUnit.MICROSECONDS.toSeconds(line.getMicrosecondPosition());
                        minutes = (millis / 1000) / 60;
                        seconds = ((millis / 1000) % 60);

                        //System.out.println(minutes + ":" + seconds + " " + "time = " + min + ":" + sec + " " + title1);
                    }
                    //STREAM
                    line.drain();
                    line.stop();
                    Finished();
                }
            } catch (InterruptedException ex) {

            }

        } catch (UnsupportedAudioFileException
                | LineUnavailableException
                | IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private void getLine(SourceDataLine line1) {
        lineMain = line1;
    }

    public static void setVolumeDown(int mjerac) {
        FloatControl volume = (FloatControl) lineMain.getControl(FloatControl.Type.MASTER_GAIN);
        double gain = 0;

        switch (mjerac) {
            case 0:
                gain = 0;
                break;
            case 1:
                gain = 0.125;
                break;
            case 2:
                gain = 0.25;
                break;
            case 3:
                gain = 0.375;
                break;
            case 4:
                gain = 0.5;
                break;
            case 5:
                gain = 0.625;
                break;
            case 6:
                gain = 0.75;
                break;
            case 7:
                gain = 0.875;
                break;
            case 8:
                gain = 1;
                break;
            case 9:
                gain = 1.125;
                break;
            case 10:
                gain = 1.25;
                break;
            case 11:
                gain = 1.375;
                break;
            case 12:
                gain = 1.5;
                break;
            case 13:
                gain = 1.675;
                break;
            case 14:
                gain = 1.75;
                break;
            case 15:
                gain = 1.875;
                break;
            case 16:
                gain = 2;
                break;
            default:
                break;
        }

        float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
        volume.setValue(dB);
    }

    public void rewind() {

    }

    private AudioFormat getOutFormat(AudioFormat inFormat) {
        final int ch = inFormat.getChannels();

        final float rate = inFormat.getSampleRate();
        return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }

    public static boolean getStart() {
        return pauza = false;
    }

    public static boolean getStop() {
        return pauza = true;
    }

    public static boolean getPause() {
        return stop = true;
    }

    public static boolean getUnpause() {
        synchronized (LOCK) {
            LOCK.notify();
        }
        return stop = false;

    }

    public static String getPut(String put) {
        filePath = put;
        return filePath;
    }

//    private void stream(AudioInputStream in, SourceDataLine line)
//            throws IOException {
//        final byte[] buffer = new byte[4096];
//
//        for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
//            line.write(buffer, 0, n);
//
//        }
//    }
}
