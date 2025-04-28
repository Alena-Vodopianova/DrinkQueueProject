package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue to store drinks.
 */
public class DrinkQueue {

    private Queue<Drink> drinks = new LinkedList<>();

    public boolean isEmpty() {
        return drinks.isEmpty();
    }
 
    public void clear() {
        drinks.clear();
    }

    public Drink peek() {
        return drinks.peek();
    }

    public int size() {
        return drinks.size();
    }
}