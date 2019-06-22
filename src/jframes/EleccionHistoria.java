/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import javax.swing.JOptionPane;

/**
 *
 * @author kroctus
 */
public class EleccionHistoria extends javax.swing.JFrame {

    //Atributes
//    private int seleccionHistoria; //Alamacena la historia seleccionada por el usuario 0 = principal 1 =otras
    private int alterOpcion;

    /*Almacena la opcón alternativa del usuario */

    /**
     * Creates new form EleccionHistoria
     */
    public EleccionHistoria() {
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

        frameHistoriaAlternativa = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        botonHistoriaPrincipal = new javax.swing.JButton();
        botonHistoriasAlternativas = new javax.swing.JButton();
        labelHistoriaPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelEligeTuHistoria = new javax.swing.JLabel();
        imagen_fondo = new javax.swing.JLabel();

        frameHistoriaAlternativa.setResizable(false);
        frameHistoriaAlternativa.getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        frameHistoriaAlternativa.getContentPane().add(jButton1);
        jButton1.setBounds(390, 250, 280, 400);

        jButton2.setText("jButton2");
        frameHistoriaAlternativa.getContentPane().add(jButton2);
        jButton2.setBounds(900, 260, 260, 390);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 60)); // NOI18N
        jLabel3.setText("Escoge tu hisrtoria alternativa");
        frameHistoriaAlternativa.getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 40, 940, 140);

        jButton3.setText("jButton3");
        frameHistoriaAlternativa.getContentPane().add(jButton3);
        jButton3.setBounds(1370, 260, 270, 390);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/ARMAS.png"))); // NOI18N
        fondo.setText("jLabel2");
        fondo.setPreferredSize(new java.awt.Dimension(1921, 1201));
        fondo.setRequestFocusEnabled(false);
        frameHistoriaAlternativa.getContentPane().add(fondo);
        fondo.setBounds(0, -30, 1970, 1140);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1921, 1201));
        setResizable(false);
        getContentPane().setLayout(null);

        botonHistoriaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/martillo_2.png"))); // NOI18N
        botonHistoriaPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonHistoriaPrincipal.setBorderPainted(false);
        botonHistoriaPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHistoriaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistoriaPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(botonHistoriaPrincipal);
        botonHistoriaPrincipal.setBounds(430, 220, 330, 517);

        botonHistoriasAlternativas.setBackground(new java.awt.Color(255, 255, 255));
        botonHistoriasAlternativas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/armas_img_2.png"))); // NOI18N
        botonHistoriasAlternativas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonHistoriasAlternativas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHistoriasAlternativas.setDisabledIcon(null);
        botonHistoriasAlternativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistoriasAlternativasActionPerformed(evt);
            }
        });
        getContentPane().add(botonHistoriasAlternativas);
        botonHistoriasAlternativas.setBounds(1080, 160, 350, 600);

        labelHistoriaPrincipal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        labelHistoriaPrincipal.setText("Historia principal");
        getContentPane().add(labelHistoriaPrincipal);
        labelHistoriaPrincipal.setBounds(420, 770, 540, 60);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
        jLabel1.setText("Historias alternativas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1030, 770, 457, 64);

        labelEligeTuHistoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 70)); // NOI18N
        labelEligeTuHistoria.setText("Elige tu historia:");
        getContentPane().add(labelEligeTuHistoria);
        labelEligeTuHistoria.setBounds(640, 30, 810, 90);

        imagen_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/ARMAS.png"))); // NOI18N
        imagen_fondo.setText("jLabel1");
        getContentPane().add(imagen_fondo);
        imagen_fondo.setBounds(0, 0, 1910, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonHistoriaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistoriaPrincipalActionPerformed
        JOptionPane.showMessageDialog(null, "Cargando la historia principal...");
        new InicioHistoria().setVisible(true);
        dispose();

    }//GEN-LAST:event_botonHistoriaPrincipalActionPerformed

    private void botonHistoriasAlternativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistoriasAlternativasActionPerformed
        JOptionPane.showMessageDialog(null, "Pasando a la selección de historias alternativas");
        new frameHistoriaAlternativa().setVisible(true);
        dispose();

    }//GEN-LAST:event_botonHistoriasAlternativasActionPerformed

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
            java.util.logging.Logger.getLogger(EleccionHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleccionHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleccionHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleccionHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EleccionHistoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonHistoriaPrincipal;
    private javax.swing.JButton botonHistoriasAlternativas;
    private javax.swing.JLabel fondo;
    private javax.swing.JFrame frameHistoriaAlternativa;
    private javax.swing.JLabel imagen_fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelEligeTuHistoria;
    private javax.swing.JLabel labelHistoriaPrincipal;
    // End of variables declaration//GEN-END:variables
}
