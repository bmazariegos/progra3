/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.usuarios;
/**
 *
 * @author CARLOS JAVIER
 */
public class Ingreso_Empleado extends javax.swing.JFrame {
 Conexion con = new Conexion();
 private String StrIDPuesto;
 private String StrIDDepartamento;
usuarios mod = new usuarios();

    /**
     * Creates new form Ingreso_Empleado
     */
    public Ingreso_Empleado(usuarios usr) {
        initComponents();
        Tipo_Usuario(usr);
        this.setLocationRelativeTo(null);//centrar la forma en la pantalla
        setTitle("Nomina");
        getContentPane().setBackground(Color.GRAY);
        Btn_Guardar.setIcon(new ImageIcon("iconos/GUARDAR.PNG"));
        Btn_Regresar.setIcon(new ImageIcon("iconos/REGRESAR.PNG"));
        inicombobox();    }
    
    private void Tipo_Usuario(usuarios usr){
        mod.setId_tipo(usr.getId_tipo());
    }
    private String CodigoAutomatico()
    {
        int IUltimoID=0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection co = con.getConexion();
        try {
                ps = co.prepareStatement("SELECT COUNT(ID_Empleado)AS maximo FROM empleado");
                rs= ps.executeQuery();
                if (rs.next()){
                   IUltimoID=Integer.parseInt(rs.getString("maximo"));
                   IUltimoID += 1;
                }   
             co.close(); 
            } catch (Exception e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null,"Error al relizar el codigo automatico");
            }
        return(Integer.toString(IUltimoID));
    }
    private void inicombobox(){

        Connection Conex = con.getConexion();
        try {
            ResultSet Listado = Conex.createStatement().executeQuery("SELECT NombrePuesto FROM puesto");
     
                ResultSetMetaData metaDatos = Listado.getMetaData();                
         
                while(Listado.next()){
                Cbx_Puesto.addItem(Listado.getObject(1).toString());
                
                }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la consulata inizacion combobox universidad");
        } 
        try {
            ResultSet Listado = Conex.createStatement().executeQuery("SELECT NombreDepartamento FROM departamento");
     
                ResultSetMetaData metaDatos = Listado.getMetaData();                
         
                while(Listado.next()){
                Cbx_Departamento.addItem(Listado.getObject(1).toString());
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la consulata inizacion combobox universidad");
        } 
    }
   
    private void guardadocombobox(){
        Connection Conex = con.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
             ps = Conex.prepareStatement("SELECT ID_Puesto,ID_Departamento FROM puesto,departamento WHERE NombrePuesto = ? AND NombreDepartamento = ?");
             ps.setString(1, Cbx_Puesto.getSelectedItem().toString());
             ps.setString(2, Cbx_Departamento.getSelectedItem().toString());
             rs = ps.executeQuery();
             
             if(rs.next())
              {
                StrIDPuesto=rs.getString("ID_Puesto");
                StrIDDepartamento=rs.getString("ID_Departamento");
              }
             else
                {
                    JOptionPane.showMessageDialog(null,"Error datos de Puesto y Departamento no existen");
                }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR en la consulta de universidad"+ex);
        }
    }
    private void limpiar() {
        Txt_NombreEmpleado.setText(null);
        Txt_Sueldo.setText(null);
        Cbx_Puesto.setSelectedIndex(0);
        Cbx_Departamento.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eti_titulo = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JButton();
        Eti_regresar = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Eti_Guardar = new javax.swing.JLabel();
        Txt_NombreEmpleado = new javax.swing.JTextField();
        eti_NombreEmp = new javax.swing.JLabel();
        eti_Sueldo = new javax.swing.JLabel();
        Txt_Sueldo = new javax.swing.JTextField();
        Cbx_Puesto = new javax.swing.JComboBox<>();
        Eti_Puesto = new javax.swing.JLabel();
        Cbx_Departamento = new javax.swing.JComboBox<>();
        Eti_Departamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Eti_titulo.setFont(new java.awt.Font("Fredericka the Great", 1, 24)); // NOI18N
        Eti_titulo.setForeground(new java.awt.Color(0, 153, 153));
        Eti_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eti_titulo.setText("Nuevo empleado");

        Btn_Regresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        Eti_regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Eti_regresar.setText("Salir");

        Btn_Guardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(0, 153, 153));
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Eti_Guardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Eti_Guardar.setText("Guardar");

        Txt_NombreEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        eti_NombreEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eti_NombreEmp.setForeground(new java.awt.Color(0, 153, 153));
        eti_NombreEmp.setText("Nombre:");

        eti_Sueldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eti_Sueldo.setForeground(new java.awt.Color(0, 153, 153));
        eti_Sueldo.setText("Sueldo base:");

        Txt_Sueldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Cbx_Puesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cbx_Puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        Eti_Puesto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Eti_Puesto.setForeground(new java.awt.Color(0, 153, 153));
        Eti_Puesto.setText("Puesto del empleado:");

        Cbx_Departamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cbx_Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));

        Eti_Departamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Eti_Departamento.setForeground(new java.awt.Color(0, 153, 153));
        Eti_Departamento.setText("Departamento de la empresa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eti_Sueldo)
                                    .addComponent(eti_NombreEmp))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txt_Sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(Txt_NombreEmpleado)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Eti_Puesto)
                                .addGap(18, 18, 18)
                                .addComponent(Cbx_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Eti_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Eti_Departamento)
                        .addGap(21, 21, 21)
                        .addComponent(Cbx_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Eti_regresar)
                        .addGap(74, 74, 74)
                        .addComponent(Eti_Guardar)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Eti_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_NombreEmp)
                    .addComponent(Txt_NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eti_Sueldo)
                    .addComponent(Txt_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eti_Puesto)
                    .addComponent(Cbx_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Eti_Departamento))
                    .addComponent(Cbx_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Eti_regresar)
                    .addComponent(Eti_Guardar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed

        Menu_Principal regres = new Menu_Principal(mod);
        regres.show();
        dispose();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed

        PreparedStatement ps = null;
        Connection co = con.getConexion();
        String StrNuevoID=null;
        StrNuevoID=CodigoAutomatico();
        JOptionPane.showMessageDialog(null,""+StrNuevoID);
        if (Txt_NombreEmpleado.getText().equals("") || Txt_Sueldo.getText().equals("") || Cbx_Puesto.getSelectedItem().equals("")|| Cbx_Departamento.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Existen Campos Vacios, debe llenar Todos los Campos", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            guardadocombobox();
            try {
                ps = co.prepareStatement("INSERT INTO empleado (ID_Empleado,NombreEmpleado,SueldoEmpleado,ID_Puesto,ID_Departamento) VALUES(?,?,?,?,?)");
                ps.setString(1, StrNuevoID );
                ps.setString(2, Txt_NombreEmpleado.getText());
                ps.setString(3, Txt_Sueldo.getText());
                ps.setString(4, StrIDPuesto);
                ps.setString(5, StrIDDepartamento);

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Empleado Guardada Con Exito");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Intentar Guardar el empleado");
                    limpiar();
                }
                co.close();
            } catch (Exception e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null,"Error al Intentar Guardar el empleado");
                limpiar();
            }
        }
    }//GEN-LAST:event_Btn_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                usuarios mod = new usuarios();
                new Ingreso_Empleado(mod).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JComboBox<String> Cbx_Departamento;
    private javax.swing.JComboBox<String> Cbx_Puesto;
    private javax.swing.JLabel Eti_Departamento;
    private javax.swing.JLabel Eti_Guardar;
    private javax.swing.JLabel Eti_Puesto;
    private javax.swing.JLabel Eti_regresar;
    private javax.swing.JLabel Eti_titulo;
    private javax.swing.JTextField Txt_NombreEmpleado;
    private javax.swing.JTextField Txt_Sueldo;
    private javax.swing.JLabel eti_NombreEmp;
    private javax.swing.JLabel eti_Sueldo;
    // End of variables declaration//GEN-END:variables
}
