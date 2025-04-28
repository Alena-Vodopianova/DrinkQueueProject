package at.fhj.msd;

/**
 * Abstract base class for concrete drink classes, providing common properties
 * and behavior.
 */
public abstract class Drink {

    /**
     * The name of the drink.
     */
    protected String name;

    /**
     * Constructs a Drink object with the specified name.
     *
     * @param name The name of the drink
     */
    public Drink(String name) {
        this.name = name;
    }

    /**
     * Calculates the volume of the drink.
     *
     * @return The volume of the drink in liters
     */
    public abstract double getVolume();

    /**
     * Calculates the alcohol percentage of the drink.
     *
     * @return The alcohol percentage (0 to 100)
     */
    public abstract double getAlcoholPercent();

    /**
     * Determines if the drink is alcoholic.
     *
     * @return true if the drink contains alcoholic liquids, false otherwise
     */
    public abstract boolean isAlcoholic();

    /**
     * Gets the name of the drink.
     *
     * @return The name of the drink
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the drink.
     *
     * @param name The new name of the drink
     */
    public void setName(String name) {
        this.name = name;
    }
}
