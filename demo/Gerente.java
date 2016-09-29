public class Gerente extends Empleado {

	public Gerente() {
		super();
		
	}

	public double calcular(){
		float total= horasTrabajadas * salario;
		return total + (salario * .40);
	}
}
