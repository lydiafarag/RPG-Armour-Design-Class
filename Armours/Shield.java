package Armours;

import Rarity.Rarity;

public class Shield extends BaseArmour {
    protected String slot = "Shield";

    public Shield(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }

}
