package dev.sbb.craft.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCraftTest {

    @org.junit.jupiter.api.Test
    void size() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        assertEquals(3, list.size());
    }

    @org.junit.jupiter.api.Test
    void insert() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        LinkedListCraft<Integer> liste1 = list.insert(4);
        assertEquals(4, liste1.size());
        assertEquals(4, liste1.get(3));
    }

    @org.junit.jupiter.api.Test
    void insertAtIndex() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        LinkedListCraft<Integer> liste1 = list.insert(4, 1);
        assertEquals(4, liste1.size());
        assertEquals(4, liste1.get(1));
        assertEquals(2, liste1.get(2));
    }


    @org.junit.jupiter.api.Test
    void change() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        LinkedListCraft<Integer> liste1 = list.change(1, 4);
        assertEquals(3, liste1.size());
        assertEquals(4, liste1.get(1));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        LinkedListCraft<Integer> liste1 = list.remove(1);
        assertEquals(2, liste1.size());
        assertEquals(3, liste1.get(1));
    }

    @org.junit.jupiter.api.Test
    void reverse() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        LinkedListCraft<Integer> liste1 = list.reverse();
        assertEquals(3, liste1.size());
        assertEquals(3, liste1.get(0));
        assertEquals(2, liste1.get(1));
        assertEquals(1, liste1.get(2));
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        assertEquals(1, list.indexOf(2));
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        LinkedListCraft<Integer> list = new LinkedListCraftFull<>(1, new LinkedListCraftFull<>(2, new LinkedListCraftFull<>(3, new LinkedListEmpty<>())));
        assertFalse(list.isEmpty());
    }
}