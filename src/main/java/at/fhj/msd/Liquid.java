package at.fhj.msd;

/**
 * Represents a liquid used in drinks, with properties for name, volume, and
 * alcohol percentage.
 */
public class Liquid {

    /**
     * The name of the liquid (e.g., "Vodka", "Juice").
     */
    private String name;

    /**
     * The volume of the liquid in liters.
     */
    private double volume;

    /**
     * The alcohol percentage of the liquid (e.g., 40.0 for 40%).
     */
    private double alcoholPercent;

    /**
     * Constructs a Liquid object with the specified parameters.
     *
     * @param name The name of the liquid
     * @param volume The volume in liters
     * @param alcoholPercent The alcohol percentage
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Gets the name of the liquid.
     *
     * @return The name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     *
     * @param name The new name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the volume of the liquid.
     *
     * @return The volume in liters
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid.
     *
     * @param volume The new volume in liters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Gets the alcohol percentage of the liquid.
     *
     * @return The alcohol percentage
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage of the liquid.
     *
     * @param alcoholPercent The new alcohol percentage
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Determines if the liquid is alcoholic.
     *
     * @return true if the liquid has a positive alcohol percentage, false
     * otherwise
     */
    public boolean isAlcoholic() {
        return this.alcoholPercent > 0;
    }
}
