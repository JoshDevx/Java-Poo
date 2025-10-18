package animalesZoo;

public class Animal {
    private int numeroPatas;


    protected void comer(){
        System.out.println("Come mucho!");
    }

    protected void info(){
        System.out.println("Numero de patas: " + numeroPatas);
    }

    //

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
