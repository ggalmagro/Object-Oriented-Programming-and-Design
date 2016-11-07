/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.CultistPlayer;
import NapakalakiGame.DeathBadConsequence;
import NapakalakiGame.Napakalaki;
import NapakalakiGame.NumericBadConsequence;
import NapakalakiGame.Player;
import NapakalakiGame.SpecificBadConsequence;
import NapakalakiGame.Treasure;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Germán
 */
public class PlayerView extends javax.swing.JPanel {
    
    private Player playerModel;
    private Napakalaki napakalakiModel;
    /**
     * Creates new form PlayerView
     */
    public PlayerView() {
        initComponents();
    }
    
    public void setNapakalakiModel(Napakalaki n){
        napakalakiModel = n;
    }
    
    public void setPlayer(Player aPlayer) {
        
        playerModel = aPlayer;
        this.name.setText(playerModel.getName());
        this.level.setText(Integer.toString(playerModel.getLevels()));
        this.combatLevel.setText(Integer.toString(playerModel.getCombatLevel()));
        this.enemy.setText((playerModel.getEnemy()).getName());
        if(playerModel instanceof CultistPlayer)
            this.isCultist.setText("Eres un sectario");
        else
            this.isCultist.setText("");
        
        pendingBC.removeAll();
        if(playerModel.getPendingBC() instanceof DeathBadConsequence || playerModel.getPendingBC() instanceof NumericBadConsequence){
            NumericBadConsequenceView bcViewD = new NumericBadConsequenceView();
            bcViewD.setBadConsequence((NumericBadConsequence) playerModel.getPendingBC());
            bcViewD.setVisible(true);
            pendingBC.add(bcViewD);   
        }else{
            SpecificBadConsequenceView bcViewD = new SpecificBadConsequenceView();
            bcViewD.setBadConsequence((SpecificBadConsequence) playerModel.getPendingBC());
            bcViewD.setVisible(true);
            pendingBC.add(bcViewD);
        }
        buttDiscard.setEnabled(true);
        buttDiscardAll.setEnabled(true);
        
        if(playerModel.getPendingBC().isEmpty())
            buttEquip.setEnabled(true);
        else
            buttEquip.setEnabled(false);
        
        this.totalCultist.setText(Integer.toString(CultistPlayer.getTotalCultistPlayers()));
        this.fillTreasurePanel(visibleTreasures,playerModel.getVisibleTreasures());
        this.fillTreasurePanel(hiddenTreasures,playerModel.getHiddenTreasures());
        
        repaint();
        revalidate();
    }
    
    public void EquipButton(boolean b){
        buttEquip.setEnabled(b);
    }
    
    public void StealButton(boolean b){
        buttSteal.setEnabled(b);
    }
    
    public void pendingBCV(boolean b){
        pendingBC.setVisible(b);
    }
    
    
    private void fillTreasurePanel (JPanel aPanel, ArrayList<Treasure> aList) {
        aPanel.removeAll();
        for (Treasure t : aList) {
            TreasureView aTreasureView = new TreasureView();
            aTreasureView.setTreasure (t);
            aTreasureView.setVisible (true);
            aPanel.add (aTreasureView);
        }
        aPanel.repaint();
        aPanel.revalidate();
    }
    
    private ArrayList<Treasure> getSelectedTreasures(JPanel aPanel) {

        TreasureView tv;
        ArrayList<Treasure> output = new ArrayList();
        for (Component c : aPanel.getComponents()) {
            tv = (TreasureView) c;
            if ( tv.isSelected() )
                output.add ( tv.getTreasure() );
        }
        return output;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combatLevel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        enemy = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalCultist = new javax.swing.JLabel();
        visibleTreasures = new javax.swing.JPanel();
        hiddenTreasures = new javax.swing.JPanel();
        buttSteal = new javax.swing.JButton();
        buttEquip = new javax.swing.JButton();
        buttDiscard = new javax.swing.JButton();
        buttDiscardAll = new javax.swing.JButton();
        pendingBC = new javax.swing.JPanel();
        isCultist = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nombre:");

        jLabel3.setText("Nivel:");

        jLabel5.setText("Nivel de Combate:");

        jLabel7.setText("Enemigo:");

        jLabel9.setText("Total Sectarios:");

        visibleTreasures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hiddenTreasures.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttSteal.setText("Robar Tesoro");
        buttSteal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttStealActionPerformed(evt);
            }
        });

        buttEquip.setText("Equipar");
        buttEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttEquipActionPerformed(evt);
            }
        });

        buttDiscard.setText("Descartar");
        buttDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttDiscardActionPerformed(evt);
            }
        });

        buttDiscardAll.setText("Descartar Todo");
        buttDiscardAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttDiscardAllActionPerformed(evt);
            }
        });

        pendingBC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("JUGADOR");

        jLabel4.setText("Tesoros Visibles:");

        jLabel6.setText("Tesoros Ocultos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(combatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(enemy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(totalCultist, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(isCultist, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttDiscardAll, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttSteal, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttDiscard, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(pendingBC, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(hiddenTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(combatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(enemy, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(totalCultist, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(isCultist, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(buttSteal)
                                .addGap(6, 6, 6)
                                .addComponent(buttEquip)
                                .addGap(6, 6, 6)
                                .addComponent(buttDiscard)
                                .addGap(6, 6, 6)
                                .addComponent(buttDiscardAll)))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pendingBC, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(hiddenTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttDiscardActionPerformed
        ArrayList<Treasure> selVisible = getSelectedTreasures(visibleTreasures);
        ArrayList<Treasure> selHidden = getSelectedTreasures(hiddenTreasures);
        
        for(Treasure t: selVisible){
            playerModel.discardVisibleTreasure(t);
        }
        
        for(Treasure t: selHidden){
            playerModel.discardHiddenTreasure(t);
        }
        if(playerModel.getPendingBC().isEmpty()){
            pendingBC.setVisible(false);
            buttEquip.setEnabled(true);
        }
        setPlayer(napakalakiModel.getCurrentPlayer()); 
    }//GEN-LAST:event_buttDiscardActionPerformed

    private void buttEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttEquipActionPerformed
        ArrayList<Treasure> selHidden = getSelectedTreasures(hiddenTreasures);
        napakalakiModel.makeTreasuresVisible(selHidden);
        setPlayer(napakalakiModel.getCurrentPlayer());              //Para actualizar la vista del jugador
    }//GEN-LAST:event_buttEquipActionPerformed

    private void buttStealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttStealActionPerformed
        playerModel.stealTreasure();
        if(!(playerModel.canISteal()))                                             //Si he robado
            buttSteal.setEnabled(false);
        
        setPlayer(napakalakiModel.getCurrentPlayer()); 
    }//GEN-LAST:event_buttStealActionPerformed

    private void buttDiscardAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttDiscardAllActionPerformed
        playerModel.discardAllTreasures();
        pendingBC.setVisible(false);
        buttEquip.setEnabled(true);
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_buttDiscardAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttDiscard;
    private javax.swing.JButton buttDiscardAll;
    private javax.swing.JButton buttEquip;
    private javax.swing.JButton buttSteal;
    private javax.swing.JLabel combatLevel;
    private javax.swing.JLabel enemy;
    private javax.swing.JPanel hiddenTreasures;
    private javax.swing.JLabel isCultist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pendingBC;
    private javax.swing.JLabel totalCultist;
    private javax.swing.JPanel visibleTreasures;
    // End of variables declaration//GEN-END:variables
}