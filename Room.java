/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

/**
 *
 * @author Kevin
 */

import java.util.Vector;

public class Room {
	private int lvl;
	private Vector<Personnage> liste;
	private char type; //backChar = ' ', wallChar = 'X', cellChar = ' ', room = 'O'
	
	public Room(char type, int lvl) {
		this.type = type;
		this.lvl = lvl;
	}
	
	public void CreateEnnemies () {
		if (this.type == 'O') {
			//generate random ennemies with right level
		}
	}

	public int getLvl() {
		return this.lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public Vector<Personnage> getListe() {
		return this.liste;
	}

	public void setListe(Vector<Personnage> liste) {
		this.liste = liste;
	}
	
	public int getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}
}
