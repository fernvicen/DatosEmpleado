
package proyectm;

public abstract class Vestimenta {
    private String tipo;
    private int numBoton;
    private String color;

    public Vestimenta(String tipo, int numBoton, String color) {
        this.tipo = tipo;
        this.numBoton = numBoton;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumBoton() {
        return numBoton;
    }

    public void setNumBoton(int numBoton) {
        this.numBoton = numBoton;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
