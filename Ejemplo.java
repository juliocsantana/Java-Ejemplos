// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        ///////////////////////////////////////
        // Operadores
        ///////////////////////////////////////
        System.out.println("Operadores");

        int i1 = 1, i2 = 2; // Abreviación para múltiples declaraciones

        // La aritmética es directa
        System.out.println("1+2 = " + (i1 + i2)); // => 3
        System.out.println("2-1 = " + (i2 - i1)); // => 1
        System.out.println("2*1 = " + (i2 * i1)); // => 2
        System.out.println("1/2 = " + (i1 / i2)); // => 0 (0.5 truncado)

        // Módulo
        System.out.println("11%3 = "+(11 % 3)); // => 2

        // Operadores de comparación
        System.out.println("(3 == 2) => " + (3 == 2)); // => false
        System.out.println("(3 != 2) => " + (3 != 2)); // => true
        System.out.println("(3 > 2) => " + (3 > 2)); // => true
        System.out.println("(3 < 2) => " + (3 < 2)); // => false
        System.out.println("(2 <= 2) => " + (2 <= 2)); // => true
        System.out.println("(2 >= 2) => " + (2 >= 2)); // => true
    }
}