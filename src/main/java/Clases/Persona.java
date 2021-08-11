package Clases;

public class Persona {

    //Propiedades
    private String apellidos;
    private String nombre;
    private String documento;
    private String tipo;

    // Constructores
    public Persona() {

    } // Fin constructor

    public Persona(String apellidos, String nombre, String documento, String tipo) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.documento = documento;
        this.tipo = tipo;
    } // Fin constructor

    // Metodos Get & Set
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

} // Fin Public Class
