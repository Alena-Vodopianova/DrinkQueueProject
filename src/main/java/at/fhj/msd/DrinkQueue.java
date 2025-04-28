package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue to store drinks.
 */
public class DrinkQueue {

    private Queue<Drink> drinks = new LinkedList<>();

    public boolean offer(Drink drink) {
        return drinks.offer(drink);
    }

    public Drink poll() {
        return drinks.poll();
    }


}
