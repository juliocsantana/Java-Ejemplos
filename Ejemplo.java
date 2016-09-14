// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        // Ciclos 'for'
        int fooFor;
        //Estructura del ciclo 'for' => for(<declaración_de_inicio>; <condicional>; <paso>)
        for(fooFor=0; fooFor<10; fooFor++){
            //System.out.println(fooFor);
            //Iteró 10 veces, fooFor 0->9
        }
        System.out.println("Valor fooFor: " + fooFor);
    }
}