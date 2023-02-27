package ar.edu.info.oo.model;

import java.util.Comparator;

public class PreguntaInteresGeneral extends Pregunta {

	public PreguntaInteresGeneral(String texto, Usuario autor) {
		super(texto, autor);
	}

	@Override
	public Comparator<Respuesta> getComparador() {
		return (
				Comparator.comparingInt(Respuesta::diferenciaDeVotos)
				);
	}

}
