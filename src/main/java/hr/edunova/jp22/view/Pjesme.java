/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.LOCK;
import hr.edunova.jp22.AudioFilePlayer.Pause;
import hr.edunova.jp22.AudioFilePlayer.Tuna;
import hr.edunova.jp22.AudioFilePlayer.Unpaused;
import hr.edunova.jp22.controller.ObradaAlbum;
import hr.edunova.jp22.controller.ObradaPjesma;
import hr.edunova.jp22.model.Album;
import hr.edunova.jp22.model.Pjesma;
import hr.edunova.jp22.utility.EdunovaException;
import static hr.edunova.jp22.utility.PocetniInsert.duzina;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.getPut;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.lineMain;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.maksimumSekunde;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.min;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.minutes;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.sec;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.seconds;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.setVolumeDown;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.title1;
import static hr.edunova.jp22.AudioFilePlayer.AudioFilePlayer.trajanjeSekunde;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.sound.sampled.AudioSystem.getLine;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bole
 */
public class Pjesme extends javax.swing.JFrame {

    public static trajanjePjesme timer1;
    public static boolean test = true;
    private ObradaPjesma obrada;
    private ObradaAlbum obradaA;
    private Pjesma entitet;
    private Album entitetA;
    public static boolean isPlaying = false;
    AudioFilePlayer player = new AudioFilePlayer();
    Thread t1;

    /**
     * Creates new form Pjesma
     */
    public Pjesme() {
        initComponents();
        lstPjesme.setCellRenderer(new PjesmaCellRenderer());
        obrada = new ObradaPjesma();
        obradaA = new ObradaAlbum();
        ucitajPodatke();
        txtIme.setDocument(new JTextFieldLimit(50));
        txtTrajanje.setDocument(new JTextFieldLimit(2));
        txtTrajanje2.setDocument(new JTextFieldLimit(2));
        txtTrajanje1.setDocument(new JTextFieldLimit(2));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnNazad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPjesme = new javax.swing.JList<>();
        jPanel = new javax.swing.JPanel();
        txtIme = new javax.swing.JTextField();
        txtTrajanje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtTrajanje2 = new javax.swing.JTextField();
        txtTrajanje1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblStop = new javax.swing.JLabel();
        lblPokreni = new javax.swing.JLabel();
        lblPause = new javax.swing.JLabel();
        btnDodajPjesmu = new javax.swing.JButton();
        txtDodajPath = new javax.swing.JTextField();
        pBarTrajanjePjesme = new javax.swing.JProgressBar();
        lblVrijemeProgresa = new javax.swing.JLabel();
        lblUkupnoVrijeme = new javax.swing.JLabel();
        lblImePjesme = new javax.swing.JLabel();
        sliderGlasnoca = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pjesme");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));

        btnNazad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnNazad.setText("Idi nazad");
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        lstPjesme.setForeground(new java.awt.Color(0, 0, 153));
        lstPjesme.setToolTipText("");
        lstPjesme.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPjesmeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPjesme);

        jPanel.setBackground(new java.awt.Color(0, 0, 153));

        txtTrajanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrajanjeKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Podatci:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ime:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trajanje:");

