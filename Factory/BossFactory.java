package Factory;

import Armours.*;
import Attributes.*;
import Rarity.*;

public class BossFactory extends ArmourFactory{


    @Override
    protected Rarity rarity() {
        int rarity = random.nextInt(4);

        if (rarity == 0){
            return new Common();
        }
        else if (rarity == 1) {
            return new Uncommon();
        }
        else if (rarity == 2) {
            return new Rare();
        }
        else {
            return new Unique();
        }
    }

    @Override
    protected Armour addAttributes(Armour armour) {
        int attribute = random.nextInt(3);

        if (attribute == 0){
            return new FireResistance(armour);
        }
        else if (attribute == 1) {
            return new ExperienceGain(armour);
        }
        else if (attribute == 2) {
            return new Health(armour);
        }
        else{
            return new Strength(armour);
        }
    }

    @Override
    protected BaseArmour slot(Rarity rarity) {
        int slot = random.nextInt(3);

        if (slot == 0){
            return new Boots(rarity);
        }
        else if (slot == 1) {
            return new Shield(rarity);
        }
        else if (slot == 2) {
            return new Sword(rarity);
        }
        else{
            return new Helm(rarity);
        }

    }
}
