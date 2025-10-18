package persona;

public class Persona {

    // Atributos
    private String nombre, apellido;

    // Constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Metodos
    public void mostrarDatos() {
        System.out.println("Nombre y apellido: " + this.nombre + " " + this.apellido);
    }

    // Metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

