// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        // Ciclos 'while'
        int fooWhile = 0;
        while(fooWhile < 100)
        {
            //System.out.println(fooWhile);
            //Incrementar el contador
            //Iteró 99 veces, fooWhile 0->99
            fooWhile++;
        }
        System.out.println("Valor fooWhile: " + fooWhile);
    }
}