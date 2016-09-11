// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        ///////////////////////////////////////
        // Tipos & Variables
        ///////////////////////////////////////

        // Declara una variable usando <tipo> <nombre> [
        // Byte - Entero complemento a dos con signo de 8-bit
        // (-128 <= byte <= 127)
        byte fooByte = 100;
        
        // Short - Entero complemento a dos con signo de 16-bit
        // (-32,768 <= short <= 32,767)
        short fooShort = 10000;

        // Integer - Entero complemento a dos con signo de 32-bit
        // (-2,147,483,648 <= int <= 2,147,483,647)
        int fooInt = 1;

        // Long - Entero complemento a dos con signo de 64-bit
        // (-9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,807)
        long fooLong = 100000L;
        // L es usado para denotar que el valor de esta variable es del tipo Long;
        // cualquier cosa sin ella es tratado como un entero por defecto.

        // Nota: Java no tiene tipos sin signo

        // Float - Número de coma flotante IEEE 754 de precisión simple de 32-bit
        float fooFloat = 234.5f;
        // f es usado para denotar qeu el valor de esta variable es del tipo float;
        // de otra manera es tratado como un double.

        // Double - Número de coma flotante IEEE 754 de precisión doble de 64-bit
        double fooDouble = 123.4;

        // Boolean - true & false
        boolean fooBoolean = true;
        boolean barBoolean = false;

        // Char - Un simple carácter unicode de 16-bit
        char fooChar = 'A';

        // Usa 'final' para hacer inmutable las variables
        final int HORAS_QUE_TRABAJO_POR_SEMANA = 9001;

        // Strings
        String fooString = "¡Mi String está aquí!";

        // \n es un carácter escapado que inicia una nueva línea
        String barString = "¿Imprimiendo en una nueva linea?\n¡Ningun problema!";
        // \t es un carácter escapado que añade un carácter tab
        String bazString = "¿Quieres añadir un 'tab'?\t¡Ningun problema!";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);
    }
}