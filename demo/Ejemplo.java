package demo;

// Cada archivo .java contiene una clase pública, con el mismo nombre del archivo.
public class Ejemplo {

    // Un programa debe tener un método 'main' como punto de entrada
    public static void main (String[] args) {
        Empleado emp = new Empleado();
        emp.edad = 23;
        System.out.println(emp.edad);
    }
}