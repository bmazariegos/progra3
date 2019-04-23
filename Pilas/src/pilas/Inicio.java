/**
 * Esta clase contiene todos los metodos que se le pueden aplicar a la lista
 * Bryan Estuardo Mazariegos Davila 0901-17-1001 
 */
package pilas;

import javax.swing.JOptionPane;

public class Inicio {

    public static String StrTitulo, StrAutor, StrIbn, StrOpcion, StrPosicion, StrMenusalida;
    public static int IOp,IPosicionNodo,IOpSalida;
    public static  Libro libro;
    public static  Pilas Pila = new Pilas();
    
    public static void Ingreso()
    {
    StrTitulo = JOptionPane.showInputDialog(null,"Ingrese el titulo del libro");
    StrAutor = JOptionPane.showInputDialog(null,"Ingrese el autor del libro");
    StrIbn = JOptionPane.showInputDialog(null,"Ingrese el codigo");
    libro = new Libro(StrTitulo,StrAutor,StrIbn);
    }
  public static void Menu()
  {
    StrOpcion = JOptionPane.showInputDialog(null,"ingrese la opcion que desea:\n0.salir\n1.Apilar\n2.Desapilar\n3.Top, Cima" 
            +"\n4.Borrar Pila\n5.ver si pila esta vacia\n6.Mostrar pila");
    IOp = Integer.parseInt(StrOpcion);  
  }
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
           Pila.Push(libro);
           JOptionPane.showMessageDialog(null,"Datos se guardados");
            break;
        case 2:
           Pila.Pop();
           JOptionPane.showMessageDialog(null,"Datos desapilados");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,Pila.Top());
            break;
        case 4:
            JOptionPane.showMessageDialog(null,Pila.BorrarPila());
            break;
        case 5:
            if(true==(Pila.estaVacia()))
                JOptionPane.showMessageDialog(null,"pila vacia");
            else
                JOptionPane.showMessageDialog(null,"pila no esta vacia");
            break;
        case 6:
           JOptionPane.showMessageDialog(null,Pila.MostrarPila());
            break;
    }
    }while(IOpSalida != 1);
    }
    }
    
