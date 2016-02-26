/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone;

import java.util.Random;

/**
 *
 * @author Kevin
 */
public class Factory {
    
    private int lvl;
    
    public Factory(int level)
    {
        lvl = level;
    }

    public void generate()
    {
        Random rand = new Random();
        int choice = rand.nextInt(18);
        if (choice < 10)
            this.makeClone(lvl);
        else if (choice < 15)
            this.makeSoldat(lvl);
        else
            this.makeDroid(lvl);
    }
    
    public Clonne makeClone(int lvl)
    {
        Clonne clone = new Clonne();
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
