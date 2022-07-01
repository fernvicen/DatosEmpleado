
package proyectm;

public abstract class Persona {
    private int edad;
    private int altura;
    private String nombre;

     public abstract void nombre(String nom);

    public Persona(int edad, int altura, String nombre) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
    }

     
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
