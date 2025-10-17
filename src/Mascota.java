public class Mascota {
    // Atributos
    String tipoMascota;
    String nombre;

    // Constructor
    public Mascota(String tipM, String name){
        tipoMascota = tipM;
        nombre = name;
    }

    //Metodos
    void MiMascota(){
        System.out.println("Mi mascota:");
        System.out.println(tipoMascota + "\n" + nombre);
    }

    public static void main(String[] args) {
        // Creacion de mi objeto
        Mascota mascota1 = new Mascota("Perro", "Tryrion");
        mascota1.MiMascota();
    }
}
