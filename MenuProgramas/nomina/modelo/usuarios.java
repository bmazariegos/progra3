/*
 * @author BRYAN ESTUARDO MAZARIEGOS DAVILA
 *  0901-17-1001
 *  Esta es la ventana de inicio de se leccion de usuarios 
 */
package modelo;

/**
 *
 * @author Bryan Mazariegos
 */
public class usuarios {
    
    private String id;
    private String usuario;
    private String password;
    private String nombre;
    private String correo;
    private String last_session;
    private String id_tipo;
    private String Id_Empleado;
    private String EstadoUsuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstadoUsuario() {
        return EstadoUsuario;
    }

    public void setEstadoUsuario(String EstadoUsuario) {
        this.EstadoUsuario = EstadoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public String getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(String id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(String Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

       
}
