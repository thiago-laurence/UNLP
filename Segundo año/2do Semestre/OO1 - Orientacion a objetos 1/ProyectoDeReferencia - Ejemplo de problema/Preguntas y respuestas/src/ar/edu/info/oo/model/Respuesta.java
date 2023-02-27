package ar.edu.info.oo.model;

import java.util.ArrayList;
import java.util.List;

public class Respuesta extends Post {
	
	private List<Voto> votos;
	
	
	public Respuesta(String texto, Usuario autor) {
		super(texto,autor);
		this.votos = new ArrayList<Voto>();
	}
	
	public boolean fueRespondida() {
		
		return this.votos.stream().anyMatch(v->v.esPositivo());
		
	}
	
	public int diferenciaDeVotos() {
		int positivos = this.votosPositivos();
		int negativos = this.votos.size()-positivos;
		return positivos - negativos;
	}

	private int votosPositivos() {
		return (int) this.votos.stream().filter(v -> v.esPositivo()).count();
	}
	
	public double adhesion() {
		if( (this.votos.isEmpty())) {
			return 0;
		}else {
		return this.votosPositivos() / this.votos.size();}
	}
	
	public void votarPositivamente(Usuario autor) {
		this.votos.add(new Voto(autor,true));
	}
	
	public void votarNegativamente(Usuario autor) {
		this.votos.add(new Voto(autor,false));
	}
	
	

}
