/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.CombatResult;
import NapakalakiGame.Napakalaki;
/**
 *
 * @author Antonio
 */
public class NapakalakiView extends javax.swing.JFrame {

    private Napakalaki napakalakiModel;    
    /**
     * Creates new form NapakalakiView
     */
    public NapakalakiView() {
        initComponents();
    }

    public void setNapakalaki(Napakalaki n) {
        napakalakiModel = n;
        
        
        playerV.StealButton(false);
        playerV.pendingBCV(false);
        playerV.setPlayer(napakalakiModel.getCurrentPlayer());
        playerV.setNapakalakiModel(napakalakiModel);
        monsterV.removeAll();
        combatB.setEnabled(false);
        nextTurnB.setEnabled(false);
        meetMonsterB.setEnabled(true);
        repaint();
        revalidate();
        
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meetMonsterB = new javax.swing.JButton();
        combatB = new javax.swing.JButton();
        nextTurnB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nextTurn = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        combatResult = new javax.swing.JTextArea();
        finishB = new javax.swing.JButton();
        playerV = new GUI.PlayerView();
        monsterV = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        meetMonsterB.setText("Meet the Monster");
        meetMonsterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetMonsterBActionPerformed(evt);
            }
        });

        combatB.setText("Combat");
        combatB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatBActionPerformed(evt);
            }
        });

        nextTurnB.setText("Next turn");
        nextTurnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTurnBActionPerformed(evt);
            }
        });

        nextTurn.setEditable(false);
        nextTurn.setColumns(20);
        nextTurn.setRows(5);
        jScrollPane1.setViewportView(nextTurn);

        jLabel1.setText("NAPAKALAKI GAME");

        combatResult.setEditable(false);
        combatResult.setColumns(20);
        combatResult.setRows(5);
        jScrollPane2.setViewportView(combatResult);

        finishB.setText("Terminar juego");
        finishB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishBActionPerformed(evt);
            }
        });

        monsterV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerV, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monsterV, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(meetMonsterB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(combatB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nextTurnB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(finishB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(meetMonsterB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combatB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextTurnB)
                                .addGap(48, 48, 48)
                                .addComponent(finishB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(monsterV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(playerV, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meetMonsterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetMonsterBActionPerformed
        MonsterView vistaMons = new MonsterView();
        vistaMons.setMonster(napakalakiModel.getCurrentMonster());
        monsterV.add(vistaMons);
        monsterV.setVisible(true);
        meetMonsterB.setEnabled(false);
        playerV.EquipButton(false);
        combatB.setEnabled(true);
        repaint();
        revalidate();
    }//GEN-LAST:event_meetMonsterBActionPerformed

    private void combatBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatBActionPerformed
        CombatResult cr = napakalakiModel.developCombat();
        
        playerV.EquipButton(true);
        nextTurnB.setEnabled(true);
        meetMonsterB.setEnabled(false);
        combatB.setEnabled(false);
        
        if(cr == CombatResult.WIN)
            this.combatResult.setText("Has ganado el combate!!");
        else{
            if(cr == CombatResult.WINGAME){
              this.combatResult.setText("HAS GANADO LA PARTIDA!!!!!");
              nextTurnB.setEnabled(false);
            }else{
                if(cr == CombatResult.LOSE)
                    this.combatResult.setText("Has perdido el combate.\n Te toca cumplir el mal rollo");
                else
                    this.combatResult.setText("Has perdido el combate y \nte has convertido en un sectario");
            }
        }
        if(napakalakiModel.getCurrentPlayer().canISteal() && napakalakiModel.getCurrentPlayer().getEnemy().canYouGiveMeATreasure())
            playerV.StealButton(true);
        
        if(!(napakalakiModel.getCurrentPlayer().getPendingBC().isEmpty())){
            playerV.pendingBCV(true);
            playerV.EquipButton(false);
        }    
        

        playerV.setPlayer(napakalakiModel.getCurrentPlayer());
        repaint();
    }//GEN-LAST:event_combatBActionPerformed

    private void nextTurnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTurnBActionPerformed
        boolean permitido = napakalakiModel.nextTurn();
        if(permitido == true){
            setNapakalaki(napakalakiModel);
            combatResult.setText("");
            nextTurn.setText("");
        }else
            this.nextTurn.setText("Tienes que cumplir el mal rollo o \nno puedes tener mas de 4 tesoros ocultos");
        
        repaint();
    }//GEN-LAST:event_nextTurnBActionPerformed

    private void finishBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishBActionPerformed
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_finishBActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton combatB;
    private javax.swing.JTextArea combatResult;
    private javax.swing.JButton finishB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton meetMonsterB;
    private javax.swing.JPanel monsterV;
    private javax.swing.JTextArea nextTurn;
    private javax.swing.JButton nextTurnB;
    private GUI.PlayerView playerV;
    // End of variables declaration//GEN-END:variables
}