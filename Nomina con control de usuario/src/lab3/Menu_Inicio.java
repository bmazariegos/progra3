/*
 * @author BRYAN ESTUARDO MAZARIEGOS DAVILA
 *  0901-17-1001
 *  Esta es la ventana de inicio de se leccion de usuarios 
 */
package lab3;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu_Inicio extends javax.swing.JFrame {
    public static login frmLog;
    /**
     * Creates new form Menu_Inicio
     */
    public Menu_Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar la forma en la pantalla
        setTitle("Nomina");
        getContentPane().setBackground(Color.GRAY);
        btn_Salir.setIcon(new ImageIcon("iconos/SALIR.PNG"));
        btn_administrador.setIcon(new ImageIcon("iconos/admin.PNG"));
        btn_usuario.setIcon(new ImageIcon("iconos/usuariosi.PNG"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eti_titulo = new javax.swing.JLabel();
        btn_administrador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_usuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(585, 475));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eti_titulo.setFont(new java.awt.Font("Fredericka the Great", 1, 48)); // NOI18N
        Eti_titulo.setForeground(new java.awt.Color(0, 153, 153));
        Eti_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eti_titulo.setText("BIENVENIDO");
        getContentPane().add(Eti_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 420, 50));

        btn_administrador.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_administrador.setForeground(new java.awt.Color(0, 153, 153));
        btn_administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administradorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_administrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 116, 90, 80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        btn_usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_usuario.setForeground(new java.awt.Color(0, 153, 153));
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btn_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 90, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Salir");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_administradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administradorActionPerformed
        login ventana = new login();
        ventana.show();
        dispose();
    }//GEN-LAST:event_btn_administradorActionPerformed

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
        /*login_usuarios ventana = new login_usuarios();
        ventana.show();
        dispose();*/
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        int codigo = JOptionPane.showConfirmDialog(null,"¿Seguro que desea SALIR ?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
            System.exit(0);
        }else if(codigo==JOptionPane.NO_OPTION){
            Menu_Inicio ventana = new Menu_Inicio();
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
            java.util.logging.Logger.getLogger(Menu_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu_Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eti_titulo;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JButton btn_administrador;
    private javax.swing.JButton btn_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
