/**
 * Bryan Estuardo Mazariegos Davila
 * carnet: 0901-17-1001
 * Esta clase contiene los metodos para realizar el equilibrado de los arboles
 * binarios que se ingrsesan en el programa
 */
package arbolBB;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ArbolAVL {
    
      private Nodo raiz;
      public ArbolAVL()
      {
          raiz = null ;
      }
      public Nodo obtenerRaiz()
      {
          return raiz;
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
        return buscar(d,r.der); 
      }else
      {
          return buscar(d,r.izq);
      }
      }
      
      //obtener el factor de equilibrio
      public int obtenerFE(Nodo x)
      {
          if(x== null)
          {
             return -1; 
          }else {
              return x.fe;
          }
          
      }
      //rotacion simpre izquierda
      public Nodo rotacionizquierda(Nodo c)
      {
          Nodo auxiliar = c.izq;
          c.izq = auxiliar.der;
          auxiliar.der = c;
          c.fe =Math.max(obtenerFE(c.izq),obtenerFE(c.der))+1;
          auxiliar.fe = Math.max(obtenerFE(auxiliar.izq),obtenerFE(auxiliar.der))+1;
          return auxiliar;
      
      }
      //rotacion simpre derecha
        public Nodo rotacionderecha(Nodo c)
      {
          Nodo auxiliar = c.der;
          c.der = auxiliar.izq;
          auxiliar.izq = c;
          c.fe =Math.max(obtenerFE(c.izq),obtenerFE(c.der))+1;
          auxiliar.fe = Math.max(obtenerFE(auxiliar.izq),obtenerFE(auxiliar.der))+1;
          return auxiliar;
      
      }
      //rotacion doble izquierda
        public Nodo rotacionDobleIzquierda(Nodo c)
        {
           Nodo temporal;
           c.izq = rotacionderecha(c.izq);
           temporal  = rotacionizquierda(c);
           return temporal;
        }
        //rotacion doble derecha
        public Nodo rotacionDobleDerecha(Nodo c)
        {
           Nodo temporal;
           c.der = rotacionizquierda(c.der);
           temporal  = rotacionderecha(c);
           return temporal;
        }
        //metodo para insertar AVL
        public Nodo insertarAVL(Nodo nuevo, Nodo subAr)
        {
            Nodo nuevoPadre = subAr ;
            if(nuevo.dato<subAr.dato)
            {
                if(subAr.izq == null)
                {
                    subAr.izq = nuevo;
                }else
                {
                    subAr.izq = insertarAVL(nuevo,subAr.izq); 
                    if((obtenerFE(subAr.izq)-obtenerFE(subAr.der)==2))
                    {
                        if(nuevo.dato<subAr.izq.dato)
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
                 if(subAr.der == null)
                 {
                     subAr.der = nuevo;
                 }else
                 {
                     subAr.der = insertarAVL(nuevo,subAr.der);
                       if((obtenerFE(subAr.der)-obtenerFE(subAr.izq)==2))
                       {
                           if(nuevo.dato>subAr.der.dato)
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
                JOptionPane.showMessageDialog(null,"EL NODO ES DUPLICADO");
            }
            //ACTUALIZAR EL FACTOR DE EQUILIBRIO
            if((subAr.izq ==  null)&&(subAr.der != null))
            {
               subAr.fe = subAr.der.fe+1; 
            }else if((subAr.der==  null) &&(subAr.izq != null))
            {
               subAr.fe = subAr.izq.fe+1; 
            }else
            {
              subAr.fe = Math.max(obtenerFE(subAr.izq),obtenerFE(subAr.der))+1; 
            }
            return nuevoPadre;
        }
        
        
        //Insertar 
        public boolean insertar(int d)
        {
            Nodo nuevo = new Nodo(d);
            if (raiz == null)
            {
                raiz = nuevo;
            }else
            {
                raiz = insertarAVL(nuevo,raiz);
            }
            return true;
        }
        //recorridos

  public Nodo getRaiz() {
        return raiz;
    }
  public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}

