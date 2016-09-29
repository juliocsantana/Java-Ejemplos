public class Contador extends Empleado {

	
	public Contador() {
		super();
		
	}
	public double calcular(){
		float total= horasTrabajadas * salario;
		return total + (salario * .35);
	}
	

}
