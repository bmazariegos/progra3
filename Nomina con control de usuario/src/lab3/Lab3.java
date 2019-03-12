/**
 * @author BRYAN ESTUARDO MAZARIEGOS DAVILA
 *  0901-17-1001
 *  Control de sueldos de los empleados en planilla y total por cada deparamento 
 */
package lab3;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Lab3 extends javax.swing.JFrame {

    /**
     * Creates new form Lab3
     */
    private final String StrPlanilla[][] = new String[10][14];//matriz de la nomina
    private final double DblTotalDepar[][] = new double[6][2];//matriz de los totales por departamento
    public static String StrNomb[] = {"Jose" ,"Laib","Carlos","Daniel","Javier","Brian","Bryan","Serguio","Ricardo","Julio"};
    DecimalFormat deci= new DecimalFormat("#.00");//clase que controla la cantidad de decimales
    public Lab3() {
        initComponents();
        this.setLocationRelativeTo(null);//centrar la forma en la pantalla
        setTitle("Nomina");
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.GRAY);
         btn_Salir.setIcon(new ImageIcon("iconos/SALIR.PNG"));
         BtnLimpiar.setIcon(new ImageIcon("iconos/limpiar.PNG"));
         BtnLlenar.setIcon(new ImageIcon("iconos/generar.PNG"));
         BtnTotalDepartamento.setIcon(new ImageIcon("iconos/budget.PNG"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Info = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_TotalDepartamento = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BtnTotalDepartamento = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnLlenar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina");
        setBackground(new java.awt.Color(102, 102, 102));
        setIconImages(null);

        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Nombre empleado ", "Sueldo base", "Comision", "Total Devendago", "Bonificaciones", "IGSS", "ISR", "Descuentos juridicos", "Total Deduciones", "Sueldo liquido"
            }
        ));
        Tbl_Info.setGridColor(new java.awt.Color(102, 102, 102));
        Tbl_Info.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(Tbl_Info);

        Tbl_TotalDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Total"
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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Nomina de empledos");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setText("Nuevo calculo");

        BtnTotalDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTotalDepartamentoActionPerformed(evt);
            }
        });

        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLlenarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Salir");

        jLabel2.setText("<html> Calcular Total <br> Departamento"); // NOI18N

        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Llenar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9))
                    .addComponent(BtnLlenar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTotalDepartamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnLimpiar)
                    .addComponent(jLabel4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_Salir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnLlenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnTotalDepartamento)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnLimpiar))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(617, 617, 617)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
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
        double DblTotalDeduciones;
        //Obtenemos el modelo de la tabla en la cual vamos a trabajar
        DefaultTableModel modelo = (DefaultTableModel) Tbl_Info.getModel();
        //Creamos un arreglo de tipo Objeto donde guardaremos los datos de cada columna
        Object[] Fila = new  Object[11];
        //Ciclo de llenado de la tabla Y matriz
        for(IFila=0;IFila<=9;IFila++)
        {
            for(ICol=0;ICol<=10;ICol++)
            {
                switch(ICol)//el switch contola la posicion de los datos en cada columna
               {
                    case 0://opcion de departamento
                        StrSimbolo="";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(6,0));
                        break;
                    case 1://opcion de nombre del empleado
                        StrSimbolo="";
                        StrPlanilla[IFila][ICol] = StrNomb[IFila];
                        break;
                    case 2://opcion de sueldo base
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(5001,2000));
                        break;
                    case 3://Comisiones
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol] = Integer.toString(llenado(1000,0));
                        break;
                    case 4://Suma de las percepciones del empleado
                        StrSimbolo="Q  ";
                        double DblPercepciones;
                        DblPercepciones=Double.parseDouble(StrPlanilla[IFila][2])+Double.parseDouble(StrPlanilla[IFila][3]);
                        StrPlanilla[IFila][ICol] = String.valueOf(deci.format(DblPercepciones));
                        break;
                    case 5://bono incentivo
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol]="250";
                        break;
                    case 6://IGSS
                        StrSimbolo="Q  ";
                        CalculoIGSS(IFila,ICol);
                        break;
                    case 7://opcionde calculo de ISR
                        StrSimbolo="Q  ";
                        //if que controla el porcentage a aplicar a cada empleado
                        if(((Integer.parseInt(StrPlanilla[IFila][2]))>0)&&((Integer.parseInt(StrPlanilla[IFila][2]))<=300000))
                        {//ISR del 5%
                            CalculoISR(IFila,ICol);
                        }
                        else
                        {//ISR del 7%
                            CalculoISR(IFila,ICol);
                        }
                        break;
                    case 8://descuentos juridicos
                        StrSimbolo="Q  ";
                        StrPlanilla[IFila][ICol]=Integer.toString(llenado(900,0));
                        break;
                    case 9://suma de la deduciones del empleado
                        StrSimbolo="Q  ";
                        DblTotalDeduciones=Double.parseDouble(StrPlanilla[IFila][6])+Double.parseDouble(StrPlanilla[IFila][7])+Double.parseDouble(StrPlanilla[IFila][8]);
                        StrPlanilla[IFila][ICol] = String.valueOf(deci.format(DblTotalDeduciones));
                        break;
                    case 10://suma y resta de las percecciones y de deducciones
                        StrSimbolo="Q  ";
                        DblTotalDeduciones = Double.parseDouble(StrPlanilla[IFila][9]);
                        double DblTotalPercepciones =Double.parseDouble(StrPlanilla[IFila][4])+Double.parseDouble(StrPlanilla[IFila][5]);
                        StrPlanilla[IFila][ICol]= String.valueOf(deci.format(DblTotalPercepciones-DblTotalDeduciones));
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
        DblTotalDepar[IFila][0]=ICon;//asigna el codigo de departamento a la matriz
        DblTotalDepar[IFila][1]=0;//pone en cero los totales por departamento
        IFila++;
        }
        //realiza ciclos de 1 a 5 para la sumatoria de los totales de los empleados
        while(ICon!=6){
           ITotales=0; //limpia la variable ITotales
        for(IFila=0;IFila<=9;IFila++)
        {
            //if compara en el codigo de deparatamento  de 1 a 5 y realiza la suma de los codigos iguales
            if(StrPlanilla[IFila][0].equals(Integer.toString(ICon))){
                DblTotalDepar[ICon][1] += Double.parseDouble(StrPlanilla[IFila][10]);//realiza la suma y asinacion de los totales
                ITotales = DblTotalDepar[ICon][1];
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
 
        //procediniento limpiar las matrices
        LimpiarMatriz();
        //procedimiento que limpiar tablas 
        LimpiarTablas();
        
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        int codigo = JOptionPane.showConfirmDialog(null,"¿Seguro que desea SALIR ?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
            System.exit(0);
            System.out.println(codigo);
        }else if(codigo==JOptionPane.NO_OPTION){
            Lab3 ventana = new Lab3();
            ventana.show();
            dispose();
        }
    }//GEN-LAST:event_btn_SalirActionPerformed

    public void LimpiarMatriz()
    {
        int IFila,ICol;
        //for doble realiza la limpieza de las dos matrices (StrPlanilla y  StrTotalDepar)
        for(IFila=0;IFila<=9;IFila++)
        {
            for(ICol=0;ICol<=5;ICol++)
            {
                StrPlanilla[IFila][ICol]="";
                if(IFila<5)
                {
                    DblTotalDepar[IFila][0]= 0;
                    DblTotalDepar[IFila][1]= 0;
                }
        
            }
        }
    }
    public void LimpiarTablas()
    {
        //establece los nuevos parametros con los que el usuario vera la tablas
        Tbl_Info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento", "Nombre empleado ", "Sueldo base", "No.horas extras", "Valor de horas extras", "Comisiones", "Total Devendago", "Bonificaciones", "IGSS", "ISR", "Anticipos", "Descuentos juridicos", "Total Deduciones", "Sueldo liquido"
            }
        ));
        Tbl_TotalDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamnto", "Total"
            }
        ));
    }
    public void CalculoISR(int IFila, int ICol)
    {
        //array que contiene los valorea de ISR a aplicar
        double ISR[]= new double[2];
        ISR[0]=0.05;
        ISR[1]=0.07;
        double DblSueldoBase, DblRentaNeta,DblOtrasDeduciones, DblRentaImponible, DblISRProyectado;
        double DblISRMensual;
        int IGastosPersonles;
        DblSueldoBase=Double.parseDouble(StrPlanilla[IFila][4]);
        DblRentaNeta= DblSueldoBase*12;
        IGastosPersonles=(int) (DblRentaNeta*0.8889);
        DblOtrasDeduciones=0;
        DblRentaImponible=DblRentaNeta-IGastosPersonles-DblOtrasDeduciones;
        DblISRProyectado=DblRentaImponible*ISR[0];
        DblISRMensual=DblISRProyectado/12;
        StrPlanilla[IFila][ICol]=String.valueOf(deci.format(DblISRMensual));
    }
    public void CalculoIGSS(int IFila, int ICol)
    {
        int ICodigo = JOptionPane.showConfirmDialog(null,"¿Se le calcula el IGSS al empleado?","ADVERTENCIA",JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE);
        if (ICodigo==JOptionPane.YES_OPTION){
            double DblPercepciones, DblIGSS;
            DblPercepciones=Double.parseDouble(StrPlanilla[IFila][4]);
            DblIGSS =(DblPercepciones*0.0483);                
            StrPlanilla[IFila][ICol] = String.valueOf(deci.format(DblIGSS));
        }else{
            StrPlanilla[IFila][ICol] = "0.00";
        }
    }
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
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
