/*
 * esta clase reliza la creacion de un nodo es decir la lista en si
 * Bryan Estuardo Mazariegos Davila 0901-17-1001 
 */
package ListasEnlazadas;

public class Nodo 
{
    	int info;
	public Nodo Siguiente;
	public Nodo (int dato)
	{
		info=dato;
	}
	public void verNodo()
	{
		System.out.print("(  "+info+" )");
	}

}
