package logica;

public class Persona {

	private String nombre;
	private int edad;
	private double peso, talla,imc;


	public Persona(String nombre, int edad, double peso, double talla, double imc) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
		this.imc = imc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public Persona() {

	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

}
