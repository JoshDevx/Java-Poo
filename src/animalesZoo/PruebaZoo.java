package animalesZoo;

public class PruebaZoo {
    public static void main(String[] args) {
        //Objeto padre
        System.out.println("*** Objeto padre ***");
        Animal animal1 = new Animal();
        animal1.setNumeroPatas(4);
        animal1.comer();
        animal1.info();

        //Objeto hijo 1
        System.out.println("\n***Hijo 1 ***");
        Mamifero mamifero1 = new Mamifero();
        mamifero1.infoMamifero();
        mamifero1.setNumeroPatas(4);
        mamifero1.info(); // Clase heredada
        mamifero1.comer(); // Clase heredada

        //Objeto hijo/nieto
        System.out.println("\n***Hijo (mamifero) / Nieto (Animal) 1 ***");
        Leon leon1 = new Leon();
        leon1.setNombre("Mufaza");
        System.out.println("Nombre: " + leon1.getNombre()); // Atributo propio usamos get
        leon1.rugir(); //Metodo propio
        leon1.infoMamifero(); // Metodo heredado de padre
        leon1.setNumeroPatas(4); // Atributo heredado de abuelo
        leon1.info(); // Metodo heredado de abuelo
        leon1.comer(); // Metodo heredado de abuelo




    }
}
