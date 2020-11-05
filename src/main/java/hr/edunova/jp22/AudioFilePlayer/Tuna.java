/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.AudioFilePlayer;

import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.getPauza;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.pauza;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Bole
 */
public class Tuna implements Runnable{
    @Override
    public void run(){
        try{
            getPauza();
        }catch(Exception e){
            System.out.println("Greska");
        }
        
    }
    
}
