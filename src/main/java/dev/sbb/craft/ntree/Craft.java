package dev.sbb.craft.ntree;

import java.util.ArrayList;
import java.util.List;

class Craft<T> {
    T data;
    List<Craft<T>> children;

    // Constructeur
    public Craft(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void print()
    {
        System.out.print(this.data);
        System.out.print(" ");
        for(Craft<T> child : this.children)
        {
            child.print();
        }
    }

    public int size()
    {
        int size = 1;
        for(Craft<T> child : this.children)
        {
            size += child.size();
        }
        return size;
    }


    public Craft<T> insert(T element)
    {
        return new Craft<>(element);
    }




}