        btnDodaj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        txtTrajanje2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrajanje2KeyTyped(evt);
            }
        });

        txtTrajanje1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrajanje1KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(":");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");

        lblStop.setForeground(new java.awt.Color(255, 255, 255));
        lblStop.setText("Stop");
        lblStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStopMouseClicked(evt);
            }
        });

        lblPokreni.setForeground(new java.awt.Color(255, 255, 255));
        lblPokreni.setText("Play");
        lblPokreni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPokreniMouseClicked(evt);
            }
        });

        lblPause.setForeground(new java.awt.Color(255, 255, 255));
        lblPause.setText("Pause");
        lblPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPauseMouseClicked(evt);
            }
        });

        btnDodajPjesmu.setText("Dodaj");
        btnDodajPjesmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajPjesmuActionPerformed(evt);
            }
        });

        txtDodajPath.setEditable(false);

        lblVrijemeProgresa.setForeground(new java.awt.Color(255, 255, 255));
        lblVrijemeProgresa.setText("0:0");

        lblUkupnoVrijeme.setForeground(new java.awt.Color(255, 255, 255));
        lblUkupnoVrijeme.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUkupnoVrijeme.setText("0:0");

        lblImePjesme.setForeground(new java.awt.Color(255, 255, 255));
        lblImePjesme.setText("Now playing...");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIme)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTrajanje1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTrajanje2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDodajPath)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUkupnoVrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPause, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblVrijemeProgresa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblImePjesme, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pBarTrajanjePjesme, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDodajPjesmu))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPokreni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(btnPromjeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObrisi))
                            .addComponent(lblStop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrajanje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTrajanje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDodajPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDodajPjesmu))
                        .addGap(149, 149, 149))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(lblImePjesme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pBarTrajanjePjesme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVrijemeProgresa)
                            .addComponent(lblUkupnoVrijeme))
                        .addGap(26, 26, 26)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPause)
                            .addComponent(lblStop)
                            .addComponent(lblPokreni))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObrisi))
                .addGap(19, 19, 19))
        );

        sliderGlasnoca.setMaximum(16);
        sliderGlasnoca.setOrientation(javax.swing.JSlider.VERTICAL);
        sliderGlasnoca.setPaintTicks(true);
        sliderGlasnoca.setValue(1);
        sliderGlasnoca.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderGlasnocaStateChanged(evt);
            }
        });
        sliderGlasnoca.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                sliderGlasnocaMouseWheelMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sliderGlasnoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNazad)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(sliderGlasnoca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNazadActionPerformed
        Thread t = new Thread(new Tuna());
        t.start();
        isPlaying = false;        
        Izbornik izbornik = new Izbornik();
        izbornik.setLocationRelativeTo(null);
        izbornik.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNazadActionPerformed

    private void lstPjesmeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPjesmeValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        entitet = lstPjesme.getSelectedValue();
        if (entitet == null) {
            return;
        }
        txtIme.setText(entitet.getIme());
        txtDodajPath.setText(entitet.getPutDoPjesme());
        txtTrajanje.setText(entitet.getTrajanje().substring(0, 2));
        txtTrajanje1.setText(entitet.getTrajanje().substring(3, 5));
        txtTrajanje2.setText(entitet.getTrajanje().substring(6, 8));
    }//GEN-LAST:event_lstPjesmeValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new Pjesma();
        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        entitet = lstPjesme.getSelectedValue();
        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Niste izabrali pjesmu.");
            return;
        }

        try {
            postaviVrijednostiUEntitet();
            obrada.update();
            ucitajPodatke();
            ocistiPolja();

        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        }

        List<Album> m = new ArrayList<>();
        obradaA.getPodaci().forEach(s -> m.add(s));

        for (int i = 0; i < m.size(); i++) {
            entitetA = m.get(i);
            List<Pjesma> n = new ArrayList<>();
            n = entitetA.getPjesme();
            int zbrojS1 = 0;
            for (int j = 0; j < entitetA.getPjesme().size(); j++) {
                entitet = n.get(j);

                String broj1 = entitet.getTrajanje().substring(0, 2);
                String broj2 = entitet.getTrajanje().substring(3, 5);
                String broj3 = entitet.getTrajanje().substring(6, 8);
                int br1 = Integer.parseInt(broj1);
                int br2 = Integer.parseInt(broj2);
                int br3 = Integer.parseInt(broj3);

                int br4 = br1;
                br1 = br2;
                br2 = br3 / 10;
                br3 = br3 % 10;
                zbrojS1 += (br4 * 60 * 60) + (br1 * 60) + (br2 * 10) + br3;
            }

            int p1 = zbrojS1 % 60;
            int p2 = zbrojS1 / 60;
            int p3 = p2 % 60;
            p2 = p2 / 60;
            String duzinaT = duzina(p2, p3, p1);
            entitetA.setTrajanje(duzinaT);
            obradaA.setEntitet(entitetA);

            try {
                obradaA.update();
            } catch (EdunovaException e) {
                System.out.println(e.getPoruka());
            }
        }
        obradaA = new ObradaAlbum();
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstPjesme.getSelectedValue();
        if (entitet == null) {
            JOptionPane.showMessageDialog(null, "Niste izabrali pjesmu.");
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(null, ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void txtTrajanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrajanjeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTrajanjeKeyTyped

    private void txtTrajanje1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrajanje1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTrajanje1KeyTyped

    private void txtTrajanje2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrajanje2KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTrajanje2KeyTyped
    public static boolean Finished() {
        return isPlaying = false;
    }

    private void lblPokreniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPokreniMouseClicked
        if (txtDodajPath.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Dodajte put do pjesme");
            return;
        }
        if (!(txtDodajPath.getText().endsWith(".mp3"))) {
            JOptionPane.showMessageDialog(null, "Krivi format");
            return;
        }
            
        Thread unpause = new Thread(new Unpaused());
        unpause.start();

        if (!isPlaying) {
            t1 = new Thread(new AudioFilePlayer());
            getPut(txtDodajPath.getText());
            t1.start();
            isPlaying = true;
        }
        timer1 = new trajanjePjesme();
        timer1.start();
    }//GEN-LAST:event_lblPokreniMouseClicked

    private void lblStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStopMouseClicked

        Thread t = new Thread(new Tuna());
        t.start();
        isPlaying = false;
    }//GEN-LAST:event_lblStopMouseClicked

    private void lblPauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPauseMouseClicked
        Thread t = new Thread(new Pause());
        t.start();
    }//GEN-LAST:event_lblPauseMouseClicked

    private void btnDodajPjesmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajPjesmuActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Audio Files", "mp3", "png", "gif", "jpeg");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(jPanel);
        File f = chooser.getSelectedFile();
        if (f == null) {
            return;
        }
        String filename = f.getAbsolutePath();
        txtDodajPath.setText(filename);

    }//GEN-LAST:event_btnDodajPjesmuActionPerformed

    private void sliderGlasnocaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderGlasnocaStateChanged
        if (isPlaying == false) {
            return;
        }
        setVolumeDown(sliderGlasnoca.getValue());
    }//GEN-LAST:event_sliderGlasnocaStateChanged

    private void sliderGlasnocaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_sliderGlasnocaMouseWheelMoved
        int notches = evt.getWheelRotation();

        if (notches < 0) {
            sliderGlasnoca.setValue(sliderGlasnoca.getValue() + 1);
        } else if (notches > 0) {
            sliderGlasnoca.setValue(sliderGlasnoca.getValue() - 1);
        }
    }//GEN-LAST:event_sliderGlasnocaMouseWheelMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajPjesmu;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImePjesme;
    private javax.swing.JLabel lblPause;
    private javax.swing.JLabel lblPokreni;
    private javax.swing.JLabel lblStop;
    private javax.swing.JLabel lblUkupnoVrijeme;
    private javax.swing.JLabel lblVrijemeProgresa;
    private javax.swing.JList<Pjesma> lstPjesme;
    private javax.swing.JProgressBar pBarTrajanjePjesme;
    public static javax.swing.JSlider sliderGlasnoca;
    private javax.swing.JTextField txtDodajPath;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtTrajanje;
    private javax.swing.JTextField txtTrajanje1;
    private javax.swing.JTextField txtTrajanje2;
    // End of variables declaration//GEN-END:variables

    public class trajanjePjesme extends Thread {

        public void run() {
            pBarTrajanjePjesme.setMinimum(0);
            pBarTrajanjePjesme.setMaximum(maksimumSekunde);
            pBarTrajanjePjesme.setValue(0);
            synchronized(LOCK){
                try {
                    LOCK.wait(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Pjesme.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = trajanjeSekunde; i < maksimumSekunde;) {
                lblUkupnoVrijeme.setText(min + ":" + sec);
                lblImePjesme.setText(title1);
                pBarTrajanjePjesme.setValue(trajanjeSekunde);
                lblVrijemeProgresa.setText(minutes + ":" + seconds);

            }
        }
    }

    private void ucitajPodatke() {

        DefaultListModel<Pjesma> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        lstPjesme.setModel(m);

    }

    private void ocistiPolja() {
        txtIme.setText("");
        txtDodajPath.setText("");
        txtTrajanje.setText("");
        txtTrajanje1.setText("");
        txtTrajanje2.setText("");
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setIme(txtIme.getText());
        entitet.setPutDoPjesme(txtDodajPath.getText());
        String broj1 = "0";
        String broj2 = "0";
        String broj3 = "0";
        if (txtTrajanje.getText().isEmpty()) {
            broj1 = "0";
        } else {
            broj1 = txtTrajanje.getText();
        }
        if (txtTrajanje1.getText().isEmpty()) {
            broj2 = "0";
        } else {
            broj2 = txtTrajanje1.getText();
        }
        if (txtTrajanje2.getText().isEmpty()) {
            broj3 = "0";
        } else {
            broj3 = txtTrajanje2.getText();
        }
        int zbrojS1 = 0;
        int br1 = Integer.parseInt(broj1);
        int br2 = Integer.parseInt(broj2);
        int br3 = Integer.parseInt(broj3);

        int br4 = br1;
        br1 = br2;
        br2 = br3 / 10;
        br3 = br3 % 10;
        zbrojS1 += (br4 * 60 * 60) + (br1 * 60) + (br2 * 10) + br3;

        int p1 = zbrojS1 % 60;
        int p2 = zbrojS1 / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        String duzinaTr = duzina(p2, p3, p1);

        entitet.setTrajanje(duzinaTr);
        obrada.setEntitet(entitet);

    }

}
