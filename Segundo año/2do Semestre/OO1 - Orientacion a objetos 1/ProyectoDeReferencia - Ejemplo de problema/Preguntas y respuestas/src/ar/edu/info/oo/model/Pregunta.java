package ar.edu.info.oo.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Pregunta extends Post {
	
	protected List<Respuesta> respuestas;
	
	public Pregunta(String texto, Usuario autor) {
		super(texto,autor);
		this.respuestas=new ArrayList<Respuesta>();
	}
	
	public Respuesta mejorRespuesta() {
		return (
					this.respuestas.stream().
									max(this.getComparador()).
									orElse(null)
				);
	}
	
	public abstract Comparator<Respuesta> getComparador();
	
	public boolean fueRespondida() {
		return this.respuestas.stream().anyMatch(r -> r.fueRespondida());
	}
	
	public void agregarRespuesta(Respuesta respuesta) {
		this.respuestas.add(respuesta);
	}

}
