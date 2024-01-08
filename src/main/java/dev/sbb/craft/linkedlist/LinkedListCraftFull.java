package dev.sbb.craft.linkedlist;

public class LinkedListCraftFull <T> extends LinkedListCraft<T> {

    public LinkedListCraftFull(T element, LinkedListCraft<T> next) {
        this.element = element;
        this.next = next;
    }


    public void print()
    {
        System.out.print(this.getElement());
        System.out.print(" ");
        this.getNext().print();
    }

    public int size()
    {
        return 1 + this.getNext().size();
    }


    public LinkedListCraft<T> insert(T element)
    {
            return new LinkedListCraftFull<>(this.getElement(), this.getNext().insert(element));
    }



    public LinkedListCraft<T> remove(T element)
    {
        if(this.getElement().equals(element))
        {
            return this.getNext();
        }
        else
        {
            this.setNext(this.getNext().remove(element));
            return this;
        }
    }

    public boolean contains(T element)
    {
        if(this.getElement().equals(element))
        {
            return true;
        }
        else
        {
            return this.getNext().contains(element);
        }
    }

    public T get(int index)
    {
        if(index == 0)
        {
            return this.getElement();
        }
        else
        {
            return this.getNext().get(index - 1);
        }
    }

    public int indexOf(T element)
    {
        if(this.getElement().equals(element))
        {
            return 0;
        }
        else
        {
            return 1 + this.getNext().indexOf(element);
        }
    }

    public LinkedListCraft<T> insert(T element, int index)
    {
        if(index == 0)
        {
            return new LinkedListCraftFull<>(element, this);
        }
        else
        {
            this.setNext(this.getNext().insert(element, index - 1));
            return this;
        }
    }

    public LinkedListCraft<T> change(int index, T element)
    {
        if(index == 0)
        {
            this.setElement(element);
        }
        else
        {
            this.setNext(this.getNext().change(index - 1, element));
        }
        return this;
    }

    public LinkedListCraft<T> remove(int index)
    {
        if(index == 0)
        {
            return this.getNext();
        }
        else
        {
            this.setNext(this.getNext().remove(index - 1));
            return this;
        }
    }


    public LinkedListCraft<T> reverse()
    {
        return this.getNext().reverse().insert(this.getElement());
    }

        public boolean isEmpty()
        {
            return false;
        }


}
