// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static String saludo() {
        return "Hola Mundo !";
    }

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        System.out.println(saludo());
        System.out.println(suma(2,4));
    }
}