package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringQueueTest {

    private StringQueue queue;

    @BeforeEach
    public void setup() {
        queue = new StringQueue(5); // your StringQueue expects a maxSize in constructor
    }

    @Test
    public void testOfferAndPoll() {
        assertTrue(queue.offer("Hello"));
        assertTrue(queue.offer("World"));
        assertEquals("Hello", queue.poll());
        assertEquals("World", queue.poll());
    }

    @Test
    public void testPeek() {
        queue.offer("Test");
        assertEquals("Test", queue.peek());
        assertEquals("Test", queue.peek()); // Peek does not remove the element
    }

    @Test
    public void testPollOnEmptyQueue() {
        assertNull(queue.poll());
    }

    @Test
    public void testOfferLimit() {
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");
        assertFalse(queue.offer("Overflow")); // Should return false when over max size
    }
}
