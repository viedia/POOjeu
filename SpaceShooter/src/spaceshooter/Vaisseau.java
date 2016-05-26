/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceshooter;

import iut.Game;


public abstract class Vaisseau extends OVNI {

    public Vaisseau(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

	public abstract void tirer();

	public void setPos() {
		// TODO - implement Vaisseau.setPos
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement Vaisseau.operation
		throw new UnsupportedOperationException();
	}

}