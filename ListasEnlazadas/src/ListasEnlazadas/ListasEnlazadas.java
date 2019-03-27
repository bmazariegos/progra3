/*
 * Esta clase contiene todos los metodos que se le pueden aplicar a la lista
 * Bryan Estuardo Mazariegos Davila 0901-17-1001 
 */
package ListasEnlazadas;


public class ListasEnlazadas
{
    	Nodo Primero;
	public ListasEnlazadas()
	{
		Primero=null;
	}
	public boolean vacia()
	{
		if (Primero==null)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
	public void InsertarEnPrimero(int Dato)
	{
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
	public void borrarPrimero()
	{
		Primero=Primero.Siguiente;
	}
	public String Listar()
	{
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
	public void borrarUltimo()
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null)
		{
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
	public void borrarPosicion(int pos)
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
		if (pos>0)
		{
			while (k!=pos && actual.Siguiente != null)
			{
				anterior=actual;
				actual=actual.Siguiente;
				k++;
				System.out.println("K       "+k);
			}
			anterior.Siguiente=actual.Siguiente;
		}
	}
        public String LocalizarPosicion(String StrDato)//Retorna el valor de la posicion del dato
	{
		int IDato=0;
                String StrMensaje="";
		Nodo aux=Primero;
                Nodo Sig=Primero;
		while (Sig!=null)
		{
                    if(StrDato.equals(Integer.toString(aux.info))){
                        aux=null;
                        Sig=null;
                        StrMensaje=String.valueOf(IDato);
                    }else{
                        IDato++;
                        aux = aux.Siguiente;
                        Sig=Sig.Siguiente;
                        if(Sig==null)
                        StrMensaje="Dato no existente";
                    } 
		}
		return(StrMensaje);
	}
        public String BorrarDato(String StrDato)//Borra el dato especificado
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
                int Error=0;
                String StrMensaje="Dato eliminado"; 
			while (actual != null)
			{
                            if((StrDato).equals(Integer.toString(actual.info))){//compara si existe el dato
                                anterior.Siguiente=actual.Siguiente;
                                Error=2;
                           break;
                            }else{
				anterior=actual;
				actual=actual.Siguiente; 
                            }
			}			
                        if(Error==0){//si dato no existiera
                        StrMensaje="Dato no existente";
                        }
                  return(StrMensaje);
}

}
