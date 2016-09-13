// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        // Arreglos
        //El tamaño del arreglo debe decidirse en la declaración
        //El formato para la declaración de un arreglo es la siguiente:
        //<tipo_de_dato> [] <nombre_variable> = new <tipo_de_dato>[<tamaño_arreglo>];
        int [] arreglo_de_enteros = new int[10];
        String [] arreglo_de_strings = new String[1];
        boolean [] arreglo_de_booleanos = new boolean[100];

        // Otra forma de declarar & inicializar un arreglo
        int [] y = {9000, 1000, 1337};

        // Indexación de un arreglo - Accediendo un elemento
        System.out.println("arreglo_de_enteros[0]: " + arreglo_de_enteros[0]);

        // Arreglos comienzan su indexación en cero y son mutables
        arreglo_de_enteros[1] = 1;
        System.out.println("arreglo_de_enteros[1]: " + arreglo_de_enteros[1]); 
    }
}