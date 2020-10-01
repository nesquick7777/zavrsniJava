/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import hr.edunova.jp22.model.Operater;

/**
 *
 * @author Korisnik
 */
public class Aplikacija {
    
    public static Operater operater;
    
    public static boolean isAdmin(){
        if(operater==null || operater.getUloga()==null){
            return false;
        }
        return operater.getUloga().equals("admin");
    }
    
}
