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
public class Integrantes {
    
    public static void main(String[] args)
    {
        ArbolAVL arbol = new ArbolAVL();
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(13);
        arbol.insertar(1);
        arbol.insertar(6);
        arbol.insertar(17);
        //arbol.preOrden(arbol.obtenerRaiz());
    }
}
