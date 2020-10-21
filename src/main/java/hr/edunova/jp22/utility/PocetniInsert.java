/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.utility;

import com.github.javafaker.Faker;
import hr.edunova.jp22.controller.ObradaOperater;
import hr.edunova.jp22.model.Clan;
import hr.edunova.jp22.model.Umjetnik;
import hr.edunova.jp22.model.Album;
import hr.edunova.jp22.model.Operater;
import hr.edunova.jp22.model.Pjesma;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Bole
 */
public class PocetniInsert {

    public static void izvedi() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Operater operater = new Operater();
        operater.setIme("Bojan");
        operater.setPrezime("Drezgic");
        operater.setUloga("oper");
        operater.setEmail("nesquick7777@gmail.com");
        operater.setLozinka(BCrypt.hashpw("n", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (EdunovaException ex) {
            ex.printStackTrace();
        }

        Faker faker = new Faker();
        String[] zanr = {"Rock", "Country", "Metal", "Pop"};
        String[] podZanr = {"Progressive"};

        session.beginTransaction();   //START

        List<Clan> clanovi1 = new ArrayList<>();
        List<Clan> clanovi2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Clan clan = new Clan();

            clan.setIme(faker.artist().name());
            clan.setPrezime(faker.name().lastName());
            clan.setDatumr(new Date());
            clan.setDatump(new Date());
            clan.setMjestor(faker.country().name());
            clan.setMjestop(faker.country().capital());
            clan.setBiljeske(faker.music().instrument());
            session.save(clan);

            if (i <= 5) {
                clanovi1.add(clan);
            }
            if (i > 5 && i < 10) {
                clanovi2.add(clan);
            }

        }
        session.getTransaction().commit(); //END

        session.beginTransaction();   //START

        List<Pjesma> pjesme1 = new ArrayList<>();
        List<Pjesma> pjesme2 = new ArrayList<>();
        int zbrojS1 = 0;
        int zbrojS2 = 0;

        for (int i = 0; i < 15; i++) {
            int br1 = faker.number().numberBetween(1, 9);
            int br2 = faker.number().numberBetween(1, 6);
            int br3 = faker.number().numberBetween(1, 9);

            Pjesma pjesma = new Pjesma();
            pjesma.setIme(faker.ancient().hero());
            pjesma.setTrajanje("00:0" + br1 + ":" + br2 + br3);
            session.save(pjesma);

            if (i <= 5) {
                pjesme1.add(pjesma);
                zbrojS1 += (br1 * 60) + (br2 * 10) + br3;
            }
            if (i > 5 && i < 15) {
                pjesme2.add(pjesma);
                zbrojS2 += (br1 * 60) + (br2 * 10) + br3;
            }

        }

        int p1 = zbrojS1 % 60;
        int p2 = zbrojS1 / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        String duzinaT = duzina(p2, p3, p1);

        int p4 = zbrojS2 % 60;
        int p5 = zbrojS2 / 60;
        int p6 = p5 % 60;
        p5 = p5 / 60;
        String duzinaT2 = duzina(p5, p6, p4);

        session.getTransaction().commit();    //END

        session.beginTransaction();   //START

        List<Album> albumi1 = new ArrayList<>();
        List<Album> albumi2 = new ArrayList<>();

        Album album = new Album();
        album.setIme(faker.superhero().power());
        album.setZanr(zanr[getRandomIntegerBetweenRange(0, 3)]);
        album.setPodzanr(podZanr[getRandomIntegerBetweenRange(0, 0)]);
        album.setDatumalbuma(new Date());
        album.setIzdavackakuca(faker.company().name());
        album.setOcjena(faker.number().numberBetween(1, 10));
        album.setPjesme(pjesme1);
        album.setTrajanje(duzinaT);
        album.setVrsta(vrstaA(zbrojS1));
        session.save(album);
        albumi1.add(album);

        Album album2 = new Album();
        album2.setIme(faker.superhero().power());
        album2.setZanr(zanr[getRandomIntegerBetweenRange(0, 3)]);
        album2.setPodzanr(podZanr[getRandomIntegerBetweenRange(0, 0)]);
        album2.setDatumalbuma(new Date());
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
        umjetnik1.setZanr(zanr[getRandomIntegerBetweenRange(0, 3)]);
        umjetnik1.setPodzanr(podZanr[getRandomIntegerBetweenRange(0, 0)]);
        umjetnik1.setMjesto(faker.country().capital());
        umjetnik1.setDatumpocetka(new Date());
        umjetnik1.setDatumkraja(new Date());
        umjetnik1.setClanovi(clanovi1);
        umjetnik1.setAlbumi(albumi1);
        session.save(umjetnik1);

        Umjetnik umjetnik2 = new Umjetnik();
        umjetnik2.setIme(faker.rockBand().name());
        umjetnik2.setZanr(zanr[getRandomIntegerBetweenRange(0, 3)]);
        umjetnik2.setPodzanr(podZanr[getRandomIntegerBetweenRange(0, 0)]);
        umjetnik2.setMjesto(faker.country().capital());
        umjetnik2.setDatumpocetka(new Date());
        umjetnik2.setDatumkraja(new Date());
        umjetnik2.setClanovi(clanovi2);
        umjetnik2.setAlbumi(albumi2);
        session.save(umjetnik2);

        session.getTransaction().commit();    //END

    }
//    session.beginTransaction();   //START

    public static void adminOperater() {

        Operater operater = new Operater();
        operater.setIme("Moja");
        operater.setPrezime("Diskografija");
        operater.setUloga("admin");
        operater.setEmail("mDiskografija@mDiskografija.hr");
        operater.setLozinka(BCrypt.hashpw("z", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (EdunovaException ex) {
            ex.printStackTrace();
        }

    }

//     session.getTransaction().commit();    //END
    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public static String duzina(int br1, int br2, int br3) {
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);
        // Print some output: goes to your special stream
        String bro1 = Integer.toString(br1);
        String bro2 = Integer.toString(br2);
        String bro3 = Integer.toString(br3);

        if (bro1.length() == 1) {
            bro1 = "0" + bro1;
        } else {
            bro1 = bro1;
        }

        if (bro2.length() == 1) {
            bro2 = "0" + bro2;
        } else {
            bro2 = bro2;
        }

        if (bro3.length() == 1) {
            bro3 = "0" + bro3;
        } else {
            bro3 = bro3;
        }

        if (bro1.length() > 2) {
            bro1 = "99";
            JOptionPane.showMessageDialog(null, " Prekoračili ste limit duzine trajanja albuma od 99 sata, postavljena maksimalna vrijednost. ");
        }

        if ("00".equals(bro1) && "00".equals(bro2) && "00".equals(bro3)) {
            bro3 = "01";
            JOptionPane.showMessageDialog(null, "Niste unijeli duzinu trajanja pjesme ili albuma. Postavljena minimalna vrijednost.");
        }

        System.out.printf(bro1 + ":" + bro2 + ":" + bro3);
        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        //System.out.println("Here: " + baos.toString());
        return baos.toString();
    }

    public static String vrstaA(int sekunde) {
        if (sekunde <= 900) {
            return "Singl";
        } else if (sekunde <= 1800) {
            return "EP";
        } else {
            return "LP";
        }
    }

}
