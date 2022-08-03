package Factory;

import java.util.Random;

import Armours.BaseArmour;
import Armours.Armour;
import Rarity.Rarity;

public abstract class ArmourFactory {

    Random random = new Random();


    protected abstract Rarity rarity();
    protected abstract BaseArmour slot(Rarity rarity);
    protected abstract Armour addAttributes(Armour clothing);

    protected Armour attributes(BaseArmour armour) {
        int count = armour.getRarity().getNumOfRarities();

        Armour AttributesOfArmour = (Armour) armour;
        for (int i = 0; i < count; i++){
            AttributesOfArmour = addAttributes(AttributesOfArmour);
        }

        return AttributesOfArmour;
    }
    
    public Armour generate(){
        return attributes(slot(rarity()));
    }

}
