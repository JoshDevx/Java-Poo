package arimetica;

public class Arimetica {
    // Atributos
    private int operando1, operando2;

    // Usando this
    public Arimetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    // Podemos crear un nuevo constructor vacio
    // SOBRE CARGA DE CONSTRUCTORES -> Mas de un constructor en una clase
    public Arimetica(){

    }

    // Metodos
    public void sumar(){
        System.out.println("Suma: " + (this.operando1 + this.operando2));
    }
    public void restar(){
        System.out.println("Restar: " + (this.operando1 - this.operando2));
    }

    // Metodos de acceso
    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
