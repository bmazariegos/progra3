/*
 * Clase que contiene el manejo de la lista en el programa
 * Bryan Estuardo Mazariegos Davila 0901-17-1001
 */

package estructuralibros;

public class Lista {
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
        //metodo de mostrar (Listar) muestra los datos que contiene la lista
        public String MostrarLista(){
		String StrDato=" ";
		Nodo aux= cabeza;
                //hace mientras la direccion de la lista no sea igual a null
		while (aux!=null)
		{         //concatena los datos en el nodo en la variable dato
			StrDato +="TITULO : " + aux.libro.getTitulo()+ "\n AUTOR : "+aux.libro.getAutor()+"\n ISBN : "+aux.libro.getIsbn()+"\n";
			aux=aux.siguiente;
		}
		return(StrDato);//regresa lo que contiene StrDato
	}
        //metodo inserta al principio de lalista
	public void insertarPrincipio(Libro libro) {
		Nodo nodo=new Nodo(libro);//crea un nodo con los datos de la clase libro
		nodo.siguiente=cabeza;//asigna el valor de al que apunta cabeza al nuevo nodo
		cabeza=nodo;//le asigna el valor del nueno nodo a cabeza
		longitud++;//le suma 1 a la longitud	
	}
        //metodo inserta al final de la lista
	public void insertarFinal(Libro libro) {
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
        //metodo inserta el dato despues de uno determinado
	public void insertarDespues(int n, Libro libro) {
		Nodo nodo=new Nodo(libro);//crea un nodo con los datos de la clase libro
		if (cabeza==null) {
			cabeza=nodo;
		} else {
			Nodo puntero=cabeza;
			int contador=0;
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			nodo.siguiente=puntero.siguiente;
			puntero.siguiente=nodo;
		}
		longitud++;//le suma 1 a la longitud	
	}
        //metodo obtiene la direccion de menoria del libro
	public Libro obtener(int n) {
		if (cabeza==null) {
			return null;
		} else {
			Nodo puntero=cabeza;
			int contador=0;
			while (contador<n && puntero.siguiente!=null) {
				puntero=puntero.siguiente;
				contador++;
			}
			if (contador!=n) {
				return null;
			} else {
				return puntero.libro;
			}
		}
	}
        //metodo retorna la longitud (el tamaño de la lista
	public int contar() {
		return longitud;//regresa la longitud del la lista
	}
        //metodo retorna cabesa de la lista a null
        public boolean estaVacia() {
            return cabeza==null;//vacia la lista regresa cabeza a null
        }
        //elimina el primer nodo de la lista
        public void eliminaPrincipio() {
            if (cabeza!=null){
                Nodo primer = cabeza;
                cabeza=cabeza.siguiente=null;
                longitud--;//le reata 1 a la longitud	
            }
        }
        //metodo elimina el ultino dato en la lista
        public void eliminarUltimo() {
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
        //elimina un dato (libro) en una posicion determinada
        public void eliminarLibro(int n) {
            if (cabeza!=null){
                if (n==0){
                    Nodo primer=cabeza;
                    cabeza=cabeza.siguiente;
                    primer.siguiente=null;
                    longitud--;
                } else if (n<longitud) {
                    Nodo puntero=cabeza;
                    int contador=0;
                    while (contador<(n-1)){
                        puntero=puntero.siguiente;
                        contador++;
                    }
                    Nodo temp=puntero.siguiente;
                    puntero.siguiente=temp.siguiente;
                    temp.siguiente=null;
                    longitud--;//le reata 1 a la longitud	
                }
            }
        }
}
