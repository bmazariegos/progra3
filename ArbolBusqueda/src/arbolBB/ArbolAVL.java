/**
 * Bryan Estuardo Mazariegos Davila
 * carnet: 0901-17-1001
 */
package arbolBB;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ArbolAVL {
    
    ArbolBB arbol = new ArbolBB();
    public boolean insertar(Integer dato)
    {
        return(this.arbol.insertar(dato));
    }
     public String preOrden() {
        LinkedList it = this.arbol.preOrden();
        return (recorrido(it, "PreOrden"));
    }

    public String inOrden() {
        LinkedList it = this.arbol.inOrden();
        return (recorrido(it, "InOrden"));
    }

    public String postOrden() {
        LinkedList it = this.arbol.postOrden();
        return (recorrido(it, "PosOrden"));
    }
    
    //metodo para poder mostrar los tipos d recorrido
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }
    
    
    //Metodo para buscar dato en el nodo
    public String buscar(Integer dato) {
        boolean siEsta = this.arbol.existe(dato);
        String r = "El dato:" + dato.toString() + "\n";
        r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
        return (r);
    }

    public JPanel getDibujo() {
        return this.arbol.getdibujo();
    }
    
}

