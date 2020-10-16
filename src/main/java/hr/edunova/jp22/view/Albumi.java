/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.sun.source.tree.SwitchExpressionTree;
import hr.edunova.jp22.controller.ObradaAlbum;
import hr.edunova.jp22.model.Album;
import hr.edunova.jp22.utility.EdunovaException;
import hr.edunova.jp22.utility.StarRater;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Bole
 */
public class Albumi extends javax.swing.JFrame {

    private ObradaAlbum obrada;
    private Album entitet;

    /**
     * Creates new form Albumi
     */
    public Albumi() {
        initComponents();

        lstAlbumi.setCellRenderer(new AlbumCellRenderer());
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("yyyy-MM-dd");
        dpiDatumA.setSettings(dps);

        obrada = new ObradaAlbum();

        ucitajPodatke();
        txtIme.setDocument(new JTextFieldLimit(50));
        txtIzdavackaK.setDocument(new JTextFieldLimit(50));
        
        cmbZanr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (cmbZanr.getItemAt(cmbZanr.getSelectedIndex())) {
                    case "Blues":
                        String[] array1 = {"Comedy", "lol"};
                        DefaultComboBoxModel model1 = new DefaultComboBoxModel(array1);
                        cmbPodzanr.setModel(model1);
                        break;
                    case "Metal":
                        String[] array2 = {"Noo", "ye"};
                        DefaultComboBoxModel model2 = new DefaultComboBoxModel(array2);
                        cmbPodzanr.setModel(model2);
                        break;
                    case "Hip Hop":
                        String[] array3 = {"soo", "ye"};
                        DefaultComboBoxModel model3 = new DefaultComboBoxModel(array3);
                        cmbPodzanr.setModel(model3);
                        break;
                    case "Folk":
                        String[] array4 = {"1Noo", "ye"};
                        DefaultComboBoxModel model4 = new DefaultComboBoxModel(array4);
                        cmbPodzanr.setModel(model4);
                        break;
                    case "Jazz":
                        String[] array5 = {"N22oo", "ye"};
                        DefaultComboBoxModel model5 = new DefaultComboBoxModel(array5);
                        cmbPodzanr.setModel(model5);
                        break;
                    case "Pop":
                        String[] array6 = {"No44o", "ye"};
                        DefaultComboBoxModel model6 = new DefaultComboBoxModel(array6);
                        cmbPodzanr.setModel(model6);
                        break;
                    case "Punk":
                        String[] array7 = {"No55o", "ye"};
                        DefaultComboBoxModel model7 = new DefaultComboBoxModel(array7);
                        cmbPodzanr.setModel(model7);
                        break;
                    case "Rock":
                        String[] array8 = {"No66o", "ye"};
                        DefaultComboBoxModel model8 = new DefaultComboBoxModel(array8);
                        cmbPodzanr.setModel(model8);
                        break;
                    case "EDM":
                        String[] array9 = {"Noo", "ye"};
                        DefaultComboBoxModel model9 = new DefaultComboBoxModel(array9);
                        cmbPodzanr.setModel(model9);
                        break;
                    case "Country":
                        String[] array10 = {"Noo", "ye"};
                        DefaultComboBoxModel model10 = new DefaultComboBoxModel(array10);
                        cmbPodzanr.setModel(model10);
                        break;
                    case "Classical Music":
                        String[] array11 = {"Noo", "ye"};
                        DefaultComboBoxModel model11 = new DefaultComboBoxModel(array11);
                        cmbPodzanr.setModel(model11);
                        break;
                    default:
                        String[] array12 = {""};
                        DefaultComboBoxModel model12 = new DefaultComboBoxModel(array12);
                        cmbPodzanr.setModel(model12);
                        break;
                }
            }
        });

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
        lstAlbumi = new javax.swing.JList<>();
        jPanel = new javax.swing.JPanel();
        txtIme = new javax.swing.JTextField();
        txtIzdavackaK = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtTrajanje = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dpiDatumA = new com.github.lgooddatepicker.components.DatePicker();
        starRater1 = new hr.edunova.jp22.utility.StarRater();
        txtTrajanje1 = new javax.swing.JTextField();
        txtTrajanje2 = new javax.swing.JTextField();
        cmbZanr = new javax.swing.JComboBox<>();
        cmbPodzanr = new javax.swing.JComboBox<>();
        cmbVrsta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Albumi");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));

        btnNazad.setText("Idi nazad");
        btnNazad.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNazadActionPerformed(evt);
            }
        });

        lstAlbumi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lstAlbumi.setForeground(new java.awt.Color(0, 0, 153));
        lstAlbumi.setToolTipText("");
        lstAlbumi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAlbumiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstAlbumi);

        jPanel.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setText("Podatci:");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Ime:");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Ocjena:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Datum albuma:");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Zanr:");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Izdavačka kuća:");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Podzanr:");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Vrsta:");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        btnDodaj.setText("Dodaj");
        btnDodaj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        txtTrajanje.setEditable(false);

        jLabel9.setText("Trajanje:");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        dpiDatumA.setBackground(new java.awt.Color(0, 0, 153));

        txtTrajanje1.setEditable(false);

        txtTrajanje2.setEditable(false);

        cmbZanr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blues", "Metal", "Hip Hop", "Folk", "Jazz", "Pop", "Punk", "Rock", "EDM", "Country", "Classical Music" }));
        cmbZanr.setToolTipText("");

        cmbVrsta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LP", "EP", "Mixtape", "Kompilacija", "Singl" }));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(starRater1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIme)
                    .addComponent(txtIzdavackaK)
                    .addComponent(dpiDatumA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTrajanje1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTrajanje2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbZanr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbPodzanr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbVrsta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(starRater1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpiDatumA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbZanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPodzanr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIzdavackaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrajanje1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrajanje2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjeni)
                    .addComponent(btnObrisi))
                .addGap(19, 19, 19))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNazad)
                .addGap(19, 19, 19))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Izbornik izbornik = new Izbornik();
        izbornik.setLocationRelativeTo(null);
        izbornik.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNazadActionPerformed

    private void lstAlbumiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAlbumiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstAlbumi.getSelectedValue();
        if (entitet == null) {
            return;
        }

        if (entitet.getDatumalbuma() != null) {
            dpiDatumA.setDate(entitet.getDatumalbuma().toInstant()
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate());
        }

        txtIme.setText(entitet.getIme());
        starRater1.setSelection(0);
        starRater1.setRating(entitet.getOcjena());
        cmbZanr.setSelectedItem(entitet.getZanr());
        cmbPodzanr.setSelectedItem(entitet.getPodzanr());
        txtIzdavackaK.setText(entitet.getIzdavackakuca());
        cmbVrsta.setSelectedItem(entitet.getVrsta());
        txtTrajanje.setText(entitet.getTrajanje().substring(0, 2));
        txtTrajanje1.setText(entitet.getTrajanje().substring(3, 5));
        txtTrajanje2.setText(entitet.getTrajanje().substring(6, 8));


    }//GEN-LAST:event_lstAlbumiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet = new Album();
        try {
            postaviVrijednostiUEntitet();
        } catch (ParseException ex) {
            Logger.getLogger(Albumi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (EdunovaException ex) {

        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        entitet = lstAlbumi.getSelectedValue();
        if (entitet == null) {
            return;
        }

        try {
            postaviVrijednostiUEntitet();
        } catch (ParseException ex) {
            Logger.getLogger(Albumi.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            obrada.update();
            ucitajPodatke();
            ocistiPolja();

        } catch (EdunovaException e) {
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstAlbumi.getSelectedValue();
        if (entitet == null) {
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();
        } catch (EdunovaException e) {
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnNazad;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<String> cmbPodzanr;
    private javax.swing.JComboBox<String> cmbVrsta;
    private javax.swing.JComboBox<String> cmbZanr;
    private com.github.lgooddatepicker.components.DatePicker dpiDatumA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Album> lstAlbumi;
    private hr.edunova.jp22.utility.StarRater starRater1;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtIzdavackaK;
    private javax.swing.JTextField txtTrajanje;
    private javax.swing.JTextField txtTrajanje1;
    private javax.swing.JTextField txtTrajanje2;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {

        DefaultListModel<Album> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s -> m.addElement(s));
        lstAlbumi.setModel(m);

    }

    private void ocistiPolja() {
        txtIme.setText("");
        starRater1.setRating(0);
        starRater1.setSelection(0);
        dpiDatumA.setDateToToday();
        cmbZanr.setSelectedIndex(0);
        cmbPodzanr.setSelectedIndex(0);
        txtIzdavackaK.setText("");
        cmbVrsta.setSelectedIndex(0);
        txtTrajanje.setText("");
        txtTrajanje1.setText("");
        txtTrajanje2.setText("");
    }

    private void postaviVrijednostiUEntitet() throws ParseException {

        entitet.setIme(txtIme.getText());

        if (starRater1.getSelection() == 0) {
            entitet.setOcjena(entitet.getOcjena());
        } else {
            entitet.setOcjena(starRater1.getSelection());
        }
        if (dpiDatumA.getDate() != null) {
            entitet.setDatumalbuma(Date.from(dpiDatumA.getDate().atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()));
        }
        entitet.setZanr((String) cmbZanr.getSelectedItem());
        entitet.setPodzanr((String) cmbPodzanr.getSelectedItem());
        entitet.setIzdavackakuca(txtIzdavackaK.getText());
        entitet.setVrsta((String) cmbVrsta.getSelectedItem());

        obrada.setEntitet(entitet);

    }

}
