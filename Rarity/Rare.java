package Rarity;

public class Rare extends Rarity{
    protected String rarity = "Rare";
    protected int NumOfRarities = 2;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getNumOfRarities() {
        return NumOfRarities;
    }
}
