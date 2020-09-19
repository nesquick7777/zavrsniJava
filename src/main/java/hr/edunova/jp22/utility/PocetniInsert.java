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
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
        
        List<Pjesma> pjesme1 = new ArrayList<>();
        List<Pjesma> pjesme2 = new ArrayList<>();
        int zbrojS1 = 0;
        int zbrojS2 = 0;
        
        
        for(int i = 0;i<15;i++){
        int br1 = faker.number().numberBetween(1, 9);
        int br2 = faker.number().numberBetween(1, 6);
        
        
        Pjesma pjesma = new Pjesma();
        pjesma.setIme(faker.ancient().hero());
        pjesma.setTrajanje("0" + br1 + ":" + br2 + br1);
        session.save(pjesma);
        
        if(i<5){
            pjesme1.add(pjesma);
            zbrojS1 += (br1 * 60) + (br2 * 10) + br1;
        }
        if(i>5 && i<15){
            pjesme2.add(pjesma);
            zbrojS2 += (br1 * 60) + (br2 * 10) + br1;
        }
        

        
        }
        
        int p1 = zbrojS1 % 60;
        int p2 = zbrojS1 / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        String duzinaT = duzina( p2, p3, p1);
        
        int p4 = zbrojS2 % 60;
        int p5 = zbrojS2 / 60;
        int p6 = p5 % 60;
        p5 = p5 / 60;
        String duzinaT2 = duzina( p5, p6, p4);
        
        session.getTransaction().commit();    //END
        
        
        
                session.beginTransaction();   //START
        
        List<Album> albumi1 = new ArrayList<>();
        List<Album> albumi2 = new ArrayList<>();
         
        Album album = new Album();
        album.setIme(faker.superhero().power());
        album.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        album.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        album.setDatumalbuma(faker.date().birthday(18, 45));
        album.setIzdavackakuca(faker.company().name());
        album.setOcjena(faker.number().numberBetween(1, 10));
        album.setPjesme(pjesme1);
        album.setTrajanje(duzinaT);
        album.setVrsta(vrstaA(zbrojS1));
        session.save(album);
        albumi1.add(album);
        
        Album album2 = new Album();
        album2.setIme(faker.superhero().power());
        album2.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        album2.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        album2.setDatumalbuma(faker.date().birthday(18, 45));
        album2.setIzdavackakuca(faker.company().name());
        album2.setOcjena(faker.number().numberBetween(1, 10));
        album2.setPjesme(pjesme2);
        album2.setTrajanje(duzinaT2);
        album2.setVrsta(vrstaA(zbrojS2));
        session.save(album2);
        albumi2.add(album2);
        
        session.getTransaction().commit();    //END
       
        session.beginTransaction();   //START
        
        Umjetnik umjetnik1 = new Umjetnik();
        umjetnik1.setIme(faker.rockBand().name());
        umjetnik1.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        umjetnik1.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        umjetnik1.setMjesto(faker.country().capital());
        umjetnik1.setDatumpocetka(faker.date().birthday(18, 45));
        umjetnik1.setDatumkraja(faker.date().birthday(2, 5));
        umjetnik1.setClanovi(clanovi1);
        umjetnik1.setAlbumi(albumi1);
        session.save(umjetnik1);
        
        Umjetnik umjetnik2 = new Umjetnik();
        umjetnik2.setIme(faker.rockBand().name());
        umjetnik2.setZanr(zanr[getRandomIntegerBetweenRange(0,9)]);
        umjetnik2.setPodzanr(podZanr[getRandomIntegerBetweenRange(0,4)]);
        umjetnik2.setMjesto(faker.country().capital());
        umjetnik2.setDatumpocetka(faker.date().birthday(18, 45));
        umjetnik2.setDatumkraja(faker.date().birthday(2, 5));
        umjetnik2.setClanovi(clanovi2);
        umjetnik2.setAlbumi(albumi2);
        session.save(umjetnik2);
        
        session.getTransaction().commit();    //END
                
       
    }
        public static int getRandomIntegerBetweenRange(int min, int max){
    int x = (int)(Math.random()*((max-min)+1))+min;
    return x;
  }
        
        
        public static String duzina(int br1, int br2, int br3){
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        System.out.printf("%d:%d:%d", br1, br2, br3);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());
        return baos.toString();
        }
        
        public static String vrstaA(int sekunde){
            if(sekunde <= 900){
                return "Singl";
            } else if(sekunde <= 1800){
                return "EP";
            }else{
                return "LP";}
        }
}
