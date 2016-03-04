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
public class Droid extends Personnage{
    public Droid() {
        super (50, 100, 25, 0, 200, "Battle_Droid.png", 1, 0, 1, 100, false);
    }
    public Droid(int zone, int save, int pv, int df, int fo,int pw, int intel, int lvl, int pex, String pic) {
        super(pv, df, pw, fo, intel, pic, zone, save, lvl, pex, false);
    }
}
