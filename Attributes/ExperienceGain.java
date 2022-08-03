package Attributes;

import Armours.Armour;

public class ExperienceGain extends AttributesDecorator{

    protected String attribute = "Health + 5";

    public ExperienceGain(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }


}
