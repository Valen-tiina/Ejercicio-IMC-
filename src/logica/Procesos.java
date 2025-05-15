package logica;

public class Procesos {
	
	public String registro(Persona persona) {
		String res="Persona registrada con exito\n";
		res+="Nombre: "+persona.getNombre()+"\n";
		res+="Edad: "+persona.getEdad()+"\n";
		res+="Talla: "+persona.getTalla()+"\n";
		res+="Peso: "+persona.getPeso()+"\n";
		
		String imc= calcularIMC(persona.getTalla(), persona.getPeso());
		return res;
	}
	
	public String calcularIMC(double talla, double peso) {
		double imc= peso/(talla*talla);
		
		return imc;
	}

}
