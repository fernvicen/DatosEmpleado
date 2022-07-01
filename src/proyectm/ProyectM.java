
package proyectm;

import java.util.Scanner;

public class ProyectM {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        String nombreGerente = lector.nextLine();
        Gerente g =new Gerente("Recursos Humanos","Entrevistando",35,168,nombreGerente);
        Entrevistado em=new Entrevistado(22, 179, "Toño");
        Saco v = new Saco("Saco",3,"Negro");
        Empresa e = new Empresa("patito","Desarrollador");
        System.out.println(g.getNombre()+" de "+g.getPuesto()+" esta " + g.getActivo()+ " a una Persona "+ " de nombre "+
               em.getNombre()+" para el puesto de "+ e.getPuesto()
                     + " que mide " +em.getAltura()+" y tiene un " + v.getTipo() +
                " con "+v.getNumBoton() + " botones, color " +v.getColor());
    }
    
}
