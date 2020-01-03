package com.Juan;
public class MasterClass{

    public String name;
    public String heroClass;
    public int hp;
    public int physicalDamage;
    public int magicalDamage;
    public int armor;
    public int magicResist;
    public int moveSpeed;
    public double aaSpeed;

    public MasterClass(int hp, int pd, int md, int a, int mr, int ms, double as){
        this.hp = hp;
        this.physicalDamage = pd;
        this.magicalDamage = md;
        this.armor = a;
        this.magicResist = mr;
        this.moveSpeed = ms;
        this.aaSpeed = as;
    }

    public String getName() {
        return name;
    }
    public String getHeroClass() {
        return heroClass;
    }
    public int getHp() {
        return hp;
    }
    public int getPhysicalDamage() {
        return physicalDamage;
    }
    public int getMagicalDamage() {
        return magicalDamage;
    }
    public int getArmor() {
        return armor;
    }
    public int getMagicResist() {
        return magicResist;
    }
    public int getMoveSpeed() {
        return moveSpeed;
    }
    public double getAaSpeed() {
        return aaSpeed;
    }



    public String toString() {
        String out ="--------------------\n";
        out = out + "- hp : " + this.hp + "\n";
        out = out + "- physical damages : " + this.physicalDamage + "\n";
        out = out + "- magical damages : " + this.magicalDamage + "\n";
        out = out + "- armor : " + this.armor + "\n";
        out = out + "- magic resist : " + this.magicResist + "\n";
        out = out + "- move speed : " + this.moveSpeed + "\n";
        out = out + "- attack speed : " + this.aaSpeed + "\n";
        out = out + "--------------------\n";
        return out;
    }
}
