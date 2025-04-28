package at.fhj.msd;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * A queue to store and manage Drink objects.
 */
public class DrinkQueue implements IQueue {
    /**
     * The underlying queue to store Drink objects.
     */
    private Queue<Drink> drinks = new LinkedList<>();

    /**
     * Adds the specified Drink to the queue.
     *
     * @param drink The Drink to add
     * @return true if the Drink was added successfully
     */
    @Override
    public boolean offer(Drink drink) {
        return drinks.offer(drink);
    }

    /**
     * Retrieves and removes the first Drink from the queue.
     *
     * @return The first Drink in the queue, or null if the queue is empty
     */
    @Override
    public Drink poll() {
        return drinks.poll();
    }

    /**
     * Retrieves and removes the first Drink from the queue, throwing an exception if the queue is empty.
     *
     * @return The first Drink in the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    @Override
    public Drink remove() {
        Drink drink = drinks.poll();
        if (drink == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return drink;
    }

    /**
     * Retrieves the first Drink in the queue without removing it.
     *
     * @return The first Drink in the queue, or null if the queue is empty
     */
    @Override
    public Drink peek() {
        return drinks.peek();
    }

    /**
     * Retrieves the first Drink in the queue without removing it, throwing an exception if the queue is empty.
     *
     * @return The first Drink in the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    @Override
    public Drink element() {
        Drink drink = drinks.peek();
        if (drink == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return drink;
    }

    /**
     * Returns the number of Drinks in the queue.
     *
     * @return The size of the queue
     */
    public int size() {
        return drinks.size();
    }
}