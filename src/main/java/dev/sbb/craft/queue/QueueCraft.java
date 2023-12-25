package dev.sbb.craft.queue;

import java.util.ArrayList;
import java.util.List;



//annotation of the class like author, version, etc

/**
 * @author Saliou Bailo BAH
 * @version 1.0
 * @param <T> the type of elements in the queue
 *This class represents a queue data structure
 */

public class QueueCraft<T> implements Cloneable{
    private List<T> elements;

    public QueueCraft() {
        this.elements = new ArrayList<>();
    }

    public QueueCraft(List<T> elements) {
        this.elements = new ArrayList<>(elements);
    }

    /**
     * Inserts an element at the end of the queue.
     * @param element the element to be inserted
     */
    public void insert(T element) {
        elements.add(element);
    }

    /**
     * inserts an element at the specified index
     * @param element the element to be inserted
     * @param index the index at which the element is to be inserted
     */
    public void insert(T element, int index) {
        elements.add(index, element);
    }

    /**
     * Removes the first element of the queue
     * @return the removed element
     */
    public T remove() {
        return elements.remove(0);
    }

    /**
     * Removes the element at the specified index
     * @param index the index of the element to be removed
     * @return the removed element
     */
    public T remove(int index) {
        return elements.remove(index);
    }

    /**
     * Returns the first element of the queue
     * @return the first element
     */
    public T get() {
        return elements.get(0);
    }

    /**
     * Returns the queue as a list
     * @return the queue as a list
     */
    public List<T> getElements() {
        return elements;
    }

    /**
     * Returns the element at the specified index
     * @param index the index of the element to be returned
     * @return the element at the specified index
     */
    public T get(int index) {
        return elements.get(index);
    }

    /**
     * Returns the size of the queue
     * @return the size of the queue
     */
    public int size() {
        return elements.size();
    }

    /**
     * Returns the index of the specified element
     * @param element the element whose index is to be returned
     * @return the index of the specified element
     */
    public int indexOf(T element) {
        return elements.indexOf(element);
    }

    /**
     * Returns true if the queue is empty
     * @return true if the queue is empty
     */
    public boolean isEmpty()
    {
        return this.elements.isEmpty();
    }

    /**
     * Returns true if the queue contains the specified element
     * @param element the element whose presence in the queue is to be tested
     * @return true if the queue contains the specified element
     */
    public boolean contains(T element) {
        return elements.contains(element);
    }

    /**
     * Returns true if the queue contains all the elements of the specified queue
     * @param queue the queue whose elements are to be checked for containment
     * @return true if the queue contains all the elements of the specified queue
     */
    public boolean containsAll(QueueCraft<T> queue) {
        return queue.elements.stream().allMatch(element -> this.contains(element));
    }

    /**
     * Deletes all the elements of the queue
     * @return  true if the queue is cleared
     */
    public boolean clear() {
        if(!this.isEmpty())
        {
            this.elements.clear();
            return true;
        }
        return false;
    }

    /**
     * Returns the queue as a string
     * @return the queue as a string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (T element : elements) {
            sb.append(element.toString());
            sb.append(" - ");
        }
        sb.delete(sb.length() - 3, sb.length());
        sb.append("}");
        return sb.toString();
    }

    /**
     * Returns true if the queue is equal to the specified object
     * @param obj the object to be compared for equality with the queue
     * @return true if the queue is equal to the specified object
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QueueCraft) {
            QueueCraft<T> other = (QueueCraft<T>) obj;
            if (this.size() == other.size()) {
                return other.elements.stream().allMatch(element -> this.contains( (T) element));
            }
        }
        return false;
    }

    /**
     * Returns true if the queue is equal to the specified queue
     * @param other the queue to be compared for equality with the queue
     * @return true if the queue is equal to the specified queue
     */
    private boolean checkIfElementIsEqual(T other) {
        return elements.stream().allMatch(element -> element.equals(other));
    }


    @Override
    public QueueCraft<T> clone() {
        try {
            QueueCraft<T> clone = (QueueCraft<T>) super.clone();
            clone.elements = new ArrayList<>();
            for (T element : this.elements) {
                clone.insert(element);
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
