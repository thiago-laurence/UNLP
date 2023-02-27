package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	String texto;
	int cantLikes;
	boolean destacado;
	double n = ( (140 * 0.1) + (90 * 0.1) );
	
	public WallPostImpl() {
		texto = "Undefined post";
		cantLikes = 0;
		destacado = false;
	}

	/**
	 * Complete con su implementación
	 */

	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}"
            + n;
    }

	@Override
	public String getText() {
		return (texto);
	}

	@Override
	public void setText(String text) {
		this.texto = text;
	}

	@Override
	public int getLikes() {
		return (cantLikes);
	}

	@Override
	public void like() {
		cantLikes ++;
	}

	@Override
	public void dislike() {
		if (cantLikes > 0) {
			cantLikes --;
		}
	}

	@Override
	public boolean isFeatured() {
		return (destacado);
	}

	@Override
	public void toggleFeatured() {
		destacado = !destacado;
	}


}
