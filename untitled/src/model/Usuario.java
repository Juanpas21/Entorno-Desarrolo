package model;

public class Usuario {
    private String nombre,apellido,nombreUsuario,contrasenia,correoElectronico,telefono;


    public Usuario(String nombre, String apellido, String nombreUsuario, String contrasenia, String correoElectronico) {
    }

    public Usuario(String nombre, String apellido, String nombreUsuario,
                   String contrasenia, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+"nApellido: " + apellido+"nNombre de usuario: "
                +nombreUsuario+"Contraseña: "+contrasenia+"nCorreo Electronico"+correoElectronico+"nTelefono"+telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContraseña(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

