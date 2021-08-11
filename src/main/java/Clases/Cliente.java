package Clases;

public class Cliente extends Persona {

    // Propiedades
    private String categoria;
    private String codigo;

    // Metodos Get & Set
    public void generarCodigo()
    {
        this.setCodigo("C"+this.getNombre().substring(0,3));
    }
            
    // Metodos Get& Set
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

} // Fin clase Cliente
