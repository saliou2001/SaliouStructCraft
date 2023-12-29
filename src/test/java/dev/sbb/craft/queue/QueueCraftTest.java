package dev.sbb.craft.queue;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueueCraftTest {

    @org.junit.jupiter.api.Test
    void testSize() {
        QueueCraft<Integer> queue = new QueueCraft<>();
        queue.insert(1);

        assertEquals(1, queue.size());
        assertEquals(1, queue.get());
    }

    @org.junit.jupiter.api.Test
    void testInsert() {
        QueueCraft<String> queue = new QueueCraft<>();
        queue.insert("A");
        queue.insert("B", 1);

        assertEquals("A", queue.get(0));
        assertEquals("B", queue.get(1));
    }

    @org.junit.jupiter.api.Test
    void insertAtIndexNonEmptyQueue() {
        QueueCraft<String> queue = new QueueCraft<>(Arrays.asList("apple", "banana", "orange"));
        queue.insert("grape", 1);

        assertEquals("grape", queue.get(1));
        assertEquals("banana", queue.get(2));
        assertEquals(4, queue.size());
    }

    @org.junit.jupiter.api.Test
    void insertAtIndexEmptyQueue() {
        QueueCraft<Integer> queue = new QueueCraft<>();
        queue.insert(42, 0);

        assertEquals(42, queue.get(0));
        assertEquals(1, queue.size());
    }

    @org.junit.jupiter.api.Test
    void insertAtIndexOutOfBounds() {
        QueueCraft<Character> queue = new QueueCraft<>(Arrays.asList('a', 'b', 'c'));

        // Attempt to insert at an index beyond the current size
        assertThrows(IndexOutOfBoundsException.class, () -> queue.insert('d', 5));
    }
    @org.junit.jupiter.api.Test
    void remove() {
        QueueCraft<Double> queue = new QueueCraft<>();
        queue.insert(1.1);
        queue.insert(2.2);

        assertEquals(1.1, queue.remove());
        assertEquals(1, queue.size());
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        QueueCraft<Character> queue = new QueueCraft<>();
        queue.insert('a');
        queue.insert('b');

        assertEquals('a', queue.remove(0));
        assertEquals(1, queue.size());
    }

    @org.junit.jupiter.api.Test
    void get() {
        QueueCraft<String> queue = new QueueCraft<>();
        queue.insert("apple");
        queue.insert("banana");

        assertEquals("apple", queue.get());
    }

    @org.junit.jupiter.api.Test
    void getElements() {
        QueueCraft<Integer> queue = new QueueCraft<>(Arrays.asList(1, 2, 3));
        List<Integer> elements = queue.getElements();

        assertEquals(3, elements.size());
        assertTrue(elements.contains(1));
        assertTrue(elements.contains(2));
        assertTrue(elements.contains(3));
    }

    @org.junit.jupiter.api.Test
    void testGet() {
    }


    @org.junit.jupiter.api.Test
    void indexOf() {
        QueueCraft<Character> queue = new QueueCraft<>(Arrays.asList('a', 'b', 'c'));
        assertEquals(1, queue.indexOf('b'));
        assertEquals(-1, queue.indexOf('z')); // Assuming 'z' is not in the queue
    }


    @org.junit.jupiter.api.Test
    void isEmpty() {
        QueueCraft<String> emptyQueue = new QueueCraft<>();
        QueueCraft<String> nonEmptyQueue = new QueueCraft<>(Arrays.asList("apple", "orange"));

        assertTrue(emptyQueue.isEmpty());
        assertFalse(nonEmptyQueue.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void contains() {
        QueueCraft<String> queue = new QueueCraft<>(Arrays.asList("apple", "banana", "orange"));
        assertTrue(queue.contains("banana"));
        assertFalse(queue.contains("grape")); // Assuming 'grape' is not in the queue
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        QueueCraft<Integer> queue = new QueueCraft<>(Arrays.asList(1, 2, 3));
        assertEquals("{1 - 2 - 3}", queue.toString());
    }

    @org.junit.jupiter.api.Test
    void clearNonEmptyQueue() {
        QueueCraft<String> queue = new QueueCraft<>(Arrays.asList("apple", "banana", "orange"));
        assertTrue(queue.clear());
        assertTrue(queue.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void clearEmptyQueue() {
        QueueCraft<Integer> queue = new QueueCraft<>();
        assertFalse(queue.clear());
        assertTrue(queue.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        QueueCraft<Integer> queue1 = new QueueCraft<>(Arrays.asList(1, 2, 3));
        QueueCraft<Integer> queue2 = new QueueCraft<>(Arrays.asList(1, 2, 3));

        assertEquals(queue1, queue2);
    }

    @org.junit.jupiter.api.Test
    void testClone() {
        QueueCraft<Double> originalQueue = new QueueCraft<>(Arrays.asList(1.1, 2.2, 3.3));
        QueueCraft<Double> clonedQueue = originalQueue.clone();

        assertEquals(originalQueue, clonedQueue);

        assertNotSame(originalQueue, clonedQueue);
    }


}