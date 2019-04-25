/*
 * Clase que contiene los metodos de funcionalidad de una pila
 * Bryan Estuardo Mazariegos Davila 0901-17-1001
 */
package pilas;

public class Pilas {
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
        //metodo insertar en la pila
        public void Push(Libro libro) {
		Nodo nodo=new Nodo(libro);//crea un nodo con los datos de la clase libro
		if (cabeza==null) {//compara que si es el principio
			cabeza=nodo;//si es el principio cabeza apuntara al nodo creado
		} else {//de lo contrario el ultimo apuntara al nuevo nodo
			Nodo puntero=cabeza;
			while (puntero.siguiente!=null) {
				puntero=puntero.siguiente;
			}
			puntero.siguiente=nodo;
		}
		longitud++;//le suma 1 a la longitud	
	}
        //metodo elimina d ela pila
        public void Pop() {
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
        public String MostrarPila(){
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
        //metodo elimina obtenr y ver lo que contiene la cima
        public String Top() {
            String StrDato=" ";
            if (cabeza!= null) {
                if (cabeza.siguiente==null) {
                    StrDato +="TITULO : " + cabeza.libro.getTitulo()+ "\n AUTOR : "+cabeza.libro.getAutor()+"\n ISBN : "+cabeza.libro.getIsbn()+"\n";
                } else {
                    Nodo puntero=cabeza;
                    while (puntero.siguiente!=null) {                    
                        puntero=puntero.siguiente;
                    }
                    StrDato +="TITULO : " + puntero.libro.getTitulo()+ "\n AUTOR : "+puntero.libro.getAutor()+"\n ISBN : "+puntero.libro.getIsbn()+"\n";
                }
            }
            return(StrDato);
        }
        //metodo retorna cabeza de la pila a null(borra la pila)
        public String BorrarPila() {
            cabeza=null;//vacia la pila regresa cabeza a null
            return ("Pila borrada");
        }
        //metodo para ver si la pila esta vacia
        public boolean estaVacia() {
            return cabeza==null;//compara si la pila esta vacia y retorna true si esta vacia y false si ya contiene datos
        }
    
}
