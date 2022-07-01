
package proyectm;

public class Empresa {
    private String nombreEmpresa;
    private String puesto;

    public Empresa(String nombreEmpresa, String puesto) {
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}
