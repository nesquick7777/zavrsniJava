/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.AudioFilePlayer;

import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.getPause;

/**
 *
 * @author Bole
 */
public class Pause implements Runnable{
    @Override
    public void run(){
        try{
            getPause();
        }catch(Exception e){
            System.out.println("Greska");
        }
        
    }
    
}
