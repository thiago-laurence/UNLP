package ar.edu.info.oo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sistema {
	private List<Usuario> usuarios;
	private List<Pregunta> preguntas;
	
	public Sistema() {
		this.preguntas=new ArrayList<Pregunta>();
		this.usuarios=new ArrayList<Usuario>();
	}
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public void agregarPregunta(Pregunta p) {
		this.preguntas.add(p);
	}
	
	public void agregarRespuesta(Respuesta r, Pregunta p) {
		p.agregarRespuesta(r);
	}
	
	public List<Pregunta> respondidas(){
		return this.preguntas.stream().filter(p->p.fueRespondida()).collect(Collectors.toList());
	}

}
