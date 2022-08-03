package Armours;

import Rarity.Rarity;
public abstract class BaseArmour implements Armour{
    protected String slot;
    protected Rarity rarity;

    public BaseArmour(Rarity rarity){
        this.rarity = rarity;
    }

    @Override
    public Rarity getRarity() {
        return rarity;
    }

    @Override
    public int getNumOfRarities(){
        return 0;
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }

}
