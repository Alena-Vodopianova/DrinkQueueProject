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

    @Override
    public boolean offer(Drink drink) {
        return drinks.offer(drink);
    }

    @Override
    public Drink poll() {
        return drinks.poll();
    }

    @Override
    public Drink remove() {
        Drink drink = drinks.poll();
        if (drink == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return drink;
    }

    @Override
    public Drink peek() {
        return drinks.peek();
    }

    @Override
    public Drink element() {
        Drink drink = drinks.peek();
        if (drink == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return drink;
    }

    public int size() {
        return drinks.size();
    }
}
