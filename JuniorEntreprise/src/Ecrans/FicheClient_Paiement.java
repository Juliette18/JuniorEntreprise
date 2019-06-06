/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecrans;

import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Niakulu
 */
public class FicheClient_Paiement extends javax.swing.JFrame {

    /**
     * Creates new form FicheClient
     */
    public FicheClient_Paiement() {
        initComponents();
        this.setVisible(true);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_Menu5 = new javax.swing.JPanel();
        pan_Profil5 = new javax.swing.JPanel();
        lbl_NomUtilisateur5 = new javax.swing.JLabel();
        lbl_prenomUtilisateur5 = new javax.swing.JLabel();
        lbl_Img5 = new javax.swing.JLabel();
        pan_Nav1 = new javax.swing.JPanel();
        lbl_profil1 = new javax.swing.JLabel();
        lbl_accueil1 = new javax.swing.JLabel();
        lbl_suivi_mission1 = new javax.swing.JLabel();
        cbb_missions1 = new javax.swing.JComboBox<>();
        lbl_entreprise1 = new javax.swing.JLabel();
        cbb_entreprises1 = new javax.swing.JComboBox<>();
        lbl_etudiants1 = new javax.swing.JLabel();
        cbb_etudiants1 = new javax.swing.JComboBox<>();
        lbl_conventions1 = new javax.swing.JLabel();
        cbb_conventions1 = new javax.swing.JComboBox<>();
        lbl_facturation1 = new javax.swing.JLabel();
        cbb_facturation1 = new javax.swing.JComboBox<>();
        bt_Deco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unagi - Fiche client");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pan_Menu5.setBackground(new java.awt.Color(220, 220, 220));
        pan_Menu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pan_Profil5.setBackground(new java.awt.Color(255, 255, 255));
        pan_Profil5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_NomUtilisateur5.setText("lbl_NomUtilisateur");

        lbl_prenomUtilisateur5.setText("lbl_prenomUtilisateur");

        lbl_Img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snake2.png"))); // NOI18N

        javax.swing.GroupLayout pan_Profil5Layout = new javax.swing.GroupLayout(pan_Profil5);
        pan_Profil5.setLayout(pan_Profil5Layout);
        pan_Profil5Layout.setHorizontalGroup(
            pan_Profil5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_Profil5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Img5)
                .addGroup(pan_Profil5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_Profil5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_NomUtilisateur5))
                    .addGroup(pan_Profil5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_prenomUtilisateur5)))
                .addGap(25, 25, 25))
        );
        pan_Profil5Layout.setVerticalGroup(
            pan_Profil5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_Profil5Layout.createSequentialGroup()
                .addGroup(pan_Profil5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan_Profil5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Img5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan_Profil5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl_NomUtilisateur5)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_prenomUtilisateur5)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pan_Nav1.setBackground(new java.awt.Color(255, 255, 255));
        pan_Nav1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pan_Nav1.setPreferredSize(new java.awt.Dimension(300, 500));
        pan_Nav1.setVerifyInputWhenFocusTarget(false);

        lbl_profil1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_profil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_profil1.setText("Voir Profil");
        lbl_profil1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_accueil1.setBackground(new java.awt.Color(10, 10, 10));
        lbl_accueil1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_accueil1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_accueil1.setText("Accueil");
        lbl_accueil1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_accueil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_accueil1MouseClicked(evt);
            }
        });

        lbl_suivi_mission1.setBackground(new java.awt.Color(10, 10, 10));
        lbl_suivi_mission1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_suivi_mission1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_suivi_mission1.setText("Suivi Missions");
        lbl_suivi_mission1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_suivi_mission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_suivi_mission1MouseClicked(evt);
            }
        });

        cbb_missions1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En cours", "Cloturées", "En attente" }));
        cbb_missions1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_missions1.setVisible(false);
        cbb_missions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_missions1ActionPerformed(evt);
            }
        });

        lbl_entreprise1.setBackground(new java.awt.Color(10, 10, 10));
        lbl_entreprise1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_entreprise1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_entreprise1.setText("Entreprises");
        lbl_entreprise1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_entreprise1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_entreprise1MouseClicked(evt);
            }
        });

        cbb_entreprises1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Liste des entreprises" }));
        cbb_entreprises1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_entreprises1.setVisible(false);
        cbb_entreprises1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_entreprises1ActionPerformed(evt);
            }
        });

        lbl_etudiants1.setBackground(new java.awt.Color(10, 10, 10));
        lbl_etudiants1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_etudiants1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_etudiants1.setText("Etudiants");
        lbl_etudiants1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_etudiants1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_etudiants1MouseClicked(evt);
            }
        });

        cbb_etudiants1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Liste des étudiants" }));
        cbb_etudiants1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_etudiants1.setVisible(false);
        cbb_etudiants1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_etudiants1ActionPerformed(evt);
            }
        });

        lbl_conventions1.setBackground(new java.awt.Color(10, 10, 10));
        lbl_conventions1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_conventions1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_conventions1.setText("Conventions");
        lbl_conventions1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_conventions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_conventions1MouseClicked(evt);
            }
        });

        cbb_conventions1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Brouillons", "Upload", "Liste des conventions" }));
        cbb_conventions1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_conventions1.setVisible(false);
        cbb_conventions1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_conventions1ActionPerformed(evt);
            }
        });

        lbl_facturation1.setBackground(new java.awt.Color(10, 10, 10));
        lbl_facturation1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_facturation1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_facturation1.setText("Facturation");
        lbl_facturation1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_facturation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_facturation1MouseClicked(evt);
            }
        });

        cbb_facturation1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Brouillons", "Liste des factures" }));
        cbb_facturation1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_facturation1.setVisible(false);
        cbb_facturation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_facturation1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_Nav1Layout = new javax.swing.GroupLayout(pan_Nav1);
        pan_Nav1.setLayout(pan_Nav1Layout);
        pan_Nav1Layout.setHorizontalGroup(
            pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_Nav1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_Nav1Layout.createSequentialGroup()
                        .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_conventions1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_facturation1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_conventions1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbb_facturation1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_accueil1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan_Nav1Layout.createSequentialGroup()
                        .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_etudiants1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_entreprise1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_entreprises1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbb_etudiants1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_profil1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan_Nav1Layout.createSequentialGroup()
                        .addComponent(lbl_suivi_mission1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_missions1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pan_Nav1Layout.setVerticalGroup(
            pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_Nav1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_profil1)
                .addGap(20, 20, 20)
                .addComponent(lbl_accueil1)
                .addGap(18, 18, 18)
                .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_suivi_mission1)
                    .addComponent(cbb_missions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_entreprise1)
                    .addComponent(cbb_entreprises1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_etudiants1)
                    .addComponent(cbb_etudiants1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_conventions1)
                    .addComponent(cbb_conventions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_Nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_facturation1)
                    .addComponent(cbb_facturation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_Menu5Layout = new javax.swing.GroupLayout(pan_Menu5);
        pan_Menu5.setLayout(pan_Menu5Layout);
        pan_Menu5Layout.setHorizontalGroup(
            pan_Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_Menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pan_Nav1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(pan_Profil5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        pan_Menu5Layout.setVerticalGroup(
            pan_Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_Menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_Profil5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan_Nav1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        bt_Deco.setBackground(new java.awt.Color(255, 51, 51));
        bt_Deco.setForeground(new java.awt.Color(255, 255, 255));
        bt_Deco.setText("Déconnexion");
        bt_Deco.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pan_Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 643, Short.MAX_VALUE)
                .addComponent(bt_Deco))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Menu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Deco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_accueil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_accueil1MouseClicked
        this.setVisible(false);
        AcceuilA acceuil = new AcceuilA();
        acceuil.setVisible(true);
    }//GEN-LAST:event_lbl_accueil1MouseClicked

    private void lbl_suivi_mission1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_suivi_mission1MouseClicked

        if (!cbb_missions1.isVisible()||cbb_entreprises1.isVisible()||cbb_etudiants1.isVisible()||cbb_conventions1.isVisible()|| cbb_facturation1.isVisible() ||cbb_entreprises1.isVisible()){
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(true);
        }
        else {
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
    }//GEN-LAST:event_lbl_suivi_mission1MouseClicked

    private void cbb_missions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_missions1ActionPerformed
        String choix = (String) cbb_missions1.getSelectedItem();
        if (choix.equals("En cours")){
            this.setVisible(false);
            SMission_EnCours encours = new SMission_EnCours();
            encours.setVisible(true);
        }
        if (choix.equals( "Cloturées")){
            this.setVisible(false);
            SMission_Cloturees cloture= new SMission_Cloturees();
            cloture.setVisible(true);
        }
        if (choix.equals("En attente")){
            this.setVisible(false);
            SMission_EnAttente attente= new SMission_EnAttente();
            attente.setVisible(true);
        }
    }//GEN-LAST:event_cbb_missions1ActionPerformed

    private void lbl_entreprise1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_entreprise1MouseClicked

        if (!cbb_entreprises1.isVisible()||cbb_etudiants1.isVisible()||cbb_conventions1.isVisible()|| cbb_facturation1.isVisible() ||cbb_entreprises1.isVisible()||cbb_missions1.isVisible()){
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(true);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
        else {
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
    }//GEN-LAST:event_lbl_entreprise1MouseClicked

    private void cbb_entreprises1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_entreprises1ActionPerformed
        String choix = (String) cbb_entreprises1.getSelectedItem();
        if (choix.equals("Création")){
            this.setVisible(false);
            AjoutClient ajoutC = new AjoutClient();
            ajoutC.setVisible(true);
        }
        if (choix.equals("Liste des entreprises")){
            this.setVisible(false);
            ListeClients listeC = new ListeClients();
            listeC.setVisible(true);
        }
    }//GEN-LAST:event_cbb_entreprises1ActionPerformed

    private void lbl_etudiants1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_etudiants1MouseClicked

        if (!cbb_etudiants1.isVisible()||cbb_conventions1.isVisible()|| cbb_facturation1.isVisible() ||cbb_entreprises1.isVisible()||cbb_entreprises1.isVisible()||cbb_missions1.isVisible()){
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(true);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
        else {
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
    }//GEN-LAST:event_lbl_etudiants1MouseClicked

    private void cbb_etudiants1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_etudiants1ActionPerformed
        String choix = (String) cbb_etudiants1.getSelectedItem();
        if (choix.equals("Création")){
            this.setVisible(false);
            AjoutEtudiant ajoutE = new AjoutEtudiant();
            ajoutE.setVisible(true);
        }
        if (choix.equals("Liste des étudiants")){
            this.setVisible(false);
            ListeEtudiants listeE = new ListeEtudiants();
            listeE.setVisible(true);
        }
    }//GEN-LAST:event_cbb_etudiants1ActionPerformed

    private void lbl_conventions1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_conventions1MouseClicked

        if (!cbb_conventions1.isVisible()|| cbb_facturation1.isVisible() || cbb_etudiants1.isVisible()||cbb_entreprises1.isVisible()||cbb_entreprises1.isVisible()||cbb_missions1.isVisible() ){
            cbb_conventions1.setVisible(true);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
        else {
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(false);
            cbb_missions1.setVisible(false);
        }
    }//GEN-LAST:event_lbl_conventions1MouseClicked

    private void cbb_conventions1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_conventions1ActionPerformed
        String choix = (String) cbb_conventions1.getSelectedItem();
        if (choix.equals("Création")){
            this.setVisible(false);
            AjoutConvention ajoutC = new AjoutConvention();
            ajoutC.setVisible(true);
        }
        if (choix.equals("Brouillons")){
            this.setVisible(false);
            BrouillonsC brouillonC = new BrouillonsC();
            brouillonC.setVisible(true);
        }
        if (choix.equals("Upload")){
            this.setVisible(false);
            Upload upload = new Upload();
            upload.setVisible(true);
        }
        if (choix.equals("Liste des conventions")){
            this.setVisible(false);
            ListeConventionA listeC = new ListeConventionA();
            listeC.setVisible(true);
        }
    }//GEN-LAST:event_cbb_conventions1ActionPerformed

    private void lbl_facturation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_facturation1MouseClicked

        if (!cbb_facturation1.isVisible() || cbb_conventions1.isVisible() || cbb_etudiants1.isVisible()||cbb_entreprises1.isVisible()||cbb_entreprises1.isVisible()||cbb_missions1.isVisible() ){
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(true);
            cbb_missions1.setVisible(false);
        }
        else {
            cbb_conventions1.setVisible(false);
            cbb_entreprises1.setVisible(false);
            cbb_etudiants1.setVisible(false);
            cbb_facturation1.setVisible(true);
            cbb_missions1.setVisible(false);
        }
    }//GEN-LAST:event_lbl_facturation1MouseClicked

    private void cbb_facturation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_facturation1ActionPerformed
        String choix = (String) cbb_facturation1.getSelectedItem();
        if (choix.equals("Création")){
            this.setVisible(false);
            AjoutFacture ajoutF = new AjoutFacture();
            ajoutF.setVisible(true);
        }
        if (choix.equals("Brouillons")){
            this.setVisible(false);
            BrouillonFacture brouillonF= new BrouillonFacture();
            brouillonF.setVisible(true);
        }
        if (choix.equals("Liste des factures")){
            this.setVisible(false);
            ListeFactures listeF = new ListeFactures();
            listeF.setVisible(true);
        }
    }//GEN-LAST:event_cbb_facturation1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int input = JOptionPane.showConfirmDialog(this, "Voulez vous quitter l'application ?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == JOptionPane.OK_OPTION) {
            System.out.println("Application Fermée");
            this.dispose();
            System.exit(0);
        } else if (input == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FicheClient_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FicheClient_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FicheClient_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FicheClient_Paiement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FicheClient_Paiement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Deco;
    private javax.swing.JComboBox<String> cbb_conventions1;
    private javax.swing.JComboBox<String> cbb_entreprises1;
    private javax.swing.JComboBox<String> cbb_etudiants1;
    private javax.swing.JComboBox<String> cbb_facturation1;
    private javax.swing.JComboBox<String> cbb_missions1;
    private javax.swing.JLabel lbl_Img5;
    private javax.swing.JLabel lbl_NomUtilisateur5;
    private javax.swing.JLabel lbl_accueil1;
    private javax.swing.JLabel lbl_conventions1;
    private javax.swing.JLabel lbl_entreprise1;
    private javax.swing.JLabel lbl_etudiants1;
    private javax.swing.JLabel lbl_facturation1;
    private javax.swing.JLabel lbl_prenomUtilisateur5;
    private javax.swing.JLabel lbl_profil1;
    private javax.swing.JLabel lbl_suivi_mission1;
    private javax.swing.JPanel pan_Menu5;
    private javax.swing.JPanel pan_Nav1;
    private javax.swing.JPanel pan_Profil5;
    // End of variables declaration//GEN-END:variables
}
