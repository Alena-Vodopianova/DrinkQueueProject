package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A bounded queue implementation for storing String objects.
 */
public class StringQueue implements IQueue {

    /**
     * The list to store queue elements.
     */
    private List<String> elements = new ArrayList<>();

    /**
     * The maximum size of the queue.
     */
    private int maxSize;

    /**
     * Constructs a StringQueue with the specified maximum size.
     *
     * @param maxSize The maximum number of elements the queue can hold
     * @throws IllegalArgumentException if maxSize is non-positive
     */
    public StringQueue(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size must be positive");
        }
        this.maxSize = maxSize;
    }

    /**
     * Adds the specified String to the queue.
     *
     * @param obj The String to add
     * @return true if the String was added successfully, false if the queue is
     * full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() >= maxSize) {
            return false;
        }
        elements.add(obj);
        return true;
    }

    /**
     * Retrieves and removes the first String from the queue.
     *
     * @return The first String in the queue, or null if the queue is empty
     */
    @Override
    public String poll() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.remove(0);
    }

    /**
     * Retrieves and removes the first String from the queue, throwing an
     * exception if the queue is empty.
     *
     * @return The first String in the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return element;
    }

    /**
     * Retrieves the first String in the queue without removing it.
     *
     * @return The first String in the queue, or null if the queue is empty
     */
    @Override
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    /**
     * Retrieves the first String in the queue without removing it, throwing an
     * exception if the queue is empty.
     *
     * @return The first String in the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return element;
    }

    
    
}
