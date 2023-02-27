package ar.edu.info.oo.model;

import java.time.LocalDateTime;

public class Voto {
	private LocalDateTime fecha;
	private Usuario autor;
	private boolean esPositivo;
	
	public Voto(Usuario autor, boolean esPositivo) {
		this.autor=autor;
		this.esPositivo=esPositivo;
		this.fecha=LocalDateTime.now();
	}
	
	public boolean esPositivo() {
		return this.esPositivo;
	}

}
