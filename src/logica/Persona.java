package logica;

public class Persona {

	private String nombre, doc;
	private int edad;
	private double peso, talla,imc;

	public Persona() {

	}
	public Persona(String nombre, int edad, double peso, double talla, double imc, String doc) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
		this.imc = imc;
		this.doc=doc;
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



	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public String getDoc() {
		return doc;
	}
	public void setDoc(String doc) {
		 this.doc=doc;
	}
	
	  @Override
	 public String toString() {
	        return "Nombre: " + nombre +
	               ", Edad: " + edad +
	               ", Peso: " + peso +
	               ", Talla: " + talla +
	               ", Documento: " + doc +
	        		", Imc: "+imc;
	    }
	

}
