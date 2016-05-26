/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceshooter;

import iut.Game;


public class Bouclier extends Bonus {

	private int dureeDeVie;
	private int nombreProjectilesDevies;

    public Bouclier(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

}