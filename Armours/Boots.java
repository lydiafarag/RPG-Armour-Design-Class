package Armours;

import Rarity.Rarity;

public class Boots extends BaseArmour {
    protected String slot = "Boots";

    public Boots(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }

}
