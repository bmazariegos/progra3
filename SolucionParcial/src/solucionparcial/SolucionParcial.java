/*
 * el siguente programa realiza la gestien de notas de 10 alumnos
 * da resultados de si gano o perdio
 * BRyan Estuardo Mazariegos Davila 0901-17-1001
 */
package solucionparcial;
import javax.swing.JOptionPane;

public class SolucionParcial {
//MAtriz que contiene los datos de los alumnos
private static String StrNotas[][]= new String[10][3];
 //funcion que determina un valor random de los parametros resividos
    public static int LlenadoRandom(int IMinimo, int IMaximo){
        return((int)Math.floor(Math.random()*(IMaximo-IMinimo+1)+IMinimo));//regresa el valor random
    }
    //funcion de menu principal que retorna la opcion elegida
    public static int Menu(){
        
    String StrOp=JOptionPane.showInputDialog(null, "Ingrese una opcion:\n"+"0.- Salir\n"+
                "1-Calificacion de notas\n"+
                "2-Promedio de la clase");
    return(Integer.parseInt(StrOp));
    }
    //procedimiento con el cual se llena la matriz
    public static void IngresoDatos(){
        int IFila=0,ICol=0;
        int INota;
        for(IFila=0;IFila<10;IFila++)
        {
            StrNotas[IFila][0]=JOptionPane.showInputDialog(null, "Ingrse nombre del alumno:");
            INota=LlenadoRandom(0,100);
            StrNotas[IFila][1]=Integer.toString(INota);
            if(INota<61)
                StrNotas[IFila][2]="Perdio";
            else
                StrNotas[IFila][2]="gano";
        }
    }
    //procedimiento que muestra los datos
    public static void MostrarMatriz(){
        int IFila=0;
        System.out.println("Nombre\t\tNOta\t\tGano/Perdio");
        for(IFila=0;IFila<10;IFila++)
        {
            System.out.println(StrNotas[IFila][0]+"\t\t"+StrNotas[IFila][1]+"\t\t"+StrNotas[IFila][2]);
        }
    }
    //realiza el calculo del promedio y lo muestra
    public static void Promedio(){
        int ISumaNotas=0;
         int IFila=0,ICol=0;
        int INota;
        float FltPromedio;
        for(IFila=0;IFila<10;IFila++)
        {
           ISumaNotas+=Integer.parseInt(StrNotas[IFila][1]);
        }
        FltPromedio=ISumaNotas/10;
        System.out.println("El promedio de la clase es:"+FltPromedio);
    }
    //funcion principal
    public static void main(String[] args) {
        int IOp;
        IngresoDatos();//realiza el llenado de la matriz
        do{
        IOp=Menu();//resive la opcion elegida por el usuario
        switch(IOp)
        {
            case 0: 
                IOp = 0;//salir
                break;
            case 1:
                MostrarMatriz();//muestra si gano o perdio el estudiante
                break;
            case 2:
                Promedio();//se llama al precedimiento promedio
                break;
            default:
                JOptionPane.showMessageDialog(null, "opcion no existente");
                break;
        }
        }
        while(IOp!=0);
    }
    
}
