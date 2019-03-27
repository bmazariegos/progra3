/*
<<<<<<< HEAD
 * El programa reliza la creacion de una lista y sus controles
 * Bryan Estuardo Mazariegos Davila 0901-17-1001 
 */
package ListasEnlazadas;


=======
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

/**
 *
 * @author EDUARDO
 */
>>>>>>> 04b68461570018bcd14dac10482627f48a7198f0
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListasEnlazadas miLista=new ListasEnlazadas();
	miLista.InsertarEnPrimero(10);
	miLista.InsertarEnPrimero(15);
	miLista.InsertarEnPrimero(30);
	miLista.InsertarEnPrimero(50);
	miLista.InsertarEnPrimero(40);
	miLista.InsertarEnPrimero(60);
	System.out.println(miLista.Listar());
	System.out.println("borrar");
<<<<<<< HEAD
        /*miLista.borrarUltimo();
        miLista.borrarPrimero();*/
        System.out.println("Dato buscado: 10\n"+"Dato en la posicion:"+miLista.LocalizarPosicion("10"));
	System.out.println("Dato a eliminar: 50\n"+miLista.BorrarDato("50"));
=======
	miLista.borrarUltimo();
        miLista.borrarPrimero();
	
>>>>>>> 04b68461570018bcd14dac10482627f48a7198f0
	System.out.println(miLista.Listar());
// TODO code application logic here
    }
    
}
