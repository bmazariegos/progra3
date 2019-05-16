/*
 * @author BRYAN ESTUARDO MAZARIEGOS DAVILA
 *  0901-17-1001
 *  Esta es la ventana de inicio de se leccion de usuarios 
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Mazariegos
 */
public class SqlUsuarios extends Conexion {

    private String CodigoAutomatico()
    {
        int IUltimoID=0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection co = getConexion();
        try {
                ps = co.prepareStatement("SELECT COUNT(ID_Empleado)AS maximo FROM empleado");
                rs= ps.executeQuery();
                if (rs.next()){
                   IUltimoID=Integer.parseInt(rs.getString("maximo"));
                   IUltimoID += 1;
                }   
             co.close(); 
            } catch (Exception e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null,"Error al relizar el codigo automatico");
            }
        return(Integer.toString(IUltimoID));
    }
    public boolean registrar(usuarios usr) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String StrNuevoID=null;
        StrNuevoID=CodigoAutomatico();
        String sql = "INSERT INTO usuario (ID_Usuario,NombreUsuario,Password,EstadoUsuario,Email,ID_Empleado,ID_TipoUsuario) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, StrNuevoID);
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getPassword());
            ps.setString(4, usr.getEstadoUsuario());
            ps.setString(5, usr.getCorreo());
            ps.setString(6, usr.getId_Empleado());
            ps.setString(7, usr.getId_tipo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean login(usuarios usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT ID_Usuario,NombreUsuario,Password,ID_TipoUsuario FROM usuario WHERE NombreUsuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(3))) {

                    String sqlUpdate = "UPDATE usuario SET LastSeccion = ? WHERE ID_Usuario = ?";
                    ps = con.prepareStatement(sqlUpdate);
                    ps.setString(1, usr.getLast_session());
                    ps.setString(2, rs.getString(1));
                    ps.execute();

                    usr.setId(rs.getString(1));
                    usr.setNombre(rs.getString(2));
                    usr.setId_tipo(rs.getString(4));
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int existeUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(Id_Usuario) FROM usuario WHERE NombreUsuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);

            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }

    }

    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);
        return mather.find();

    }

}
