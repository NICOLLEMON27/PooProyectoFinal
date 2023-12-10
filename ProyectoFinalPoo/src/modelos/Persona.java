package modelos;

public abstract class Persona {
    protected String nombre;
    protected String cedula;
    protected String años;

    public Persona(String nombre, String cedula, String años) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.años = años;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getAños() {
        return años;
    }
    
}
