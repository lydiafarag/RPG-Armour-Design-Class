package Armours;
import Rarity.Rarity;

public class Sword extends BaseArmour {
    protected String slot = "Sword";

    public Sword(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {
        return rarity.getRarity() + " " + slot + ":\n";
    }

}
