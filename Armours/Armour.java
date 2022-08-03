package Armours;

import Rarity.Rarity;

public interface Armour {
        public abstract String getDescription();
        public Rarity getRarity();
        public int getNumOfRarities();
}

