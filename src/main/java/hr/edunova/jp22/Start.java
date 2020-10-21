/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22;

import hr.edunova.jp22.utility.HibernateUtil;
import hr.edunova.jp22.utility.PocetniInsert;
import hr.edunova.jp22.utility.StarRater;
import hr.edunova.jp22.view.Autorizacija;
import hr.edunova.jp22.view.Izbornik;
import hr.edunova.jp22.view.SplashScreen;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Bole
 */
public class Start {

    public static void main(String[] args) {
//         PocetniInsert.izvedi();
//         PocetniInsert.adminOperater();
        // HibernateUtil.getSessionFactory().openSession();
        // Autorizacija autorizacija = new Autorizacija();
        // autorizacija.setLocationRelativeTo(null);
        // autorizacija.setVisible(true);

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
    }
}
