/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

/**
 *
 * @author kroctus
 */
public class frameHistoriaAlternativa extends javax.swing.JFrame {

    /**
     * Creates new form frameHistoriaAlternativa
     */
    public frameHistoriaAlternativa() {
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
        botonBaculo = new javax.swing.JButton();
        botonEspada = new javax.swing.JButton();
        botonArco = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1958, 1080));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 60)); // NOI18N
        jLabel1.setText("Elige tu historia alternativa:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, -10, 770, 210);

        botonBaculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/baculo_H_430.png"))); // NOI18N
        botonBaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBaculoActionPerformed(evt);
            }
        });
        getContentPane().add(botonBaculo);
        botonBaculo.setBounds(750, 290, 290, 430);

        botonEspada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/espada_H_430.png"))); // NOI18N
        getContentPane().add(botonEspada);
        botonEspada.setBounds(210, 280, 290, 430);

        botonArco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/arco_H_430.png"))); // NOI18N
        getContentPane().add(botonArco);
        botonArco.setBounds(1280, 290, 290, 430);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/ARMAS.png"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBaculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonBaculoActionPerformed

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
            java.util.logging.Logger.getLogger(frameHistoriaAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameHistoriaAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameHistoriaAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameHistoriaAlternativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameHistoriaAlternativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonArco;
    private javax.swing.JButton botonBaculo;
    private javax.swing.JButton botonEspada;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
