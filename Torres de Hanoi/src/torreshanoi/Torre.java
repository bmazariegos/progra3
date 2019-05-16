/**
 * Bryan Estuardo Mazariegos Davila 0901-17-1001
 * el programa que acontinuacion se presenta realiza el control de las pilas para realizar el 
 * el manejo de las torres.
 * y los pasos que se van realizando se muestran en un mensaje en pantalla
 */
package torreshanoi;

import javax.swing.JOptionPane;
public class Torre {
Nodo ls=new Nodo(); 
Nodo ls2=new Nodo();
Nodo ls3=new Nodo();
public static void main(String[] args) { 
    //variable del tipo torre para llamar metodos no estaticos
Torre tr=new Torre();    
int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de discos"));//se obtiene la cantidad de discos
tr.llenar(n);//se llama al metodo enviando la cantidad de discos
tr.Hanoi(n, 1, 2, 3);//se evalua en este procedimiento los discos
    }
public void Hanoi(int n,int origen,int auxiliar,int destino){//procedimiento con paso de parametros, este es el que gestiona la torre de hanoi
    if(n==1){//si n fuera a uno solo realiza un movimiento
movimientos(origen,destino);
}else{//si no fuera uno realiza estos datos
Hanoi(n-1, origen, destino, auxiliar);
movimientos(origen,destino);
Hanoi(n-1,auxiliar, origen, destino);
}
}
public void movimientos(int origen, int destino){//metodo en donde se obtiene de que fila se va a quitar y en donde se va a poner
    int intNum=0; 
    //aca se mira de que fila se obtiene el dato y se guarda y se elimina de la lista
    if(origen==1){intNum=ls.PULL();ls.POP();}
    if(origen==2){intNum=ls2.PULL();ls2.POP();}
    if(origen==3){intNum=ls3.PULL();ls3.POP();}
    //aca se ingresa el dato en la fila dictada
    if(destino==1){ls.PUSH(new Hanoi(intNum));}
    if(destino==2){ls2.PUSH(new Hanoi(intNum));}
    if(destino==3){ls3.PUSH(new Hanoi(intNum));}
    
    JOptionPane.showMessageDialog(null,"Torre #1    "+ls.visualizar()+"\n"+"Torre #2    "+ls2.visualizar()+"\n"+"Torre #3    "+ls3.visualizar()); 
    
}
public void llenar(int n){
for(int i = n; i>0; i--){
    //se llena la primera fila
    ls.PUSH(new Hanoi(i));  
}
JOptionPane.showMessageDialog(null,"Torre #1    "+ls.visualizar()+"\n"+"Torre #2    "+ls2.visualizar()+"\n"+"Torre #3    "+ls3.visualizar());  
}
}
