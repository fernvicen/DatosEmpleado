package proyectm;

public abstract class Empleado extends Persona {

    private String puesto;
    private String activo;

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public Empleado(String puesto, String activo, int edad, int altura, String nombre) {
        super(edad, altura, nombre);
        this.puesto = puesto;
        this.activo = activo;
    }

    public Empleado(int edad, int altura, String nombre) {
        super(edad, altura, nombre);
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void nombre(String nom) {

    }

}
