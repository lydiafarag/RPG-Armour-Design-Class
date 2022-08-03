package Armours;
import Rarity.Rarity;
public class Helm extends BaseArmour{
    protected String slot = "Helm";

    public Helm(Rarity rarity) {
        super(rarity);
    }

    @Override
    public String getDescription() {

        return rarity.getRarity() + " " + slot + ":\n";
    }
}
