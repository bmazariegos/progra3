/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprogramas;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuNominaSinBD extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Secundario
     */
    public MenuNominaSinBD() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar la forma en la pantalla
       
    }

    public void abrirarchivo(String archivo){
        try{
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
        }catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null,"Error en buscar el archivo"+ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Eti_titulo1 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        btn_youtube = new javax.swing.JButton();
        btn_github = new javax.swing.JButton();
        btn_codigo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione una opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eti_titulo1.setFont(new java.awt.Font("Fredericka the Great", 1, 36)); // NOI18N
        Eti_titulo1.setForeground(new java.awt.Color(0, 153, 153));
        Eti_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eti_titulo1.setText("    Nomina sin BD  ");
        getContentPane().add(Eti_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 100));

        btn_regresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/REGRESAR.png"))); // NOI18N
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 80, 70));

        btn_youtube.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_youtube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/youtube.png"))); // NOI18N
        btn_youtube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_youtubeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_youtube, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 80, 70));

        btn_github.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/github.png"))); // NOI18N
        btn_github.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_githubActionPerformed(evt);
            }
        });
        getContentPane().add(btn_github, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 80, 70));

        btn_codigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_codigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/codigo.png"))); // NOI18N
        btn_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 80, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Regresar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 70, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Link You tube");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Link git hub");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Salir");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/SALIR.png"))); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 80, 70));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione una opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 280, 340));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_codigoActionPerformed
        
        abrirarchivo("nomina/nomina/Lab3.java");
        abrirarchivo("nomina/nomina/Ingreso_Empleado.java");
        abrirarchivo("nomina/nomina/registro.java");
    }//GEN-LAST:event_btn_codigoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btn_youtubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_youtubeActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=SMdTIYChAVw"));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No se pudo conestar"+e);
        }
    }//GEN-LAST:event_btn_youtubeActionPerformed

    private void btn_githubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_githubActionPerformed
        try{
            Desktop.getDesktop().browse(new URI("https://github.com/bmazariegos/progra3/tree/master/Nomina%20con%20control%20de%20usuario"));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No se pudo conestar"+e);
        }
    }//GEN-LAST:event_btn_githubActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed

        MenuPrincipal regres = new MenuPrincipal();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        int codigo = JOptionPane.showConfirmDialog(null,"¿Seguro que desea SALIR ?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
             System.exit(0);
        }else if(codigo==JOptionPane.NO_OPTION){
          MenuNominaSinBD ventana = new MenuNominaSinBD();
        ventana.show();
        dispose();
        }
    }//GEN-LAST:event_btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuNominaSinBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuNominaSinBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuNominaSinBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuNominaSinBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNominaSinBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eti_titulo1;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_codigo;
    private javax.swing.JButton btn_github;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_youtube;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
