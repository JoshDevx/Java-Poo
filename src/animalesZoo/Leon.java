package animalesZoo;

public class Leon extends Mamifero{
    //
    private String nombre;

    protected void rugir(){
        System.out.println("El leon ruge: GRGRGR");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
