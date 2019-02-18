/**
 * @author BRYAN ESTUARDO MAZARIEGOS DAVILA
 *  0901-17-1001
 *  Control de sueldos de los empleados en planilla y total por cada deparamento 
 */
package lab3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lab3 extends javax.swing.JFrame {

    /**
     * Creates new form Lab3
     */
    private final String StrPlanilla[][] = new String[10][7];//matriz de la nomina
    private final double StrTotalDepar[][] = new double[6][2];//matris de los totales por departamento
    DecimalFormat deci= new DecimalFormat("#.00");//clase que controla la cantidad de decimales
    public Lab3() {
        initComponents();
        setLocation(100,100);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Info = new javax.swing.JTable();
        BtnLlenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_TotalDepartamento = new javax.swing.JTable();
        BtnTotalDepartamento = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina");
        setBackground(new java.awt.Color(204, 204, 204));
        setIconImages(null);

        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Nombre  empleado", "Sueldo base", "ISR", "Total Deduciones", "Total Percepciones", "Sueldo liquido"
            }
        ));
        jScrollPane1.setViewportView(Tbl_Info);

        BtnLlenar.setText("Llenar");
        BtnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLlenarActionPerformed(evt);
            }
        });

        Tbl_TotalDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamnto", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tbl_TotalDepartamento);
        if (Tbl_TotalDepartamento.getColumnModel().getColumnCount() > 0) {
            Tbl_TotalDepartamento.getColumnModel().getColumn(0).setResizable(false);
            Tbl_TotalDepartamento.getColumnModel().getColumn(1).setResizable(false);
        }

        BtnTotalDepartamento.setText("<html>\nCalcular Total </br>\nDepartamento");
        BtnTotalDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotalDepartamentoActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Nuevo calculo");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnTotalDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnLlenar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTotalDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//funcion que determina un valor random de los parametros resividos
    public int llenado(int IMinimo, int IMaximo){
        return((int)Math.floor(Math.random()*(IMaximo-IMinimo+1)+IMinimo));//regresa el valor random
        
    }
    
    private void BtnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLlenarActionPerformed
        // TODO add your handling code here:
        int IFila,ICol;//variables para el llenado de la matriz
        String StrSimbolo = null;//variable para el simbolo de dinero
        double ITotalDeduciones;
        //array que contiene los valorea de ISR a aplicar
        double ISR[]= new double[2];
        ISR[0]=0.05;
        ISR[1]=0.07;
        //Obtenemos el modelo de la tabla en la cual vamos a trabajar
        DefaultTableModel modelo = (DefaultTableModel) Tbl_Info.getModel();
        //Creamos un arreglo de tipo Objeto donde guardaremos los datos de cada columna
        Object[] Fila = new  Object[7];
        //Ciclo de llenado de la tabla Y matriz
        for(IFila=0;IFila<=9;IFila++)
        {
            for(ICol=0;ICol<=6;ICol++)
            {
                switch(ICol)//el switch contola la posicion de los datos en cada columna
               {
                    case 0://opcion de departamento
                        StrSimbolo="";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(6,0));
                        break;
                    case 1://opcion de nombre del empleado
                        StrSimbolo="";
                        StrPlanilla[IFila][ICol] = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
                        break;
                    case 2://opcion de sueldo base
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(5000,2000));
                        break;
                    case 3://opcionde calculo de ISR
                        StrSimbolo="Q  ";
                        //if que controla el porcentage a aplicar a cada empleado
                        if(((Integer.parseInt(StrPlanilla[IFila][2]))>0)&&((Integer.parseInt(StrPlanilla[IFila][2]))<=2500))
                        {//ISR del 5%
                            double Impuesto=Double.parseDouble(StrPlanilla[IFila][2]);
                            Impuesto*=ISR[0];
                            StrPlanilla[IFila][ICol]= String.valueOf(deci.format(Impuesto));
                        }
                        else
                        {//ISR del /%
                            double Impuesto=Double.parseDouble(StrPlanilla[IFila][2]);
                            Impuesto*=ISR[1];
                            StrPlanilla[IFila][ICol]= String.valueOf(deci.format(Impuesto));
                        }
                        break;
                    case 4://suma de la deduciones del empleado
                        StrSimbolo="Q  ";
                        ITotalDeduciones=llenado(1000,100);
                        ITotalDeduciones+=Double.parseDouble(StrPlanilla[IFila][3]);
                        StrPlanilla[IFila][ICol] = String.valueOf(deci.format(ITotalDeduciones));
                        break;
                    case 5://Suma de las percepciones del empleado
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(1000,0));
                        break;
                    case 6://suma y resta de las percecciones y de deducciones
                        StrSimbolo="Q  ";
                        double ISueldoBase = Double.parseDouble(StrPlanilla[IFila][2]);
                        ITotalDeduciones = Double.parseDouble(StrPlanilla[IFila][4]);
                        double ITotalPercepciones =Double.parseDouble(StrPlanilla[IFila][5]);
                        StrPlanilla[IFila][ICol]= String.valueOf(deci.format((ISueldoBase-ITotalDeduciones)+ ITotalPercepciones));
                        break;
               }
                //Guardado en la variable objeto Fila de cada dato de cada columna
                Fila[ICol]=StrSimbolo+StrPlanilla[IFila][ICol];
            }
            //agregamos el arreglo de la cada fila a la tabla
            modelo.addRow(Fila);
            //Asignamos y/o aplicamos el modelo a nuestra tabla
            Tbl_Info.setModel(modelo);
        }
        
    }//GEN-LAST:event_BtnLlenarActionPerformed

    private void BtnTotalDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTotalDepartamentoActionPerformed
        // TODO add your handling code here:
        int IFila=0,ICon=1;
        double ITotales;
        //Obtenemos el modelo de la tabla en la cual vamos a trabajar
        DefaultTableModel modelo = (DefaultTableModel) Tbl_TotalDepartamento.getModel();
        //Creamos un arreglo de tipo Objeto donde guardaremos los datos de cada columna
        Object[] DatosEmp = new  Object[2];
        while(IFila!=5)
        {
        StrTotalDepar[IFila][0]=ICon;//asigna el codigo de departamento a la matriz
        StrTotalDepar[IFila][1]=0;//pone en cero los totales por departamento
        IFila++;
        }
        //realiza ciclos de 1 a 5 para la sumatoria de los totales de los empleados
        while(ICon!=6){
           ITotales=0; //limpia la variable ITotales
        for(IFila=0;IFila<=9;IFila++)
        {
            //if compara en el codigo de deparatamento  de 1 a 5 y realiza la suma de los codigos iguales
            if(StrPlanilla[IFila][0].equals(Integer.toString(ICon))){
                StrTotalDepar[ICon][1] += Double.parseDouble(StrPlanilla[IFila][6]);//realiza la suma y asinacion de los totales
                ITotales = StrTotalDepar[ICon][1];
            }
        }
        DatosEmp[0]= Integer.toString(ICon);
        DatosEmp[1]= String.valueOf(deci.format(ITotales));
        ICon++;
        //agregamos el arreglo de la cada fila a la tabla
        modelo.addRow(DatosEmp);
        //Asignamos y/o aplicamos el modelo a nuestra tabla
        Tbl_TotalDepartamento.setModel(modelo);
        }
    }//GEN-LAST:event_BtnTotalDepartamentoActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
        int IFila,ICol;
        //for doble realiza la limpieza de las dos matrices (StrPlanilla y  StrTotalDepar)
        for(IFila=0;IFila<=9;IFila++)
        {
            for(ICol=0;ICol<=5;ICol++)
            {
                StrPlanilla[IFila][ICol]="";
                if(IFila<5)
                {
                    StrTotalDepar[IFila][0]= 0;
                    StrTotalDepar[IFila][1]= 0;
                }
        
            }
        }
        //establece los nuevos parametros con los que el usuario vera la tablas
        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Nombre  empleado", "Sueldo base","ISR", "Total Deduciones", "Total Percepciones", "Sueldo liquido"
            }
        ));
        Tbl_TotalDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamnto", "Total"
            }
        ));
    }//GEN-LAST:event_BtnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnLlenar;
    private javax.swing.JButton BtnTotalDepartamento;
    private javax.swing.JTable Tbl_Info;
    private javax.swing.JTable Tbl_TotalDepartamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
