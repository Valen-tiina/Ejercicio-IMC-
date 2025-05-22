package data;
import java.util.ArrayList;
import logica.Persona;

	public class ModeloDatos {
	    private ArrayList<Persona> listaPersonas;

	    public ModeloDatos() {
	        listaPersonas = new ArrayList<>();
	    }

	    public String agregarPersona(Persona p) {
	        listaPersonas.add(p);
	        return"Persona agregada correctamente.";
	    }
	
	    public ArrayList<Persona> obtenerPersonas() {
	        return listaPersonas;
	    }
	    public void limpiarLista() {
	        listaPersonas.clear();
	    }
	}