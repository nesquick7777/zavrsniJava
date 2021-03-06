/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Bole
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnClanovi = new javax.swing.JButton();
        btnUmjetnici = new javax.swing.JButton();
        btnOdjava = new javax.swing.JButton();
        btnAlbumi = new javax.swing.JButton();
        btnPjesme = new javax.swing.JButton();
        pnlBtnAlbumi = new javax.swing.JPanel();
        pnlBtnOdjava = new javax.swing.JPanel();
        pnlBtnPjesme = new javax.swing.JPanel();
        pnlBtnClanovi = new javax.swing.JPanel();
        pnlBtnUmjetnici = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moja Diskografija");

        jPanel3.setBackground(new java.awt.Color(25, 35, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClanovi.setBackground(new java.awt.Color(0, 0, 102));
        btnClanovi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClanovi.setForeground(new java.awt.Color(255, 255, 255));
        btnClanovi.setText("Članovi");
        btnClanovi.setContentAreaFilled(false);
        btnClanovi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClanoviMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClanoviMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClanoviMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClanoviMouseReleased(evt);
            }
        });
        btnClanovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClanoviActionPerformed(evt);
            }
        });
        jPanel3.add(btnClanovi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 159, 30));

        btnUmjetnici.setBackground(new java.awt.Color(41, 57, 80));
        btnUmjetnici.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnUmjetnici.setForeground(new java.awt.Color(255, 255, 255));
        btnUmjetnici.setText("Umjetnici");
        btnUmjetnici.setContentAreaFilled(false);
        btnUmjetnici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUmjetniciMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUmjetniciMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUmjetniciMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUmjetniciMouseReleased(evt);
            }
        });
        btnUmjetnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmjetniciActionPerformed(evt);
            }
        });
        jPanel3.add(btnUmjetnici, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 159, 30));

        btnOdjava.setBackground(new java.awt.Color(0, 0, 102));
        btnOdjava.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnOdjava.setForeground(new java.awt.Color(255, 255, 255));
        btnOdjava.setText("Odjavite se");
        btnOdjava.setContentAreaFilled(false);
        btnOdjava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOdjavaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOdjavaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOdjavaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOdjavaMouseReleased(evt);
            }
        });
        btnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjavaActionPerformed(evt);
            }
        });
        jPanel3.add(btnOdjava, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 159, 30));

        btnAlbumi.setBackground(new java.awt.Color(0, 0, 102));
        btnAlbumi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAlbumi.setForeground(new java.awt.Color(255, 255, 255));
        btnAlbumi.setText("Albumi");
        btnAlbumi.setContentAreaFilled(false);
        btnAlbumi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlbumiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlbumiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlbumiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlbumiMouseReleased(evt);
            }
        });
        btnAlbumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumiActionPerformed(evt);
            }
        });
        jPanel3.add(btnAlbumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 159, 30));

        btnPjesme.setBackground(new java.awt.Color(41, 57, 80));
        btnPjesme.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnPjesme.setForeground(new java.awt.Color(255, 255, 255));
        btnPjesme.setText("Pjesme");
        btnPjesme.setContentAreaFilled(false);
        btnPjesme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPjesmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPjesmeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPjesmeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnPjesmeMouseReleased(evt);
            }
        });
        btnPjesme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPjesmeActionPerformed(evt);
            }
        });
        jPanel3.add(btnPjesme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 159, 30));

        pnlBtnAlbumi.setBackground(new java.awt.Color(25, 35, 51));

        javax.swing.GroupLayout pnlBtnAlbumiLayout = new javax.swing.GroupLayout(pnlBtnAlbumi);
        pnlBtnAlbumi.setLayout(pnlBtnAlbumiLayout);
        pnlBtnAlbumiLayout.setHorizontalGroup(
            pnlBtnAlbumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBtnAlbumiLayout.setVerticalGroup(
            pnlBtnAlbumiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(pnlBtnAlbumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 10, 30));

        pnlBtnOdjava.setBackground(new java.awt.Color(25, 35, 51));

        javax.swing.GroupLayout pnlBtnOdjavaLayout = new javax.swing.GroupLayout(pnlBtnOdjava);
        pnlBtnOdjava.setLayout(pnlBtnOdjavaLayout);
        pnlBtnOdjavaLayout.setHorizontalGroup(
            pnlBtnOdjavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBtnOdjavaLayout.setVerticalGroup(
            pnlBtnOdjavaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.add(pnlBtnOdjava, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 10, 30));

        pnlBtnPjesme.setBackground(new java.awt.Color(25, 35, 51));

        javax.swing.GroupLayout pnlBtnPjesmeLayout = new javax.swing.GroupLayout(pnlBtnPjesme);
        pnlBtnPjesme.setLayout(pnlBtnPjesmeLayout);
        pnlBtnPjesmeLayout.setHorizontalGroup(
            pnlBtnPjesmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlBtnPjesmeLayout.setVerticalGroup(
            pnlBtnPjesmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(pnlBtnPjesme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 30));

        pnlBtnClanovi.setBackground(new java.awt.Color(25, 35, 51));

        javax.swing.GroupLayout pnlBtnClanoviLayout = new javax.swing.GroupLayout(pnlBtnClanovi);
        pnlBtnClanovi.setLayout(pnlBtnClanoviLayout);
        pnlBtnClanoviLayout.setHorizontalGroup(
            pnlBtnClanoviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlBtnClanoviLayout.setVerticalGroup(
            pnlBtnClanoviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(pnlBtnClanovi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, 30));

        pnlBtnUmjetnici.setBackground(new java.awt.Color(25, 35, 51));

        javax.swing.GroupLayout pnlBtnUmjetniciLayout = new javax.swing.GroupLayout(pnlBtnUmjetnici);
        pnlBtnUmjetnici.setLayout(pnlBtnUmjetniciLayout);
        pnlBtnUmjetniciLayout.setHorizontalGroup(
            pnlBtnUmjetniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlBtnUmjetniciLayout.setVerticalGroup(
            pnlBtnUmjetniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(pnlBtnUmjetnici, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Moja Diskografija");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jPanel4.setBackground(new java.awt.Color(90, 88, 222));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(71, 120, 252));

        jPanel1.setBackground(new java.awt.Color(90, 88, 252));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(120, 168, 252));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjavaActionPerformed
        Autorizacija autorizacija = new Autorizacija();
        autorizacija.setLocationRelativeTo(null);

        autorizacija.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOdjavaActionPerformed

    private void btnClanoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClanoviActionPerformed
        Clanovi clanovi = new Clanovi();
        clanovi.setLocationRelativeTo(null);
        clanovi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClanoviActionPerformed

    private void btnUmjetniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmjetniciActionPerformed
        Umjetnici umjetnici = new Umjetnici();
        umjetnici.setLocationRelativeTo(null);
        umjetnici.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUmjetniciActionPerformed

    private void btnAlbumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumiActionPerformed

        Albumi albumi = new Albumi();

        albumi.setLocationRelativeTo(null);
        albumi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlbumiActionPerformed

    private void btnPjesmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPjesmeActionPerformed
        Pjesme pjesme = new Pjesme();
        pjesme.setLocationRelativeTo(null);
        pjesme.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPjesmeActionPerformed

    private void btnUmjetniciMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUmjetniciMouseEntered
        Color color = new Color(240, 240, 240);
        Color colorBtn = new Color(41,57,80);
        pnlBtnUmjetnici.setBackground(color);
        btnPjesme.setBackground(colorBtn);
    }//GEN-LAST:event_btnUmjetniciMouseEntered

    private void btnUmjetniciMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUmjetniciMouseExited
        Color color = new Color(25, 35, 51);
        pnlBtnUmjetnici.setBackground(color);
        btnPjesme.setBackground(color);
    }//GEN-LAST:event_btnUmjetniciMouseExited

    private void btnUmjetniciMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUmjetniciMousePressed
        Color color = new Color(35, 45, 61);
        btnUmjetnici.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnUmjetniciMousePressed

    private void btnUmjetniciMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUmjetniciMouseReleased
        Color color = new Color(25, 35, 51);
        btnUmjetnici.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnUmjetniciMouseReleased

    private void btnAlbumiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlbumiMouseEntered
        Color color = new Color(240, 240, 240);
        pnlBtnAlbumi.setBackground(color);
    }//GEN-LAST:event_btnAlbumiMouseEntered

    private void btnAlbumiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlbumiMouseExited
        Color color = new Color(25, 35, 51);
        pnlBtnAlbumi.setBackground(color);
    }//GEN-LAST:event_btnAlbumiMouseExited

    private void btnAlbumiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlbumiMousePressed
        Color color = new Color(35, 45, 61);
        btnAlbumi.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnAlbumiMousePressed

    private void btnAlbumiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlbumiMouseReleased
        Color color = new Color(25, 35, 51);
        btnAlbumi.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnAlbumiMouseReleased

    private void btnOdjavaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdjavaMouseEntered
        Color color = new Color(240, 240, 240);
        pnlBtnOdjava.setBackground(color);
    }//GEN-LAST:event_btnOdjavaMouseEntered

    private void btnOdjavaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdjavaMouseExited
        Color color = new Color(25, 35, 51);
        pnlBtnOdjava.setBackground(color);
    }//GEN-LAST:event_btnOdjavaMouseExited

    private void btnOdjavaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdjavaMousePressed
        Color color = new Color(35, 45, 61);
        btnOdjava.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnOdjavaMousePressed

    private void btnOdjavaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOdjavaMouseReleased
        Color color = new Color(25, 35, 51);
        btnOdjava.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnOdjavaMouseReleased

    private void btnClanoviMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClanoviMouseEntered
        Color color = new Color(240, 240, 240);
        pnlBtnClanovi.setBackground(color);
    }//GEN-LAST:event_btnClanoviMouseEntered

    private void btnClanoviMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClanoviMouseExited
        Color color = new Color(25, 35, 51);
        pnlBtnClanovi.setBackground(color);
    }//GEN-LAST:event_btnClanoviMouseExited

    private void btnClanoviMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClanoviMousePressed
        Color color = new Color(35, 45, 61);
        btnClanovi.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnClanoviMousePressed

    private void btnClanoviMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClanoviMouseReleased
        Color color = new Color(25, 35, 51);
        btnClanovi.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnClanoviMouseReleased

    private void btnPjesmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPjesmeMouseEntered
        Color color = new Color(240, 240, 240);
        pnlBtnPjesme.setBackground(color);
    }//GEN-LAST:event_btnPjesmeMouseEntered

    private void btnPjesmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPjesmeMouseExited
        Color color = new Color(25, 35, 51);
        pnlBtnPjesme.setBackground(color);
    }//GEN-LAST:event_btnPjesmeMouseExited

    private void btnPjesmeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPjesmeMousePressed
        Color color = new Color(35, 45, 61);
        btnPjesme.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnPjesmeMousePressed

    private void btnPjesmeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPjesmeMouseReleased
        Color color = new Color(25, 35, 51);
        btnPjesme.setBorder(BorderFactory.createLineBorder(color));
    }//GEN-LAST:event_btnPjesmeMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Izbornik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlbumi;
    private javax.swing.JButton btnClanovi;
    private javax.swing.JButton btnOdjava;
    private javax.swing.JButton btnPjesme;
    private javax.swing.JButton btnUmjetnici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pnlBtnAlbumi;
    private javax.swing.JPanel pnlBtnClanovi;
    private javax.swing.JPanel pnlBtnOdjava;
    private javax.swing.JPanel pnlBtnPjesme;
    private javax.swing.JPanel pnlBtnUmjetnici;
    // End of variables declaration//GEN-END:variables
}
