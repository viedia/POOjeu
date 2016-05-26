/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceshooter;

import iut.Game;


public abstract class Asteroide extends OVNI {

	private String typeDeplacement;

    public Asteroide(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

	public void scinderEnDeux() {
		// TODO - implement Asteroide.scinderEnDeux
		throw new UnsupportedOperationException();
	}

}