package Attributes;

import Armours.Armour;
import Rarity.Rarity;

public abstract class AttributesDecorator implements Armour{
    protected int NumOfRarities;
    protected Armour armour;
    protected String attribute;

    @Override
    public Rarity getRarity() {
        return armour.getRarity();
    }

    @Override
    public int getNumOfRarities(){
        return NumOfRarities;
    }

    public AttributesDecorator(Armour armour){
        NumOfRarities = armour.getNumOfRarities();
        if(armour.getRarity().getNumOfRarities() > NumOfRarities){
            this.armour = armour;
            NumOfRarities++;
        }
    }

}
