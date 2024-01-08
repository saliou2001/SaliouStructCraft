package dev.sbb.craft.linkedlist;

public abstract class LinkedListCraft<T>{
    T element;
    LinkedListCraft<T> next;


    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

public LinkedListCraft<T> getNext() {
        return next;
    }

    public void setNext(LinkedListCraft<T> next) {
        this.next = next;
    }

    public abstract void print();
    public abstract int size();
    public abstract LinkedListCraft<T> insert(T element);
    public abstract LinkedListCraft<T> remove(T element);
    public abstract boolean contains(T element);
    public abstract T get(int index);
    public abstract int indexOf(T element);
    public abstract LinkedListCraft<T> insert(T element, int index);
    public abstract LinkedListCraft<T> change(int index, T element);
    public abstract LinkedListCraft<T> remove(int index);
    public abstract LinkedListCraft<T> reverse();

    public abstract boolean isEmpty();


    @Override
    public String toString() {
        return element.toString();
    }
}