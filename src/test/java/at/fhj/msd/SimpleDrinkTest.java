package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleDrinkTest {

    private SimpleDrink water;
    private SimpleDrink wine;

    @BeforeEach
    public void setup() {
        water = new SimpleDrink("Water", new Liquid("Water", 0.5, 0.0));
        wine = new SimpleDrink("Wine", new Liquid("Wine", 0.2, 12.0));
    }

    @Test
    public void testGetVolume() {
        assertEquals(0.5, water.getVolume(), 0.001);
        assertEquals(0.2, wine.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(0.0, water.getAlcoholPercent(), 0.001);
        assertEquals(12.0, wine.getAlcoholPercent(), 0.001);
    }
}
