/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojokenpo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author 182220031
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Creates new form Janela
     */
    public Janela() {
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

        Label = new javax.swing.JLabel();
        btPedra = new javax.swing.JButton();
        btPapel = new javax.swing.JButton();
        btTesoura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Label.setText("JO-KEN-PO");

        btPedra.setText("PEDRA");
        btPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedraActionPerformed(evt);
            }
        });

        btPapel.setText("PAPEL");
        btPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPapelActionPerformed(evt);
            }
        });

        btTesoura.setText("TESOURA");
        btTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTesouraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sua Jogada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPedra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btTesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Label)
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPedra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTesouraActionPerformed
        JogadaP = 3;
        JogadaM = 0;
        Random Random = new Random();
        
        JogadaM = Random.nextInt(4);
        
        if(JogadaM == 1){
            JogadaMS = "PEDRA";
            jLabel1.setText("Maquina: " + JogadaMS);
        }else if(JogadaM == 2){
            JogadaMS = "PAPEL";
            jLabel1.setText("Maquina: " + JogadaMS);
        }else{
            JogadaMS = "TESOURA";
            jLabel1.setText("Maquina: " + JogadaMS);
        }
        
        
        if (JogadaM == 1){
           JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS 
                                        + "\n "+"A MAQUINA GANHOU!!!");      
        }else if(JogadaP == JogadaM){
            JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS
                                        + "\n " + "EMPATE!!!");
        }else{
            JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS
                                        + "\n " +  "VOCÊ GANHOU!!!");

        }
    }//GEN-LAST:event_btTesouraActionPerformed

    private void btPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPapelActionPerformed
        JogadaP = 2;
        JogadaM = 0;
        Random Random = new Random();
        
        JogadaM = Random.nextInt(4);
        
        if(JogadaM == 1){
            JogadaMS = "PEDRA";
            jLabel1.setText("Maquina: " + JogadaMS);
        }else if(JogadaM == 2){
            JogadaMS = "PAPEL";
            jLabel1.setText("Maquina: " + JogadaMS);
        }else{
            JogadaMS = "TESOURA";
            jLabel1.setText("Maquina: " + JogadaMS);
        }
        
        
        if (JogadaM == 1){
           JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS 
                                        + "\n "+"VOCÊ GANHOU!!");      
        }else if(JogadaP == JogadaM){
            JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS
                                        + "\n " + "EMPATE!!!");
        }else{
            JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS
                                        + "\n " +  "A MAQUINA GANHOU!!!");
        }

    }//GEN-LAST:event_btPapelActionPerformed

    private void btPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedraActionPerformed
        JogadaP = 1;
        JogadaM = 0;
        Random Random = new Random();
        
        JogadaM = Random.nextInt(4);
        
        if(JogadaM == 1){
            JogadaMS = "PEDRA";
            jLabel1.setText("Maquina: " + JogadaMS);
        }else if(JogadaM == 2){
            JogadaMS = "PAPEL";
            jLabel1.setText("Maquina: " + JogadaMS);
        }else{
            JogadaMS = "TESOURA";
            jLabel1.setText("Maquina: " + JogadaMS);
        }
        
        
        if (JogadaM == 1){
           JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS 
                                        + "\n " + "EMPATE!!!");      
        }else if(JogadaM == 2){
            JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS
                                        + "\n " + "A MAQUINA GANHOU!!!");
        }else{
            JOptionPane.showMessageDialog(null,"Jogada Maquina: " +  JogadaMS
                                        + "\n " +  "VOCÊ GENHOU!!!");

        }
    }//GEN-LAST:event_btPedraActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    
    int JogadaM;
    int JogadaP;
    String JogadaMS;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JButton btPapel;
    private javax.swing.JButton btPedra;
    private javax.swing.JButton btTesoura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
