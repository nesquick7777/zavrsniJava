package hr.edunova.jp22.AudioFilePlayer;

import static com.sun.activation.registries.LogSupport.log;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.log;
import static java.lang.StrictMath.log;
import static java.rmi.server.LogStream.log;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;
import javax.sound.sampled.DataLine;

public class AudioFilePlayer implements Runnable {

    public static boolean pauza = false;
    public static boolean stop = false;

    public static void main(String[] args) {
        final AudioFilePlayer player = new AudioFilePlayer();
        player.run();
    }

    public void run() {
        String filePath = "D:/Downloads/Jeff Rosenstock FOX IN THE SNOW.mp3";
        final File file = new File(filePath);

        try (final AudioInputStream in = getAudioInputStream(file)) {

            final AudioFormat outFormat = getOutFormat(in.getFormat());
            final Info info = new Info(SourceDataLine.class, outFormat);

            try (final SourceDataLine line
                    = (SourceDataLine) AudioSystem.getLine(info)) {

                if (line != null) {
                    line.open(outFormat);
                    line.start();

                    //STREAM
                    int n = 0;
                    final byte[] buffer = new byte[4096];
                    AudioInputStream inp = getAudioInputStream(outFormat, in);

                    while (n != -1) {
                        if (pauza == true) {
                            break;
                        }
                        if (stop == true) {
                            synchronized (this) {
                                this.wait();
                            }

                        }
                        n = inp.read(buffer, 0, buffer.length);
                        if (n != -1) {
                            line.write(buffer, 0, n);
                        }
                    }
                    //STREAM

                    line.drain();
                    line.stop();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(AudioFilePlayer.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (UnsupportedAudioFileException
                | LineUnavailableException
                | IOException e) {
            throw new IllegalStateException(e);
        }
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
        return stop = false;
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
