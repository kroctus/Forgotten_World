/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kroctus
 */
public class InicioHistoria extends javax.swing.JFrame {

    /**
     * Creates new form InicioHistoria
     */
    //Para controlar las interacciones del botón siguiente en la historia
    int contadorBoton = 0;

    public InicioHistoria() {
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

        textoHistoria = new javax.swing.JLabel();
        botonSiguiente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botonAnterior2 = new javax.swing.JButton();
        botonAnterior1 = new javax.swing.JButton();
        botonAnterior3 = new javax.swing.JButton();
        botonAnterior4 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1921, 1201));
        setResizable(false);
        getContentPane().setLayout(null);

        textoHistoria.setBackground(new java.awt.Color(204, 255, 255));
        textoHistoria.setFont(new java.awt.Font("Verdana", 3, 30)); // NOI18N
        textoHistoria.setForeground(new java.awt.Color(255, 255, 255));
        textoHistoria.setText("Astrea, un mundo repleto de magia , donde conviven las 4 grandes razas primigenias y sus descendientes.");
        getContentPane().add(textoHistoria);
        textoHistoria.setBounds(50, 880, 1840, 150);

        botonSiguiente.setText("Siguiente");
        botonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente);
        botonSiguiente.setBounds(1730, 1000, 150, 50);

        jLabel11.setVisible(false);
        jLabel11.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cada raza");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(600, 780, 210, 100);

        jLabel10.setVisible(false);
        jLabel10.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("crepuscular desde donde discutían entre ellos la forma de construir el  mundo perfecto para ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 690, 1880, 100);

        jLabel9.setVisible(false);
        jLabel9.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("forma de herramientas, estas personas excepcionales, eran llevadas al castillo de la luz ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 630, 1830, 100);

        jLabel8.setVisible(false);
        jLabel8.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("las cuales tenían la capacidad de adaptarse al alma  de sus usuarios manifestándose en");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 570, 1830, 100);

        jLabel7.setVisible(false);
        jLabel7.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("muchas de estas reliquias fueron entregadas a los representantes de las 4 primeras razas ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 510, 1830, 100);

        jLabel1.setVisible(false);
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("En el principio solo había oscuridad y los elementos se encontraban dispersos, un");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 240, 1830, 100);

        jLabel3.setVisible(false);
        jLabel3.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("aparición de los primeros seres los cuales según cuentan las leyendas tenían la capacidad ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 370, 1850, 90);

        jLabel2.setVisible(false);
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("fenómeno al que la historia hace referencia como “el Aon”  o la gran conjunción provocó la ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 330, 1850, 45);

        jLabel5.setVisible(false);
        jLabel5.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("nuestro alrededor para luego desaparecer, pero no sin dejar reliquias que sirvieran para ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 520, 1830, 60);

        jLabel4.setVisible(false);
        jLabel4.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("de moldear el todo a su voluntad y es así como construyeron el mundo que tenemos a ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 440, 1840, 90);

        jLabel6.setVisible(false);
        jLabel6.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("guiar a los nuevos seres vivos y que estas ayudaran a mantener el equilibrio del mundo ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 590, 1778, 45);

        botonAnterior2.setVisible(false);
        botonAnterior2.setText("Anterior");
        botonAnterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnterior2ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAnterior2);
        botonAnterior2.setBounds(1570, 1000, 150, 50);

        botonAnterior1.setVisible(false);
        botonAnterior1.setText("Anterior");
        botonAnterior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnterior1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAnterior1);
        botonAnterior1.setBounds(20, 1000, 150, 50);

        botonAnterior3.setVisible(false);
        botonAnterior3.setText("Anterior");
        botonAnterior3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnterior3ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAnterior3);
        botonAnterior3.setBounds(20, 1000, 150, 50);

        botonAnterior4.setVisible(false);
        botonAnterior4.setText("Anterior");
        botonAnterior4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnterior4ActionPerformed(evt);
            }
        });
        getContentPane().add(botonAnterior4);
        botonAnterior4.setBounds(20, 1000, 150, 50);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenes/his1.jpg"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed

        switch (contadorBoton) {

            case 0:

                //Primera intearación
                textoHistoria.setVisible(false);
                Icon imgHis2;
                imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/his.jpg"));
                fondo.setIcon(imgHis2);
                //Hacemos visisibles los labels para contar la historia
                jLabel1.setVisible(true);
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                //suamamos un valor al contador
                contadorBoton++;
                break;
            //Segunda interación
            case 1:
                botonAnterior1.setVisible(true);
                imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/castle.jpg"));
                fondo.setIcon(imgHis2);
                /*Quitamos los anteriores*/
                jLabel1.setVisible(false);
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                jLabel4.setVisible(false);
                jLabel5.setVisible(false);
                jLabel6.setVisible(false);
                /*ponemos los nuevos*/
                jLabel7.setVisible(true);
                jLabel8.setVisible(true);
                jLabel9.setVisible(true);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);

                contadorBoton++;
                break;
            case 2:
                botonAnterior1.setVisible(false);
                botonAnterior2.setVisible(true);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                jLabel10.setVisible(false);
                jLabel11.setVisible(false);
                imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/dragon_v2.jpg"));
                fondo.setIcon(imgHis2);

                contadorBoton++;
                break;
            case 3:
                botonAnterior2.setVisible(false);
                botonAnterior3.setVisible(true);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                jLabel10.setVisible(false);
                jLabel11.setVisible(false);

                imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/dragonfight2.png"));
                fondo.setIcon(imgHis2);
                contadorBoton++;
                break;
            case 4:
                botonAnterior3.setVisible(false);
                botonAnterior4.setVisible(true);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                jLabel10.setVisible(false);
                jLabel11.setVisible(false);
                imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/demon_v2.jpg"));
                fondo.setIcon(imgHis2);
                contadorBoton++;
                break;
            case 5:
                botonAnterior4.setVisible(false);
                botonSiguiente.setText("Empezar");
                imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/castle2.jpg"));
                fondo.setIcon(imgHis2);
                contadorBoton++;
                break;
            case 6:
                new Tutorial().setVisible(true);
                dispose();
                break;
        }


    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAnterior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnterior1ActionPerformed

        //Primera intearación
        textoHistoria.setVisible(false);
        Icon imgHis2;
        imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/his.jpg"));
        fondo.setIcon(imgHis2);

        /*borramos los labels de la siguiente ventana y escribimos los de la anterior*/
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);

        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        botonAnterior1.setVisible(false);
        contadorBoton = 1;
    }//GEN-LAST:event_botonAnterior1ActionPerformed

    private void botonAnterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnterior2ActionPerformed

        Icon imgHis2;
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setVisible(true);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/castle.jpg"));
        fondo.setIcon(imgHis2);
        botonAnterior2.setVisible(false);
        botonAnterior1.setVisible(true);
        contadorBoton = 2;
    }//GEN-LAST:event_botonAnterior2ActionPerformed

    private void botonAnterior4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnterior4ActionPerformed

        Icon imgHis2;
        imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/dragonfight2.png"));
        fondo.setIcon(imgHis2);
        botonAnterior4.setVisible(false);
        botonAnterior3.setVisible(true);
        contadorBoton = 4;
    }//GEN-LAST:event_botonAnterior4ActionPerformed

    private void botonAnterior3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnterior3ActionPerformed

        Icon imgHis2;
        imgHis2 = new ImageIcon(getClass().getResource("../imagenes/imagenes/dragon_v2.jpg"));
        fondo.setIcon(imgHis2);
        botonAnterior3.setVisible(false);
        botonAnterior2.setVisible(true);
        contadorBoton = 3;

    }//GEN-LAST:event_botonAnterior3ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioHistoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnterior1;
    private javax.swing.JButton botonAnterior2;
    private javax.swing.JButton botonAnterior3;
    private javax.swing.JButton botonAnterior4;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel textoHistoria;
    // End of variables declaration//GEN-END:variables
}
