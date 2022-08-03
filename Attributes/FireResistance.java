package Attributes;

import Armours.Armour;

public class FireResistance extends AttributesDecorator{

    protected String attribute = "Fire Resistance + 5";

    public FireResistance(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
