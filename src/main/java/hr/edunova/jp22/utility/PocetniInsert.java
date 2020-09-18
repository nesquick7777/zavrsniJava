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
import hr.edunova.jp22.model.Pjesma;
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
        
        List<Clan> clanovi1 = new ArrayList<>();
         List<Clan> clanovi2 = new ArrayList<>();
        for(int i = 0;i<10;i++){
        Clan clan = new Clan();
        
        clan.setIme(faker.artist().name());
        clan.setPrezime(faker.name().lastName());
        clan.setDatumr(faker.date().birthday(18, 45));
        clan.setDatump(faker.date().birthday(2, 5));
        clan.setMjestor(faker.country().name());
        clan.setMjestop(faker.country().capital());
        clan.setBiljeske(faker.music().instrument());
        session.save(clan);
        
        if(i<5){
            clanovi1.add(clan);
        }
        if(i>5 && i<10){
            clanovi2.add(clan);
        }
        
        
        }
        session.getTransaction().commit(); //END
       
        session.beginTransaction();   //START
        
         Umjetnik umjetnik1 = new Umjetnik();
        umjetnik1.setIme(faker.rockBand().name());
        umjetnik1.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        umjetnik1.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        umjetnik1.setMjesto(faker.country().capital());
        umjetnik1.setDatumpocetka(faker.date().birthday(18, 45));
        umjetnik1.setDatumkraja(faker.date().birthday(2, 5));
        umjetnik1.setClanovi(clanovi1);
        session.save(umjetnik1);
        
        Umjetnik umjetnik2 = new Umjetnik();
        umjetnik2.setIme(faker.rockBand().name());
        umjetnik2.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        umjetnik2.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        umjetnik2.setMjesto(faker.country().capital());
        umjetnik2.setDatumpocetka(faker.date().birthday(18, 45));
        umjetnik2.setDatumkraja(faker.date().birthday(2, 5));
        umjetnik2.setClanovi(clanovi2);
        session.save(umjetnik2);
        
        session.getTransaction().commit();    //END
                
        
        session.beginTransaction();   //START
        
        Album album = new Album();
        album.setIme(faker.superhero().power());
        album.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        album.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        album.setDatumalbuma(faker.date().birthday(18, 45));
        album.setIzdavackakuca(faker.company().name());
        album.setOcjena(faker.number().numberBetween(1, 10));
        session.save(album);
        
        session.getTransaction().commit();    //END
        
        
        session.beginTransaction();   //START
        
        for(int i = 0;i<3;i++){
        Pjesma pjesma = new Pjesma();
        pjesma.setIme(faker.ancient().god());
        pjesma.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        pjesma.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        pjesma.setDatumsingla(faker.date().birthday(18, 45));
        pjesma.setIzdavackakuca(faker.company().name());
        pjesma.setOcjena(faker.number().numberBetween(1, 10));
        pjesma.setUmjetnik(umjetnik1);
        session.save(pjesma);
        }
        session.getTransaction().commit();    //END
  
    
    }
        public static int getRandomIntegerBetweenRange(int min, int max){
    int x = (int)(Math.random()*((max-min)+1))+min;
    return x;
  }
}
