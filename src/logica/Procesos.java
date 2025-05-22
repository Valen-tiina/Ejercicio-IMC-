package logica;

import java.util.ArrayList;

import data.ModeloDatos;

public class Procesos {
	
	private ModeloDatos miModelo = new ModeloDatos();
	double imc;

	ArrayList<Persona> listaPersonas;

	public Procesos() {
		listaPersonas = new ArrayList<Persona>();
	}

	/*public String registro(Persona persona) {
		String res = "Persona registrada con éxito\n";
		res += "Documento: " + persona.getDoc() + "\n";
		res += "Nombre: " + persona.getNombre() + "\n";
		res += "Edad: " + persona.getEdad() + "\n";
		res += "Talla: " + persona.getTalla() + "\n";
		res += "Peso: " + persona.getPeso() + "\n";

		imc = persona.getPeso() / (persona.getTalla() * persona.getTalla());

		String resultadoIMC = calcularIMC(imc); // ✅ ahora está claro

		persona.setImc(imc); // 👈 se guarda el número (double) correctamente

		res += resultadoIMC + "\n";

		listaPersonas.add(persona);

		return res;
	}*/
	public String registro(Persona persona) {
	    double imc = persona.getPeso() / (persona.getTalla() * persona.getTalla());
	    persona.setImc(imc); // si tienes el atributo imc en Persona
	    String resultadoIMC = calcularIMC(imc);

	    String res = "Persona registrada con éxito\n";
	    res += "Documento: " + persona.getDoc() + "\n";
	    res += "Nombre: " + persona.getNombre() + "\n";
	    res += "Edad: " + persona.getEdad() + "\n";
	    res += "Talla: " + persona.getTalla() + "\n";
	    res += "Peso: " + persona.getPeso() + "\n";
	    res += resultadoIMC + "\n";

	    miModelo.agregarPersona(persona); // Aquí sí se guarda la persona

	    return res;
	}
	  
	  public String consultarLista() {
	        StringBuilder sb = new StringBuilder();
	        ArrayList<Persona> personas = miModelo.obtenerPersonas();
	        for (Persona p : personas) {
	            sb.append(p.toString()).append("\n");
	        }
	        return sb.toString();
	    }
	  
	  
	  
	  public void limpiarLista() {
	        miModelo.limpiarLista();
	    }
	public String calcularIMC(double imc) {
		String msj = "";

		if (imc < 18) {
			msj = "Anorexia";
		} else if (imc < 20) {
			msj = "Delgadez";
		} else if (imc < 27) {
			msj = "Normalidad";
		} else if (imc < 30) {
			msj = "Obesidad Grado 1";
		} else if (imc < 35) {
			msj = "Obesidad Grado 2";
		} else if (imc < 40) {
			msj = "Obesidad Grado 3";
		} else {
			msj = "Obesidad Mórbida";
		}

		return "IMC: " + imc + "\nSu IMC indica que tiene: " + msj;
	}

	/*public String consultarLista() {
		Persona p = null;
		String resultado = "";

		for (int i = 0; i < listaPersonas.size(); i++) {
			p = listaPersonas.get(i);
			resultado += "Documento: " + p.getDoc() + "\n";
			resultado += "Nombre: " + p.getNombre() + "\n";
			resultado += "Edad: " + p.getEdad() + "\n";
			resultado += "Talla: " + p.getTalla() + "\n";
			resultado += "Peso: " + p.getPeso() + "\n";
			resultado += "IMC: " + p.getImc() + "\n";
			resultado += "************************\n";
		}
		return resultado;
	}*/
}
