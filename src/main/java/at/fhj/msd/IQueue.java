package at.fhj.msd;

/**
 * Defines a queue data structure for storing and manipulating String objects.
 */
public interface IQueue {

    /**
     * Adds the specified String to the queue.
     *
     * @param obj The String to add
     * @return true if the String was added successfully, false if the queue is
     * full (for bounded queues)
     */
    boolean offer(String obj);

    /**
     * Retrieves and removes the first String from the queue.
     *
     * @return The first String in the queue, or null if the queue is empty
     */
    String poll();

    /**
     * Retrieves and removes the first String from the queue, throwing an
     * exception if the queue is empty.
     *
     * @return The first String in the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    String remove();

    /**
     * Retrieves the first String from the queue without removing it.
     *
     * @return The first String in the queue, or null if the queue is empty
     */
    String peek();

    /**
     * Retrieves the first String from the queue without removing it, throwing
     * an exception if the queue is empty.
     *
     * @return The first String in the queue
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    String element();
}
