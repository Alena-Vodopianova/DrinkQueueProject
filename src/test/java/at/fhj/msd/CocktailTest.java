package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocktailTest {

    private Cocktail cocktail;
    private Liquid rum;
    private Liquid cola;

    @BeforeEach
    public void setup() {
        cocktail = new Cocktail("Cuba Libre");
        rum = new Liquid("Rum", 0.05, 40.0);
        cola = new Liquid("Cola", 0.15, 0.0);
    }

    @Test
    public void testAddLiquidAndVolume() {
        cocktail.addLiquid(rum);
        cocktail.addLiquid(cola);
        assertEquals(0.20, cocktail.getVolume(), 0.001);
    }

    @Test
    public void testAlcoholPercent() {
        cocktail.addLiquid(rum);
        cocktail.addLiquid(cola);
        assertEquals(25.0, cocktail.getAlcoholPercent(), 0.1); // Roughly (40% of 0.05L)
    }

    @Test
    public void testEmptyCocktail() {
        assertEquals(0, cocktail.getVolume(), 0.001);
        assertEquals(0, cocktail.getAlcoholPercent(), 0.001);
    }
}
