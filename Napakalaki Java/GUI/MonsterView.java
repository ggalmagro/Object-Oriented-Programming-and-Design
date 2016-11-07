/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.DeathBadConsequence;
import NapakalakiGame.Monster;
import NapakalakiGame.NumericBadConsequence;
import NapakalakiGame.SpecificBadConsequence;

/**
 *
 * @author Germán
 */
public class MonsterView extends javax.swing.JPanel {
    
    private Monster monsterModel;

    /**
     * Creates new form MonsterView
     */
    
    public void setMonster(Monster aMonster) {
        
        monsterModel = aMonster;
        int bonus = aMonster.getCombatLevelAgainstCultistPlayer() - aMonster.GetCombatLevel();
        if(bonus != 0){
            this.infoCultist.setText("Modificacion contra Sectarios: " + Integer.toString(bonus));
        }else
            this.infoCultist.setText("");
        
        this.combatLevel.setText(Integer.toString(monsterModel.GetCombatLevel()));
        this.name.setText(monsterModel.Getname());
        prizeView.setPrize(monsterModel.GetPremio());
        
        badconsequenceView.removeAll();
        if(monsterModel.GetMalRollo() instanceof DeathBadConsequence){
            DeathBadConsequenceView bcViewD = new DeathBadConsequenceView();
            bcViewD.setBadConsequence((DeathBadConsequence) monsterModel.GetMalRollo());
            bcViewD.setVisible(true);
            badconsequenceView.add(bcViewD);  
        }else if(monsterModel.GetMalRollo() instanceof NumericBadConsequence){
            NumericBadConsequenceView bcViewD = new NumericBadConsequenceView();
            bcViewD.setBadConsequence((NumericBadConsequence) monsterModel.GetMalRollo());
            bcViewD.setVisible(true);
            badconsequenceView.add(bcViewD); 
        }else{
            SpecificBadConsequenceView bcViewD = new SpecificBadConsequenceView();
            bcViewD.setBadConsequence((SpecificBadConsequence) monsterModel.GetMalRollo());
            bcViewD.setVisible(true);
            badconsequenceView.add(bcViewD);
        }  
        
        repaint();
        revalidate();
    }
    
    public MonsterView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        combatLevel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        badconsequenceView = new javax.swing.JPanel();
        prizeView = new GUI.PrizeView();
        infoCultist = new javax.swing.JLabel();

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Nivel de combate:");

        jLabel3.setText("MONSTRUO");

        badconsequenceView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        prizeView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combatLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(infoCultist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(badconsequenceView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prizeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(211, 211, 211))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combatLevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoCultist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(badconsequenceView, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prizeView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel badconsequenceView;
    private javax.swing.JLabel combatLevel;
    private javax.swing.JLabel infoCultist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel name;
    private GUI.PrizeView prizeView;
    // End of variables declaration//GEN-END:variables
}