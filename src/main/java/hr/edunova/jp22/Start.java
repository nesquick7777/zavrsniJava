/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22;

import hr.edunova.jp22.utility.HibernateUtil;
import hr.edunova.jp22.utility.PocetniInsert;
import hr.edunova.jp22.view.Izbornik;

/**
 *
 * @author Bole
 */
public class Start {
    public static void main(String[] args) {
        //PocetniInsert.izvedi();
        // HibernateUtil.getSessionFactory().openSession();
        new Izbornik().setVisible(true);
    }
}
