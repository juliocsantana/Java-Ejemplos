// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    public static void suma(int a, int b) {
        System.out.println(a + b);
    }

    public static void saludo() {
        System.out.println("Hola Mundo !");
    }

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        saludo();
        suma(2,4);
    }
}