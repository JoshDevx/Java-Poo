package prueba_arimetica;
import arimetica.Arimetica;

public class Prueba_Arimetica {

    public static void main(String[] args) {
        //Creamos nuestros objetos

        System.out.println("*** Objeto 1 ***");
        Arimetica arimetica1 = new Arimetica(5,7);

        // Usamos los metodos de acceso
        System.out.print("Leemos el operador 1 (Usando get): " + arimetica1.getOperando1());
        System.out.println("\nModificamos con set");
        //Modificamos con set
        arimetica1.setOperando1(10);
        arimetica1.setOperando2(20);

        arimetica1.sumar();

        //
        System.out.println("\n*** Objeto 2 ***");
        Arimetica arimetica2 = new Arimetica(10,30);

        arimetica2.sumar();
    }

}
