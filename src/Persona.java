public class Persona {

    // Atributos
    String nombre, apellido;
    int edad;

    //Metodos
    public void mostrarDatos(){
        System.out.println("Nombre y apellido: " + nombre + " " + apellido + "\nEdad: " + edad);
    }

    public static void main(String[] args) {

        // Creacion de objeto 1
        Persona persona1 = new Persona();
        persona1.nombre = "Joshua";
        persona1.apellido = "Mendoza";
        persona1.edad = 26;

        persona1.mostrarDatos();
    }
}

