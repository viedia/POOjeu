/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceshooter;

import iut.Game;
import iut.Objet;



public class VaisseauJoueur extends Vaisseau {

	private boolean bouclier;
	private boolean tirer;
	private int vitesse;
	private int nombreCartouche;

    public VaisseauJoueur(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

	public void monter() {
		// TODO - implement VaisseauJoueur.monter
		throw new UnsupportedOperationException();
	}

	public void descendre() {
		// TODO - implement VaisseauJoueur.descendre
		throw new UnsupportedOperationException();
	}

    @Override
    public void tirer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void effect(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFriend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}