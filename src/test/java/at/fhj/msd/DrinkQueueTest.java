package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkQueueTest {

    private DrinkQueue queue;
    private SimpleDrink water;
    private SimpleDrink juice;

    @BeforeEach
    public void setup() {
        queue = new DrinkQueue();
        water = new SimpleDrink("Water", new Liquid("Water", 0.5, 0.0));
        juice = new SimpleDrink("Juice", new Liquid("Juice", 0.3, 0.0));
    }

    @Test
    public void testOfferAndPoll() {
        assertTrue(queue.offer(water));
        assertEquals(water, queue.poll());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.offer(water);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPeek() {
        queue.offer(water);
        assertEquals(water, queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    public void testClear() {
        queue.offer(water);
        queue.offer(juice);
        queue.clear();
        assertTrue(queue.isEmpty());
    }
}
