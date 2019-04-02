/*
 * Programa realiza el control de una contidad n de libros en listas
 * Bryan Estuardo Mazariegos Davila 0901-17-1001
 */
package estructuralibros;

import javax.swing.JOptionPane;

public class Inicio {
    public static String StrTitulo, StrAutor,StrIbn,StrOpcion,StrPosicion,StrMenusalida;
    public static int IOp,IPosicionNodo,IOpSalida;
    public static  Libro libro;
    public static  Lista milista = new Lista();
    
    public static void Ingreso()
    {
    StrTitulo = JOptionPane.showInputDialog(null,"Ingrese el titulo del libro");
    StrAutor = JOptionPane.showInputDialog(null,"Ingrese el autor del libro");
    StrIbn = JOptionPane.showInputDialog(null,"Ingrese el codigo");
    libro = new Libro(StrTitulo,StrAutor,StrIbn);
    }
  public static void Menu()
  {
    StrOpcion = JOptionPane.showInputDialog(null,"ingrese la opcion que desea:\n1.ingresar al principio\n2.insertar en posicion\n3.insertar al final\n4.eliminar el primero\n5.eliminar el final\n6.eliminar posicion" 
            +"\n7.buscar libro \n8.ver si la lista esta vacia\n9.ver la cantidad de nodos\n10.mostrar\n0.salir");
    IOp = Integer.parseInt(StrOpcion);  
  }
  public static void MenuSalida()
  {
     StrMenusalida = JOptionPane.showInputDialog(null,"¿desea salir del programa?\n1.SI\n2.NO");
    IOpSalida= Integer.parseInt(StrMenusalida); 
  }
    public static void main(String[] args){
         do{
    Menu();
    switch(IOp)
    {
        case 0:
            System.exit(0);
            break;
        case 1:
           Ingreso();
           milista.insertarPrincipio(libro);
           JOptionPane.showMessageDialog(null,"Datos se guardados");
            break;
        case 2: 
            StrPosicion = JOptionPane.showInputDialog(null,"ingrese la posicion en la que desea ingresar los datos");
           IPosicionNodo = Integer.parseInt(StrPosicion);
           Ingreso();
           milista.insertarDespues(IPosicionNodo,libro);
           JOptionPane.showMessageDialog(null,"Datos se guardados");
            break;
        case 3:
           Ingreso();
           milista.insertarFinal(libro);
           JOptionPane.showMessageDialog(null,"Datos se guardados");
            break;
        case 4:
           milista.eliminaPrincipio();
           JOptionPane.showMessageDialog(null,"Datos se guardados");
           break;
        case 5:
           milista.eliminarUltimo();
           JOptionPane.showMessageDialog(null,"Datos se guardados");
            break;
        case 6:
           StrPosicion = JOptionPane.showInputDialog(null,"Ingrese la posicion en la que desea eliminar los datos");
           IPosicionNodo = Integer.parseInt(StrPosicion);
           milista.eliminarLibro(IPosicionNodo);
           JOptionPane.showMessageDialog(null,"Datos eliminados");
            break;
        case 7:
           StrPosicion = JOptionPane.showInputDialog(null,"ingrese la posicion en la que desea buscar los datos");
           IPosicionNodo = Integer.parseInt(StrPosicion);
           JOptionPane.showMessageDialog(null,milista.obtener(IPosicionNodo) );
            break;
        case 8:
            milista.estaVacia();
            break;
        case 9:
            milista.contar();
            break;
        case 10:
           JOptionPane.showMessageDialog(null,milista.MostrarLista());
            break;
    }
    MenuSalida();
    }while(IOpSalida != 1);
    }
    
}
