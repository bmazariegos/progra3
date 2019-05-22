
/**
 * Bryan Estuardo Mazariegos Davila
 * carnet: 0901-17-1001
 * controles del ingreso de de los nodos en el arbol
 * asi como también el equilibrado del mismo
 */
package arbolBB;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 
public class ArbolBB {

    private Nodo raiz;
    int num_nodos;
    int altura;

    public ArbolBB() {
        raiz = null;
    }

      //buscar
      public Nodo buscar (int d, Nodo r)
      {
        if(raiz == null)
        {
            return null;
        }else if(r.dato==d){
            return r;
      }else if(r.dato < d)
      {
        return buscar(d,r.subArbolderecho); 
      }else
      {
          return buscar(d,r.SubArbolIzquierdo);
      }
      }
      
      //obtener el factor de equilibrio
      public int obtenerFE(Nodo x)
      {
          //si el nodo x esta vacio retornara el valor de -1
          if(x== null)
          {
             return -1; 
          }else {
              //de lo contrario si tiene un elemento retornara el factor de equilibrio
              return x.FactorEquilibrio;
          }
          
      }
      //rotacion simpre izquierda
      public Nodo rotacionizquierda(Nodo c)
      {
          Nodo auxiliar = c.SubArbolIzquierdo;
          c.SubArbolIzquierdo = auxiliar.subArbolderecho;
          auxiliar.subArbolderecho = c;
          c.FactorEquilibrio =Math.max(obtenerFE(c.SubArbolIzquierdo),obtenerFE(c.subArbolderecho))+1;
          auxiliar.FactorEquilibrio = Math.max(obtenerFE(auxiliar.SubArbolIzquierdo),obtenerFE(auxiliar.subArbolderecho))+1;
          return auxiliar;
      
      }
      //rotacion simpre derecha
        public Nodo rotacionderecha(Nodo c)
      {
          Nodo auxiliar = c.subArbolderecho;
          c.subArbolderecho = auxiliar.SubArbolIzquierdo;
          auxiliar.SubArbolIzquierdo = c;
          c.FactorEquilibrio =Math.max(obtenerFE(c.SubArbolIzquierdo),obtenerFE(c.subArbolderecho))+1;
          auxiliar.FactorEquilibrio = Math.max(obtenerFE(auxiliar.SubArbolIzquierdo),obtenerFE(auxiliar.subArbolderecho))+1;
          return auxiliar;
      
      }
      //rotacion doble izquierda
        public Nodo rotacionDobleIzquierda(Nodo c)
        {
           Nodo temporal;
           c.SubArbolIzquierdo = rotacionderecha(c.SubArbolIzquierdo);
           temporal  = rotacionizquierda(c);
           return temporal;
        }
        //rotacion doble derecha
        public Nodo rotacionDobleDerecha(Nodo c)
        {
           Nodo temporal;
           c.subArbolderecho = rotacionizquierda(c.subArbolderecho);
           temporal  = rotacionderecha(c);
           return temporal;
        }
        //metodo para insertar AVL
        public Nodo insertarAVL(Nodo nuevo, Nodo subAr)
        {
            Nodo nuevoPadre = subAr ;
            if(nuevo.dato<subAr.dato)
            {
                if(subAr.SubArbolIzquierdo == null)
                {
                    subAr.SubArbolIzquierdo = nuevo;
                }else
                {
                    subAr.SubArbolIzquierdo = insertarAVL(nuevo,subAr.SubArbolIzquierdo); 
                    if((obtenerFE(subAr.SubArbolIzquierdo)-obtenerFE(subAr.subArbolderecho)==2))
                    {
                        if(nuevo.dato<subAr.SubArbolIzquierdo.dato)
                        {
                            nuevoPadre = rotacionizquierda(subAr);
                        }else 
                        {
                            nuevoPadre = rotacionDobleIzquierda(subAr);
                        }
                    }
                }
            }else if(nuevo.dato >subAr.dato)
             {
                 if(subAr.subArbolderecho == null)
                 {
                     subAr.subArbolderecho = nuevo;
                 }else
                 {
                     subAr.subArbolderecho = insertarAVL(nuevo,subAr.subArbolderecho);
                       if((obtenerFE(subAr.subArbolderecho)-obtenerFE(subAr.SubArbolIzquierdo)==2))
                       {
                           if(nuevo.dato>subAr.subArbolderecho.dato)
                        {
                            nuevoPadre = rotacionderecha(subAr);
                        }else 
                        {
                            nuevoPadre = rotacionDobleDerecha(subAr);
                        }
                       }
                 }
             }else
            {
                JOptionPane.showMessageDialog(null,"El elemento ingresado ya exixte");
            }
            //Actualizar el factor de equilibrio
            if((subAr.SubArbolIzquierdo ==  null)&&(subAr.subArbolderecho != null))
            {
               subAr.FactorEquilibrio = subAr.subArbolderecho.FactorEquilibrio+1; 
            }else if((subAr.subArbolderecho==  null) &&(subAr.SubArbolIzquierdo != null))
            {
               subAr.FactorEquilibrio = subAr.SubArbolIzquierdo.FactorEquilibrio+1; 
            }else
            {
              subAr.FactorEquilibrio = Math.max(obtenerFE(subAr.SubArbolIzquierdo),obtenerFE(subAr.subArbolderecho))+1; 
            }
            return nuevoPadre;
        }
        
        
        //Insertar 
        public boolean insertar(int d)
        {
            Nodo nuevo = new Nodo(d, null, null);
            if (raiz == null)
            {
                raiz = nuevo;
            }else
            {
                raiz = insertarAVL(nuevo,raiz);
            }
            return true;
        }
        
    public boolean agregar(int dato) {
        //le elimine el null,null despues del dato
        Nodo nuevo = new Nodo(dato, null, null);
        insertar(nuevo, raiz);
        return true;
    }
    
    //Metodo para insertar un dato en el arbol...no acepta repetidos :)
    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }

    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //Recorrido preorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();
        preorden(raiz, rec);
        return rec;
    }
    
    public void preorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            recorrido.add(aux.getDato());
            preorden(aux.getIzq(), recorrido);
            preorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }
    
    public void inorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido);
            recorrido.add(aux.getDato());
            inorden(aux.getDer(), recorrido);
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }
    public void postorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido);
            postorden(aux.getDer(), recorrido);
            recorrido.add(aux.getDato());
        }
    }

    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        Nodo aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
        }
        return false;
    }

    private void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            altura = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return altura;
    }
    
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
