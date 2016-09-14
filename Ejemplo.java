// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        // Ciclos 'do while'
        int fooDoWhile = 0;
        do
        {
            //System.out.println(fooDoWhile);
            //Incrementar el contador
            //Iteró 99 veces, fooDoWhile 0->99
            fooDoWhile++;
        }while(fooDoWhile < 100);
        System.out.println("Valor fooDoWhile: " + fooDoWhile);
    }
}