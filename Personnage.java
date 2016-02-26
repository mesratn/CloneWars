/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone.wars;

/**
 *
 * @author Kevin
 */
public class Personnage {
    public int hp;
    protected int def;
    protected int power;
    protected int force;
    protected int intelligence;
    protected int lvl;
    protected int xp;
    
    public Personnage(int pv, int df, int pw, int fo, int intel)
    {
        lvl = 1;
    }
    
    public void physicalAttack(Personnage ennemy)
    {
        ennemy.hp -= power - ennemy.def;
    }
    
    public void forceAttack(Personnage ennemy)
    {
        ennemy.hp -= (force/10) * 2;
    }
    
    public void armedAttack(Personnage ennemy)
    {
        ennemy.hp -= intelligence - ennemy.def;
    }
}
