public class Empleado {

	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;
	protected int salario;
	protected int horasTrabajadas;
	private String Puesto;


	public Empleado() {
			
	}

	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0 && edad <= 100) {
            this.edad = edad;
        }
    }

    public float getSalario() {
        return edad;
    }

    public void setSalario(int salario) {
    	this.salario = salario;
    }
	
    
    public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double calcular(){
		float total= horasTrabajadas * salario;
		return total ;
	}
	
	public String getPuesto() {
		return Puesto;
	}

	public void setPuesto(String puesto) {
		Puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", Apellido Paterno="
				+ apellidoPaterno + ", Apellido Materno=" + apellidoMaterno
				+ ", Edad=" + edad + ", Horas Trabajadas=" + horasTrabajadas + ", Puesto=" + Puesto +",";
	}
    
    
}
