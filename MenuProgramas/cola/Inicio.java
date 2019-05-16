/**
 * Esta es la clase principal de del control de los metodos 
 * de cola que estan el la clase "Cola".
 * Bryan Estuardo Mazariegos Davila 0901-17-1001 
 */
package cola;

import javax.swing.JOptionPane;

public class Inicio {

    public static String StrTitulo, StrAutor, StrIbn, StrOpcion, StrPosicion, StrMenusalida;
    public static int IOp,IPosicionNodo,IOpSalida;
    public static  Libro libro;
    public static  Cola Cola = new Cola();
    //procedimiento que contiene la lectura de datos a guardar en la pila 
    public static void Ingreso(){
    StrTitulo = JOptionPane.showInputDialog(null,"Ingrese el titulo del libro");
    StrAutor = JOptionPane.showInputDialog(null,"Ingrese el autor del libro");
    StrIbn = JOptionPane.showInputDialog(null,"Ingrese el codigo");
    libro = new Libro(StrTitulo,StrAutor,StrIbn);
    }
    //menu principal 
    public static void Menu(){
    StrOpcion = JOptionPane.showInputDialog(null,"ingrese la opcion que desea:\n0.salir\n1.Encolar\n2.Desencolar\n3.Tamaño de cola" 
            +"\n4.Borrar Cola\n5.ver si cola esta vacia\n6.Mostrar cola");
    IOp = Integer.parseInt(StrOpcion);  
  }
    //main
    public static void main(String[] args){
        IOpSalida=0;
         do{
    Menu();
    switch(IOp)
    {
        case 0:
            System.exit(0);
            IOpSalida=1;
            break;
        case 1:
           Ingreso();
           Cola.Encolar(libro);//inserta en la cola
           JOptionPane.showMessageDialog(null,"Datos se guardados");
            break;
        case 2:
           Cola.Desencolar();//elimina de la cola
           JOptionPane.showMessageDialog(null,"Datos desapilados");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,Cola.Tamaño());//obserbar cual es la cola
            break;
        case 4:
            JOptionPane.showMessageDialog(null,Cola.BorrarCola());//elimina toda la cola
            break;
        case 5://revisa si la cola esta vasia o no
            if(true==(Cola.estaVacia()))
                JOptionPane.showMessageDialog(null,"Cola vacia");
            else
                JOptionPane.showMessageDialog(null,"Cola no esta vacia");
            break;
        case 6://mostrar cola
           JOptionPane.showMessageDialog(null,Cola.MostrarCola());
            break;
    }
    }while(IOpSalida != 1);
    }
    }
    
