package at.fhj.msd;

/**
 * Represents a liquid used in drinks, with properties for name, volume, and
 * alcohol percentage.
 */
public class Liquid {

    private String name;
    private double volume;
    private double alcoholPercent;

    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public boolean isAlcoholic() {
        return this.alcoholPercent > 0;
    }
}

