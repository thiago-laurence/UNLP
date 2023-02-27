package ar.edu.info.oo.model;

import java.util.Comparator;

public class PreguntaTecnica extends Pregunta {
	
	public PreguntaTecnica(String texto, Usuario autor) {
		super(texto,autor);
	}

	public Comparator<Respuesta> getComparador(){
		return (Comparator.comparing(Respuesta::adhesion));
	}
	

}
