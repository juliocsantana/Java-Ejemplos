// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        // Incrementos
        int i = 0;
        System.out.println("\n->Incrementos y reducciones");
        System.out.println(i++); //i = 1. Post-incremento
        System.out.println(++i); //i = 2. Pre-incremento
        System.out.println(i--); //i = 1. Post-reducción
        System.out.println(--i); //i = 0. Pre-reducción
    }
}