/*
 * Clase que contiene los metodos de funcionalidad de una pila
 * Bryan Estuardo Mazariegos Davila 0901-17-1001
 */
package cola;

public class Cola {
    private Nodo cabeza=null;
	private int longitud=0;
        //clase Nodo
	private class Nodo {
		public Libro libro;
		public Nodo siguiente=null;
                //Metodo crear nodo en lista de tipo lista
		public Nodo(Libro libro) {
			this.libro=libro;//crea el nodo con los datos de la estructura libro
		}
	}
        public void Crearpila()
	{
		cabeza=null;
	}
        //metodo inserta al principio de lalista
	public void Encolar(Libro libro) {
		Nodo nodo=new Nodo(libro);//crea un nodo con los datos de la clase libro
		nodo.siguiente=cabeza;//asigna el valor de al que apunta cabeza al nuevo nodo
		cabeza=nodo;//le asigna el valor del nueno nodo a cabeza
		longitud++;//le suma 1 a la longitud	
	}
        //metodo elimina de la pila
        public void Desencolar() {
            if (cabeza!= null) {
                if (cabeza.siguiente==null) {
                    cabeza=null;  
                    longitud--;
                } else {
                    Nodo puntero=cabeza;
                    while (puntero.siguiente.siguiente!=null) {                    
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=null;
                    longitud--;//le reata 1 a la longitud	
                }
            }
        }
        //metodo de MostrarPila muestra los datos que contiene la pila
        public String MostrarCola(){
		String StrDato=" ";
		Nodo aux= cabeza;
                //hace mientras la direccion de la pila no sea igual a null
		while (aux!=null)
		{         //concatena los datos en el nodo en la variable dato
			StrDato +="TITULO : " + aux.libro.getTitulo()+ "\n AUTOR : "+aux.libro.getAutor()+"\n ISBN : "+aux.libro.getIsbn()+"\n";
			aux=aux.siguiente;
		}
		return(StrDato);//regresa lo que contiene StrDato
	}
        //metodo retorna cabeza de la pila a null(borra la pila)
        public String BorrarCola() {
            cabeza=null;//vacia la pila regresa cabeza a null
            longitud=0;
            return ("Pila borrada");
        }
        //metodo para ver si la pila esta vacia
        public boolean estaVacia() {
            return cabeza==null;//compara si la pila esta vacia y retorna true si esta vacia y false si ya contiene datos
        }
        //metodo retorna la longitud (el tamaño de la lista
	public int Tamaño() {
		return longitud;//regresa la longitud del la lista
	}
}
