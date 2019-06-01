/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecrans;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Niakulu
 */
public class BrouillonsC extends javax.swing.JFrame {

    /**
     * Creates new form BrouillonsC
     */
    public BrouillonsC() {
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

        pan_Menu = new javax.swing.JPanel();
        pan_Profil = new javax.swing.JPanel();
        lbl_NomUtilisateur = new javax.swing.JLabel();
        lbl_prenomUtilisateur = new javax.swing.JLabel();
        lbl_Img = new javax.swing.JLabel();
        pan_Nav = new javax.swing.JPanel();
        lbl_profil = new javax.swing.JLabel();
        lbl_accueil = new javax.swing.JLabel();
        lbl_suivi_mission = new javax.swing.JLabel();
        cbb_missions = new javax.swing.JComboBox<>();
        lbl_entreprise = new javax.swing.JLabel();
        cbb_entreprises = new javax.swing.JComboBox<>();
        lbl_etudiants = new javax.swing.JLabel();
        cbb_etudiants = new javax.swing.JComboBox<>();
        lbl_conventions = new javax.swing.JLabel();
        cbb_conventions = new javax.swing.JComboBox<>();
        lbl_facturation = new javax.swing.JLabel();
        cbb_facturation = new javax.swing.JComboBox<>();
        bt_Deco = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unagi - Brouillons de convention");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pan_Menu.setBackground(new java.awt.Color(220, 220, 220));
        pan_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pan_Menu.setToolTipText("");

        pan_Profil.setBackground(new java.awt.Color(255, 255, 255));
        pan_Profil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_NomUtilisateur.setText("lbl_NomUtilisateur");

        lbl_prenomUtilisateur.setText("lbl_prenomUtilisateur");

        lbl_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snake2.png"))); // NOI18N

        javax.swing.GroupLayout pan_ProfilLayout = new javax.swing.GroupLayout(pan_Profil);
        pan_Profil.setLayout(pan_ProfilLayout);
        pan_ProfilLayout.setHorizontalGroup(
            pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_ProfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Img)
                .addGroup(pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_ProfilLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbl_NomUtilisateur))
                    .addGroup(pan_ProfilLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_prenomUtilisateur)))
                .addGap(25, 25, 25))
        );
        pan_ProfilLayout.setVerticalGroup(
            pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ProfilLayout.createSequentialGroup()
                .addGroup(pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan_ProfilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Img))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan_ProfilLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lbl_NomUtilisateur)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_prenomUtilisateur)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pan_Nav.setBackground(new java.awt.Color(255, 255, 255));
        pan_Nav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pan_Nav.setPreferredSize(new java.awt.Dimension(300, 500));
        pan_Nav.setVerifyInputWhenFocusTarget(false);

        lbl_profil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_profil.setText("Voir Profil");
        lbl_profil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_accueil.setBackground(new java.awt.Color(10, 10, 10));
        lbl_accueil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_accueil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_accueil.setText("Accueil");
        lbl_accueil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_accueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_accueilMouseClicked(evt);
            }
        });

        lbl_suivi_mission.setBackground(new java.awt.Color(10, 10, 10));
        lbl_suivi_mission.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_suivi_mission.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_suivi_mission.setText("Suivi Missions");
        lbl_suivi_mission.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_suivi_mission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_suivi_missionMouseClicked(evt);
            }
        });

        cbb_missions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En cours", "Cloturées", "En attente" }));
        cbb_missions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_missions.setVisible(false);
        cbb_missions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_missionsActionPerformed(evt);
            }
        });

        lbl_entreprise.setBackground(new java.awt.Color(10, 10, 10));
        lbl_entreprise.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_entreprise.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_entreprise.setText("Entreprises");
        lbl_entreprise.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_entreprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_entrepriseMouseClicked(evt);
            }
        });

        cbb_entreprises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Liste des entreprises" }));
        cbb_entreprises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_entreprises.setVisible(false);
        cbb_entreprises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_entreprisesActionPerformed(evt);
            }
        });

        lbl_etudiants.setBackground(new java.awt.Color(10, 10, 10));
        lbl_etudiants.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_etudiants.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_etudiants.setText("Etudiants");
        lbl_etudiants.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_etudiants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_etudiantsMouseClicked(evt);
            }
        });

        cbb_etudiants.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Liste des étudiants" }));
        cbb_etudiants.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_etudiants.setVisible(false);
        cbb_etudiants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_etudiantsActionPerformed(evt);
            }
        });

        lbl_conventions.setBackground(new java.awt.Color(10, 10, 10));
        lbl_conventions.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_conventions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_conventions.setText("Conventions");
        lbl_conventions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_conventions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_conventionsMouseClicked(evt);
            }
        });

        cbb_conventions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Brouillons", "Upload", "Liste des conventions" }));
        cbb_conventions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_conventions.setVisible(false);
        cbb_conventions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_conventionsActionPerformed(evt);
            }
        });

        lbl_facturation.setBackground(new java.awt.Color(10, 10, 10));
        lbl_facturation.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_facturation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_facturation.setText("Facturation");
        lbl_facturation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_facturation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_facturationMouseClicked(evt);
            }
        });

        cbb_facturation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Création", "Brouillons", "Liste des factures" }));
        cbb_facturation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbb_facturation.setVisible(false);
        cbb_facturation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_facturationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan_NavLayout = new javax.swing.GroupLayout(pan_Nav);
        pan_Nav.setLayout(pan_NavLayout);
        pan_NavLayout.setHorizontalGroup(
            pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_NavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_NavLayout.createSequentialGroup()
                        .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_conventions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_facturation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_conventions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbb_facturation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_accueil, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pan_NavLayout.createSequentialGroup()
                        .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_etudiants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_entreprise, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbb_entreprises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbb_etudiants, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_profil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan_NavLayout.createSequentialGroup()
                        .addComponent(lbl_suivi_mission, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbb_missions, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pan_NavLayout.setVerticalGroup(
            pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_NavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_profil)
                .addGap(20, 20, 20)
                .addComponent(lbl_accueil)
                .addGap(18, 18, 18)
                .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_suivi_mission)
                    .addComponent(cbb_missions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_entreprise)
                    .addComponent(cbb_entreprises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_etudiants)
                    .addComponent(cbb_etudiants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_conventions)
                    .addComponent(cbb_conventions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_facturation)
                    .addComponent(cbb_facturation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_MenuLayout = new javax.swing.GroupLayout(pan_Menu);
        pan_Menu.setLayout(pan_MenuLayout);
        pan_MenuLayout.setHorizontalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pan_Nav, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(pan_Profil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        pan_MenuLayout.setVerticalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan_Nav, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        bt_Deco.setBackground(new java.awt.Color(255, 51, 51));
        bt_Deco.setForeground(new java.awt.Color(255, 255, 255));
        bt_Deco.setText("Déconnexion");
        bt_Deco.setToolTipText("");
        bt_Deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pan_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 596, Short.MAX_VALUE)
                .addComponent(bt_Deco, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Deco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_accueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_accueilMouseClicked
        this.setVisible(false);
        AcceuilA acceuil = new AcceuilA();
        acceuil.setVisible(true);
    }//GEN-LAST:event_lbl_accueilMouseClicked

    private void lbl_suivi_missionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_suivi_missionMouseClicked

        if (!cbb_missions.isVisible()||cbb_entreprises.isVisible()||cbb_etudiants.isVisible()||cbb_conventions.isVisible()|| cbb_facturation.isVisible() ||cbb_entreprises.isVisible()){
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(true);
        }
        else {
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
    }//GEN-LAST:event_lbl_suivi_missionMouseClicked

    private void cbb_missionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_missionsActionPerformed
        String choix = (String) cbb_missions.getSelectedItem();
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
    }//GEN-LAST:event_cbb_missionsActionPerformed

    private void lbl_entrepriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_entrepriseMouseClicked

        if (!cbb_entreprises.isVisible()||cbb_etudiants.isVisible()||cbb_conventions.isVisible()|| cbb_facturation.isVisible() ||cbb_entreprises.isVisible()||cbb_missions.isVisible()){
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(true);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
        else {
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
    }//GEN-LAST:event_lbl_entrepriseMouseClicked

    private void cbb_entreprisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_entreprisesActionPerformed
        String choix = (String) cbb_entreprises.getSelectedItem();
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
    }//GEN-LAST:event_cbb_entreprisesActionPerformed

    private void lbl_etudiantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_etudiantsMouseClicked

        if (!cbb_etudiants.isVisible()||cbb_conventions.isVisible()|| cbb_facturation.isVisible() ||cbb_entreprises.isVisible()||cbb_entreprises.isVisible()||cbb_missions.isVisible()){
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(true);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
        else {
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
    }//GEN-LAST:event_lbl_etudiantsMouseClicked

    private void cbb_etudiantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_etudiantsActionPerformed
        String choix = (String) cbb_etudiants.getSelectedItem();
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
    }//GEN-LAST:event_cbb_etudiantsActionPerformed

    private void lbl_conventionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_conventionsMouseClicked

        if (!cbb_conventions.isVisible()|| cbb_facturation.isVisible() || cbb_etudiants.isVisible()||cbb_entreprises.isVisible()||cbb_entreprises.isVisible()||cbb_missions.isVisible() ){
            cbb_conventions.setVisible(true);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
        else {
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(false);
            cbb_missions.setVisible(false);
        }
    }//GEN-LAST:event_lbl_conventionsMouseClicked

    private void cbb_conventionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_conventionsActionPerformed
        String choix = (String) cbb_conventions.getSelectedItem();
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
    }//GEN-LAST:event_cbb_conventionsActionPerformed

    private void lbl_facturationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_facturationMouseClicked

        if (!cbb_facturation.isVisible() || cbb_conventions.isVisible() || cbb_etudiants.isVisible()||cbb_entreprises.isVisible()||cbb_entreprises.isVisible()||cbb_missions.isVisible() ){
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(true);
            cbb_missions.setVisible(false);
        }
        else {
            cbb_conventions.setVisible(false);
            cbb_entreprises.setVisible(false);
            cbb_etudiants.setVisible(false);
            cbb_facturation.setVisible(true);
            cbb_missions.setVisible(false);
        }
    }//GEN-LAST:event_lbl_facturationMouseClicked

    private void cbb_facturationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_facturationActionPerformed
        String choix = (String) cbb_facturation.getSelectedItem();
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
    }//GEN-LAST:event_cbb_facturationActionPerformed

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

    private void bt_DecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DecoActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Voulez vous retourner à l'écran de connexion?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            Connexion connexion = new Connexion();
            connexion.setVisible(true);
        } else if (input == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_bt_DecoActionPerformed

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
            java.util.logging.Logger.getLogger(BrouillonsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrouillonsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrouillonsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrouillonsC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrouillonsC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Deco;
    private javax.swing.JComboBox<String> cbb_conventions;
    private javax.swing.JComboBox<String> cbb_entreprises;
    private javax.swing.JComboBox<String> cbb_etudiants;
    private javax.swing.JComboBox<String> cbb_facturation;
    private javax.swing.JComboBox<String> cbb_missions;
    private javax.swing.JLabel lbl_Img;
    private javax.swing.JLabel lbl_NomUtilisateur;
    private javax.swing.JLabel lbl_accueil;
    private javax.swing.JLabel lbl_conventions;
    private javax.swing.JLabel lbl_entreprise;
    private javax.swing.JLabel lbl_etudiants;
    private javax.swing.JLabel lbl_facturation;
    private javax.swing.JLabel lbl_prenomUtilisateur;
    private javax.swing.JLabel lbl_profil;
    private javax.swing.JLabel lbl_suivi_mission;
    private javax.swing.JPanel pan_Menu;
    private javax.swing.JPanel pan_Nav;
    private javax.swing.JPanel pan_Profil;
    // End of variables declaration//GEN-END:variables
}
