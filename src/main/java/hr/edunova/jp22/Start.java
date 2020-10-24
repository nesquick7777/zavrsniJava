/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22;

import com.github.javafaker.File;
import hr.edunova.jp22.utility.HibernateUtil;
import hr.edunova.jp22.utility.PocetniInsert;
import hr.edunova.jp22.utility.StarRater;
import hr.edunova.jp22.view.Autorizacija;
import hr.edunova.jp22.view.Izbornik;
import hr.edunova.jp22.view.SplashScreen;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Bole
 */
public class Start {

    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("C:\\xampp\\mysql\\bin\\mysqld.exe");
        if(process == null){
            System.exit(0);
        }
//         PocetniInsert.izvedi();
//         PocetniInsert.adminOperater();
        // HibernateUtil.getSessionFactory().openSession();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        SplashScreen sC = new SplashScreen();
        sC.setLocationRelativeTo(null);
        sC.setVisible(true);
        
        
         Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
        public void run() {
        System.out.println("In shutdown hook");
            try {
                Process process1= Runtime.getRuntime().exec("taskkill /F /IM  mysqld.exe");
            } catch (IOException ex) {
                Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }, "Shutdown-thread"));
         
    }
    
    
}
