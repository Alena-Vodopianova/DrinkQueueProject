package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * StringQueue class to manage a queue of strings
 */
public class StringQueue implements IQueue {

    private List<String> elements = new ArrayList<String>();
    private int maxSize = 5;

    public StringQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public boolean offer(String obj) {
        if (elements.size() < maxSize) {
            elements.add(obj); 
        }else {
            return false;
        }

        return true;
    }

    @Override
    public String poll() {
        String element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return element;
    }

    @Override
    public String peek() {
        if (elements.size() > 0) {
            return elements.get(0); 
        }else {
            return null;
        }
    }

    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }

        return element;
    }
}
