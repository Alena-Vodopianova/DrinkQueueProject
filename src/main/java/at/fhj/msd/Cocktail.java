package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a cocktail drink composed of multiple liquids.
 */
public class Cocktail extends Drink {

    /**
     * The list of liquids in the cocktail.
     */
    private List<Liquid> liquids;

    /**
     * Constructs a Cocktail with the specified name.
     *
     * @param name The name of the cocktail
     */
    public Cocktail(String name) {
        super(name);
        this.liquids = new ArrayList<>();
    }

    /**
     * Adds a liquid to the cocktail.
     *
     * @param liquid The liquid to add
     */
    public void addLiquid(Liquid liquid) {
        liquids.add(liquid);
    }

    /**
     * Gets the list of liquids in the cocktail.
     *
     * @return The list of liquids
     */
    public List<Liquid> getLiquids() {
        return liquids;
    }

    /**
     * Calculates the total volume of the cocktail by summing the volumes of all
     * liquids.
     *
     * @return The total volume in liters
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : liquids) {
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Calculates the alcohol percentage of the cocktail based on its liquids.
     *
     * @return The alcohol percentage, or 0 if the total volume is 0
     */
    @Override
    public double getAlcoholPercent() {
        double totalVolume = getVolume();
        if (totalVolume == 0) {
            return 0;
        }

        double alcoholVolume = 0;
        for (Liquid l : liquids) {
            if (l.isAlcoholic()) {
                alcoholVolume += l.getVolume();
            }
        }
        return (alcoholVolume / totalVolume) * 100;
    }

    /**
     * Determines if the cocktail is alcoholic.
     *
     * @return true if any liquid in the cocktail is alcoholic, false otherwise
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid l : liquids) {
            if (l.isAlcoholic()) {
                return true;
            }
        }
        return false;
    }
}
