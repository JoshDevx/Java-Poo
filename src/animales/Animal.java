package animales;

public class Animal {

    // Metodos
    protected void comer(){
        System.out.println("Como mucho!");
    }

    protected void dormir(){
        System.out.println("Duermo mucho");
    }
}

// Clase hijo
    class Perro extends Animal{
        public void hacerSonido(){
            System.out.println("Puedo ladrar");
        }
        // Usamos sobreescritura de el metodo padre
        // Se usa la misma firma -> protected void dormir()
        // Colocamos @override para indicar que es sobre escritura

        @Override
        protected void dormir(){
            System.out.println("Duermo 12 horas");
        }
    }

    class PruebaAnimal{
        public static void main(String[] args) {
            // Creacion de objeto padre
            System.out.println("Creacion de Objeto padre");
            Animal animal1 = new Animal();
            animal1.comer();
            animal1.dormir();

            System.out.println("\nCreacion de Objeto hijo");
            //
            Perro perro1 = new Perro();
            perro1.comer();
            perro1.dormir();
            perro1.hacerSonido();


        }
    }


