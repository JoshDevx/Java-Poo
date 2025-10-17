public class Artefactos {
    // Atributos
        String nombre;
        int id;
        double precio;

    // Constructor
        public Artefactos(String name, int ide, double price){
            nombre = name;
            id = ide;
            precio = price;
        }

    // Metodos

    void MostrarArtefracto(){
        System.out.println("id: " + id + "\nNombre: "+nombre + "\nPrecio: S/"+precio );
    }

    public static void main(String[] args) {
            //Creacion de objeto
        Artefactos artefacto1 = new Artefactos("Hervidor", 15, 120 );

        artefacto1.MostrarArtefracto();
    }
}
