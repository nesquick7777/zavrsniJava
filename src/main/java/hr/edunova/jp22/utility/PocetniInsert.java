/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.utility;

import com.github.javafaker.Faker;
import hr.edunova.jp22.model.Clan;
import hr.edunova.jp22.model.Umjetnik;
import hr.edunova.jp22.model.Album;
import hr.edunova.jp22.model.EP;
import hr.edunova.jp22.model.Singl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Bole
 */
public class PocetniInsert {
    
    public static void izvedi(){
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        
        Faker faker = new Faker();
        String[] zanr = {"Rock","Pop","Country","Metal","Blues","EDM","Punk","Jazz","Hip Hop","Soul"};
        String[] podZanr = {"Alternative","Post","Experimental","Fusion","Parody"};
        
        
        session.beginTransaction();   //START
        
        Umjetnik umjetnik = new Umjetnik();
        umjetnik.setIme(faker.rockBand().name());
        umjetnik.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        umjetnik.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        umjetnik.setMjesto(faker.country().capital());
        umjetnik.setDatumkraja(faker.date().birthday(18, 45));
        umjetnik.setDatumkraja(faker.date().birthday(2, 5));
        session.save(umjetnik);
        
        session.getTransaction().commit();    //END
        
        
        session.beginTransaction();   //START
        
        for(int i = 0;i<10;i++){
        Clan clan = new Clan();
        clan.setIme(faker.artist().name());
        clan.setPrezime(faker.name().lastName());
        clan.setDatumr(faker.date().birthday());
        clan.setDatump(faker.date().birthday());
        clan.setMjestor(faker.country().name());
        clan.setMjestop(faker.country().capital());
        clan.setBiljeske(faker.shakespeare().hamletQuote());
        clan.setUmjetnik(umjetnik);
        session.save(clan);
        }
        
        session.getTransaction().commit(); //END
        
        
        
        
        session.beginTransaction();   //START
        
        Album album = new Album();
        album.setIme(faker.superhero().power());
        album.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        album.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        album.setDatumalbuma(faker.date().birthday(18, 45));
        album.setIzdavackakuca(faker.company().name());
        album.setOcjena(faker.number().numberBetween(1, 10));
        album.setUmjetnik(umjetnik);
        session.save(album);
        
        session.getTransaction().commit();    //END
        
        session.beginTransaction();   //START
        
        EP ep = new EP();
        ep.setIme(faker.witcher().monster());
        ep.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        ep.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        ep.setDatumEP(faker.date().birthday(18, 45));
        ep.setIzdavackakuca(faker.company().name());
        ep.setOcjena(faker.number().numberBetween(1, 10));
        ep.setUmjetnik(umjetnik);
        session.save(ep);
        
        session.getTransaction().commit();    //END
        
        session.beginTransaction();   //START
        
        Singl singl = new Singl();
        singl.setIme(faker.ancient().god());
        singl.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        singl.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        singl.setDatumsingla(faker.date().birthday(18, 45));
        singl.setIzdavackakuca(faker.company().name());
        singl.setOcjena(faker.number().numberBetween(1, 10));
        singl.setUmjetnik(umjetnik);
        session.save(singl);
        
        session.getTransaction().commit();    //END
  
    
    }
        public static int getRandomIntegerBetweenRange(int min, int max){
    int x = (int)(Math.random()*((max-min)+1))+min;
    return x;
  }
}
