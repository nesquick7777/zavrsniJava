/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22;
import hr.edunova.jp22.utility.HibernateUtil;

/**
 *
 * @author Bole
 */
public class Start {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}
