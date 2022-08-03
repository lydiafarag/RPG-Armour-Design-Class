package Rarity;

public class Unique extends Rarity{
    protected String rarity = "Unique";
    protected int NumOfRarities = 3;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getNumOfRarities() {
        return NumOfRarities;
    }
}
