package Attributes;

import Armours.Armour;

public class Strength extends AttributesDecorator{
    protected String attribute = "Strength + 5";

    public Strength(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {

        return armour.getDescription() + attribute + "\n";
    }
}
