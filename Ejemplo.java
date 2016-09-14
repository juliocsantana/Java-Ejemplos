// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        ///////////////////////////////////////
        // Estructuras de Control
        ///////////////////////////////////////
        System.out.println("Estructuras de Control");

        // Condiciones 'if' son como en c
        int j = 10;
        if (j == 10){
            System.out.println("Me imprimieron");
        } else if (j > 10) {
            System.out.println("A mi no");
        } else {
            System.out.println("A mi tampoco");
        }
    }
}