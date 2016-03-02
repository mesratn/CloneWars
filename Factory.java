/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class Factory {
    private int lvl;

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    public Factory(int level)
    {
        lvl = level;
    }

    public Personnage generate()
    {
        Personnage target;
        Random rand = new Random();
        Random randLvl = new Random();
        int bonus = randLvl.nextInt(3) - 1;
        int choice = rand.nextInt(18);
        if (choice < 10)
            target = this.makeClone(lvl+ bonus);
        else if (choice < 15)
            target = this.makeSoldat(lvl + bonus);
        else
            target = this.makeDroid(lvl + bonus);
        return target;
    }
    
    public Clone makeClone(int lvl)
    {
        Clone clone = new Clone();
        for (int i = 0; i < lvl; i++)
            clone.levelUp();
        return clone;
    }
    
    public Soldat makeSoldat(int lvl)
    {
        Soldat soldat = new Soldat();
        for (int i = 0; i < lvl; i++)
            soldat.levelUp();
        return soldat;
    }
    
    public Droid makeDroid(int lvl)
    {
        Droid droid = new Droid();
        for (int i = 0; i < lvl; i++)
            droid.levelUp();
        return droid;
    }
}