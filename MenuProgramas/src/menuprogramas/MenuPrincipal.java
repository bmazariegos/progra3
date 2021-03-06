
package menuprogramas;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar la forma en la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        btn_NominasinBD = new javax.swing.JButton();
        btn_Colas = new javax.swing.JButton();
        btn_Pilas = new javax.swing.JButton();
        btn_NominaconBD = new javax.swing.JButton();
        Eti_titulo = new javax.swing.JLabel();
        btn_Arboles = new javax.swing.JButton();
        btn_Torres = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_Listas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione una opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_NominasinBD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_NominasinBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/nomina.jpg"))); // NOI18N
        btn_NominasinBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NominasinBDActionPerformed(evt);
            }
        });
        getContentPane().add(btn_NominasinBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, 70));

        btn_Colas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Colas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/cola.png"))); // NOI18N
        btn_Colas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ColasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Colas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 80, 70));

        btn_Pilas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Pilas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/pila.png"))); // NOI18N
        btn_Pilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PilasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Pilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 70));

        btn_NominaconBD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_NominaconBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/BD.jpg"))); // NOI18N
        btn_NominaconBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NominaconBDActionPerformed(evt);
            }
        });
        getContentPane().add(btn_NominaconBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 80, 70));

        Eti_titulo.setFont(new java.awt.Font("Fredericka the Great", 1, 36)); // NOI18N
        Eti_titulo.setForeground(new java.awt.Color(0, 153, 153));
        Eti_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eti_titulo.setText("MENÚ PRINCIPAL");
        getContentPane().add(Eti_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 400, 50));

        btn_Arboles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Arboles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/arbol.png"))); // NOI18N
        btn_Arboles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ArbolesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Arboles, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 80, 70));

        btn_Torres.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Torres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/hanoi.png"))); // NOI18N
        btn_Torres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TorresActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Torres, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 80, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Pilas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        btn_Listas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Listas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/lista.jpg"))); // NOI18N
        btn_Listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ListasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Listas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 80, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Nomina sin BD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Listas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Colas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Nomina con BD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("Torres de hanoi");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("Arboles binarios ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione una opcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 153, 153))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 690, 370));

        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuprogramas/SALIR.png"))); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 80, 70));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Salir");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PilasActionPerformed
        MenuPilas regres = new MenuPilas();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_PilasActionPerformed

    private void btn_NominasinBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NominasinBDActionPerformed
        MenuNominaSinBD NomsinBD = new MenuNominaSinBD();
        NomsinBD.show();
        dispose();
    }//GEN-LAST:event_btn_NominasinBDActionPerformed

    private void btn_ArbolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ArbolesActionPerformed
        MenuArboles regres = new MenuArboles();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_ArbolesActionPerformed

    private void btn_ColasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ColasActionPerformed
        MenuColas regres = new MenuColas();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_ColasActionPerformed

    private void btn_NominaconBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NominaconBDActionPerformed
        MenuNominaconBD regres = new MenuNominaconBD();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_NominaconBDActionPerformed

    private void btn_TorresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TorresActionPerformed
        MenuTorres regres = new MenuTorres();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_TorresActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
         int codigo = JOptionPane.showConfirmDialog(null,"¿Seguro que desea SALIR ?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
             System.exit(0);
        }else if(codigo==JOptionPane.NO_OPTION){
          MenuPrincipal ventana = new MenuPrincipal();
        ventana.show();
        dispose();
        }
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void btn_ListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ListasActionPerformed
        MenuListas regres = new MenuListas();
        regres.show();
        dispose();
    }//GEN-LAST:event_btn_ListasActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eti_titulo;
    private javax.swing.JButton btn_Arboles;
    private javax.swing.JButton btn_Colas;
    private javax.swing.JButton btn_Listas;
    private javax.swing.JButton btn_NominaconBD;
    private javax.swing.JButton btn_NominasinBD;
    private javax.swing.JButton btn_Pilas;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_Torres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
