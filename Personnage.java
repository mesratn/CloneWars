/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Kevin
 */
public class Personnage {
    
    protected int posX;
    protected int posY;
    protected int currentZone;
    protected int save;
    protected int hp;
    protected int maxHp;
    protected int def;
    protected int power;
    protected int force;
    protected int intelligence;
    protected int lvl;
    protected int xp;
    protected String picture;
    protected int xpValue = 10 * lvl;
    
    public void saveVerif(){
        File s1 = new File("./Save/sv1.txt");
        File s2 = new File("./Save/sv2.txt");
        File s3 = new File("./Save/sv3.txt");

        if (save == 0)
        {
            if (!s1.exists())
            {
                this.setSave(1);
                System.out.println(save);
            }
            else if (!s2.exists())
            {
                this.setSave(2);
                System.out.println(save);
            }
            else if (!s3.exists())
            {
                this.setSave(3);
                System.out.println(save);
            }
            else 
            {
                System.out.println("Il n'y a plus d'emplacement de libre");
            }
        }
        try {
            this.save();            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void save() throws FileNotFoundException {
        String saveData = currentZone + " " + save + " " + hp + " " + def + " " + power + " " + force + " " + intelligence + " " + lvl + " " + xp + " " + picture;
            
        switch (save){
            case 1:
                File s1 = new File("./Save/sv1.txt");
                PrintWriter pw1 = new PrintWriter(s1);
                pw1.write(saveData);
                pw1.close();
                break;
            case 2:
                File s2 = new File("./Save/sv2.txt");
                PrintWriter pw2 = new PrintWriter(s2);
                pw2.write(saveData);
                pw2.close();
                break;
            case 3:
                File s3 = new File("./Save/sv3.txt");
                PrintWriter pw3 = new PrintWriter(s3);
                pw3.write(saveData);
                pw3.close();
                break;
            }
    }
    
    public boolean estVivant() {
        if (hp > 0)
            return true;
        else
            return false;
    }
    
    
    public Personnage(int pv, int df, int pw, int fo, int intel, String image, int zone, int savenb, int level, int pex)
    {
        lvl = level;
        hp = pv;
        maxHp = pv;
        def = df;
        power = pw;
        force = fo;
        intelligence = intel;
        picture = image;
        xp = pex;
        currentZone = zone;
        save = savenb;
    }
    
    public void checkLvl()
    {
        if (xp == 100 * (lvl * 2))
            this.levelUp();
    }
    
    public void physicalAttack(Personnage ennemy)
    {
        ennemy.setHp(ennemy.getHp() - (this.getPower() - ennemy.getDef()));
        if (ennemy.getHp() < 0)
            ennemy.setHp(0);
    }
    
    public void forceAttack(Personnage ennemy)
    {
        ennemy.setHp(ennemy.getHp() - (this.getForce() / 10 * 2));
        if (ennemy.getHp() < 0)
            ennemy.setHp(0);
    }
    
    public void armedAttack(Personnage ennemy)
    {
        int dgt = 0;
        if (ennemy.getDef() < this.getIntelligence())
            dgt = this.getIntelligence() - ennemy.getDef();
        ennemy.setHp(ennemy.getHp() - dgt);
        if (ennemy.getHp() < 0)
            ennemy.setHp(0);
        System.out.println(this.getPicture() + " : " + this.getLvl());
        System.out.println(this.getIntelligence() + " - " + ennemy.getDef() + " = " + dgt);
    }
        
    public void levelUp()
    {
        this.setMaxHp(this.getMaxHp() * 3 / 2);
        this.setDef(this.getDef() * 3 / 2);
        this.setPower(this.getPower() * 3 / 2);
        this.setForce(this.getPower() * 3 / 2);
        this.setIntelligence(this.getIntelligence() * 3 / 2);
        this.setXp(0);
        this.Heal();
    }

    public void Heal() {
        this.setHp(this.getMaxHp());
    }
    
    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    public int getCurrentZone() {
        return currentZone;
    }

    public void setSave(int save) {
        this.save = save;
    }
    public void setCurrentZone(int currentZone) {
        this.currentZone = currentZone;
    }
    
    public int getXpValue() {
        return xpValue;
    }

    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }

    public int getPower() {
        return power;
    }

    public int getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getLvl() {
        return lvl;
    }

    public int getXp() {
        return xp;
    }

    public String getPicture() {
        return picture;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setXpValue(int xpValue) {
        this.xpValue = xpValue;
    }
    
    
}