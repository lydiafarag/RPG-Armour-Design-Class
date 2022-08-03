package Attributes;

import Armours.Armour;

public  class Health extends AttributesDecorator{

    protected String attribute = "Health + 5";

    public Health(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {

        return armour.getDescription() + attribute + "\n";
    }

}
