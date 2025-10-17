public class Arimetica {
    // Atributos
    int operando1, operando2;

    // Constructor
    // Una vez agregando un constructor, este ya no se crea de manera automatica
    //Asi volvamos a crear un nuevo objeto
//    public Arimetica(int op1, int op2){
//        operando1 = op1;
//        operando2 = op2;
//    }

    // Usando this
    public Arimetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Dir. Me This: " + this);
    }

    // Podemos crear un nuevo constructor vacio
    // SOBRE CARGA DE CONSTRUCTORES -> Mas de un constructor en una clase
    public Arimetica(){

    }

    // Metodos
    void sumar(){
        System.out.println("Suma: " + (this.operando1 + this.operando2));
    }
    void restar(){
        System.out.println("Restar: " + (this.operando1 - this.operando2));
    }

    public static void main(String[] args) {
        //Creamos nuestros objetos
        System.out.println("*** Objeto 1 ***");
        Arimetica arimetica1 = new Arimetica(5,7);

        arimetica1.sumar();
        System.out.println("Dir. Men Obj1: " + arimetica1);

        //Creamos nuestros objetos
        System.out.println("\n*** Objeto 2 ***");
        Arimetica arimetica2 = new Arimetica(10,30);

        arimetica1.sumar();
        System.out.println("Dir. Men Obj1: " + arimetica2);
    }

}
