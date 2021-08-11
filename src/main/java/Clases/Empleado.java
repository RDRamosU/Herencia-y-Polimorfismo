package Clases;

public class Empleado extends Persona {

    // Propiedades
    private String tipoContrato;
    private Double sueldo;

    // Metodo
    public void calcularSueldo(Double sueldoBase) {
        if (this.getTipoContrato() == "C") {
            this.setSueldo(sueldoBase + 350);
        } else {
            this.setSueldo(sueldoBase + 750);
        }
    }

    // Metodos Get & Set
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

} // Fin clase Empleado
