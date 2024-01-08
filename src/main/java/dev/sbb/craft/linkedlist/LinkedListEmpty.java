package dev.sbb.craft.linkedlist;

public class LinkedListEmpty <T> extends LinkedListCraft<T>{
    public LinkedListEmpty()
    {

        this.element = null;
        this.next = null;
    }

    public int size()
    {
        return 0;
    }

    public LinkedListCraft<T> insert(T element)
    {
        return new LinkedListCraftFull<>(element, new LinkedListEmpty<>());
    }

    public LinkedListCraft<T> remove(T element)
    {
        return this;
    }

    public boolean contains(T element)
    {
        return false;
    }

    public T get(int index)
    {
        return null;
    }

    public int indexOf(T element)
    {
        return -1;
    }

    @Override
    public LinkedListCraft<T> insert(T element, int index) {
        return null;
    }

    @Override
    public LinkedListCraft<T> change(int index, T element) {
        return null;
    }

    @Override
    public LinkedListCraft<T> remove(int index) {
        return null;
    }

    @Override
    public LinkedListCraft<T> reverse() {
        return new LinkedListEmpty<>();
    }

    public boolean isEmpty()
    {
        return true;
    }


    public void print()
    {
        System.out.println();
    }





}
