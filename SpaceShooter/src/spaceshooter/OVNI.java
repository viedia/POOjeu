/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spaceshooter;


import iut.*;

public abstract class OVNI extends ObjetTouchable {

	private int pv;

    public OVNI(Game g, String nom, int x, int y) {
        super(g, nom, x, y);
    }

}