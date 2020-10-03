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
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Bole
 */
public class Start {

    public static void main(String[] args) {
 //       PocetniInsert.izvedi();
 //       PocetniInsert.adminOperater();
        // HibernateUtil.getSessionFactory().openSession();
//        Autorizacija autorizacija = new Autorizacija();
//        autorizacija.setLocationRelativeTo(null);
//
//        autorizacija.setVisible(true);



    JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        StarRater starRater = new StarRater(5, 2, 1);
        starRater.addStarListener(
            new StarRater.StarListener()   {

                public void handleSelection(int selection) {
                    System.out.println(selection);
                }
            });
        panel.add(starRater);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
