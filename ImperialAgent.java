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
public class ImperialAgent extends Personnage{
    public ImperialAgent() {
        super(350, 100, 100, 0, 350, "ImperialAgent.png", 1, 0, 1, 0);
    }
    public ImperialAgent(int zone, int save, int pv, int df, int fo,int pw, int intel, int lvl, int pex, String pic) {
        super(pv, df, pw, fo, intel, pic, zone, save, lvl, pex);
    }
}
