package dev.sbb.craft.linkedlist;

public abstract class LinkedListCraft<T>{
    T element;
    LinkedListCraft<T> next;


    /**
     * Returns the element stored in the node
     * @return the element stored in the node
     */
    public T getElement() {
        return element;
    }

    /**
     * Sets the element stored in the node
     * @param element the element to be stored in the node
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Returns the next node
     * @return the next node
     */
public LinkedListCraft<T> getNext() {
        return next;
    }

    /**
     * Sets the next node
     * @param next the next node
     */
    public void setNext(LinkedListCraft<T> next) {
        this.next = next;
    }

    /**
     * Prints the list
     */
    public abstract void print();

    /**
     * Returns the number of elements in the list
     * @return the number of elements in the list
     */
    public abstract int size();

    /**
     * Inserts an element at the end of the list
     * @param element the element to be inserted
     * @return the list with the element inserted
     */
    public abstract LinkedListCraft<T> insert(T element);

    /**
     * Removes an element from the list
     * @param element the element to be removed
     * @return the list with the element removed
     */
    public abstract LinkedListCraft<T> remove(T element);

    /**
     * Returns true if the list contains the specified element
     * @param element the element to be searched
     * @return true if the list contains the specified element
     */
    public abstract boolean contains(T element);

    /**
     * Returns the element at the specified index
     * @param index the index of the element to be returned
     * @return the element at the specified index
     */
    public abstract T get(int index);

    /**
     * Returns the index of the specified element
     * @param element the element whose index is to be returned
     * @return the index of the specified element
     */
    public abstract int indexOf(T element);

    /**
     * Inserts an element at the specified index
     * @param element the element to be inserted
     * @param index the index at which the element is to be inserted
     * @return the list with the element inserted
     */
    public abstract LinkedListCraft<T> insert(T element, int index);

    /**
     * Changes the element at the specified index
     * @param index the index of the element to be changed
     * @param element the new element
     * @return the list with the element changed
     */

    public abstract LinkedListCraft<T> change(int index, T element);

    /**
     * Removes the element at the specified index
     * @param index the index of the element to be removed
     * @return the list with the element removed
     */
    public abstract LinkedListCraft<T> remove(int index);

    /**
     * Reverses the list
     * @return the reversed list
     */
    public abstract LinkedListCraft<T> reverse();


    /**
     * Returns true if the list is empty
     * @return true if the list is empty
     */
    public abstract boolean isEmpty();


    @Override
    public String toString() {
        return element.toString();
    }
}