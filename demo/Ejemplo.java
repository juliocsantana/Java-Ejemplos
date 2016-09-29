public class Ejemplo {
	public static void main(String[] args) {
		
        Empleado emp2= new Contador();
        emp2.setNombre("Jose");
        emp2.setApellidoPaterno("Espinoza");
        emp2.setApellidoMaterno("Lopez");
        emp2.setEdad(26);
        emp2.setPuesto("Contador");
        emp2.setSalario(100);
        emp2.setHorasTrabajadas(40);
       
        //Se manda a imprimir con el metodo get a cada uno de los atributos
        System.out.println("nombre: "+emp2.getNombre()+ ","+ " Apellido Paterno: " + emp2.getApellidoPaterno()+ ","+ " Apellido Materno "+emp2.getApellidoMaterno()+ ","+" Edad "+emp2.getEdad()+ "," +" Puesto "+emp2.getPuesto()+ "," +" Salario: "+ emp2.calcular());
        
        
        
        Empleado emp3= new Gerente();
        emp3.setNombre("Angel");
        emp3.setApellidoPaterno("Hernandez");
        emp3.setApellidoMaterno("Gonzales");
        emp3.setEdad(30);
        emp3.setPuesto("Gerente");
        emp3.setSalario(100);
        emp3.setHorasTrabajadas(40);
        
        //Se imprime por el metodo toString toda la cadena de caracteres
        System.out.println(emp3.toString() + " Salario"+emp3.calcular());
        
        
        
        
        
	}
}
