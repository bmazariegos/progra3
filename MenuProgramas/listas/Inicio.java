/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuralibros;

/**
 *
 * @author CARLOS JAVIER
 */
public class Inicio {
    public static void main(String[] args){
        Lista lista= new Lista();
        for(int cont=0;cont<4;cont++){
        Libro libro=new Libro("h","a","d");
        lista.insertarPrincipio(libro);
        }
        //libro("","","");
        /*lista.insertarPrincipio(libro);
        lista.insertarFinal(libro);
        lista.insertarFinal(libro);*/
         for(int cont=0;cont<4;cont++){
            System.out.println("la direccion es"+lista.obtener(cont));
        }
        System.out.println("tamaño"+lista.contar());
        lista.eliminaPrincipio();
        lista.eliminarUltimo();
        lista.eliminarLibro(1);
        for(int cont=0;cont<4;cont++){
            System.out.println("la direccion es"+lista.obtener(cont));
        }
        System.out.println("tamaño"+lista.contar());
    }
    
}
