package persona.pruebaPersona;
import persona.Persona;

public class PruebPersona {
    public static void main(String[] args) {

        // Creacion de objeto 1
        Persona persona1 = new Persona("Joshua", "Mendoza");
        persona1.mostrarDatos();

        // Creacion de objeto 2
        Persona persona2 = new Persona("Joshua", "Mendoza");
        persona2.setNombre("Jayden");
        System.out.println("Obtenemos el name con el memtodo get" + persona2.getNombre());

        persona2.mostrarDatos();

    }
}
