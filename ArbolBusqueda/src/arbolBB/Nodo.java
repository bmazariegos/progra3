/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBB;

/**
 *
 * @author
 */
public class Nodo {
  public int dato , FactorEquilibrio;
  public Nodo SubArbolIzquierdo,subArbolderecho;

    public Nodo(int dato, Nodo izq , Nodo der) {
        this.dato = dato;
        this.FactorEquilibrio = 0;
        this.SubArbolIzquierdo = izq;
        this.subArbolderecho = der;
    }

    

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return SubArbolIzquierdo;
    }

    public void setIzq(Nodo izq) {
        this.SubArbolIzquierdo = izq;
    }

    public Nodo getDer() {
        return subArbolderecho;
    }

    public void setDer(Nodo der) {
        this.subArbolderecho = der;
    }
 
}
