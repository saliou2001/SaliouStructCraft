package dev.sbb.craft.stack;


import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Stack;

class StackCraftTest {

    @org.junit.jupiter.api.Test
    void push() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(1, stack.get(0));
        Assertions.assertEquals(2, stack.get(1));
        Assertions.assertEquals(3, stack.get(2));
    }

    @org.junit.jupiter.api.Test
    void pop() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
    }

    @org.junit.jupiter.api.Test
    void peek() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.peek());
        Assertions.assertEquals(3, stack.peek());
    }

    @org.junit.jupiter.api.Test
    void size() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals(3, stack.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        StackCraft<Integer> stack = new StackCraft<>();
        Assertions.assertTrue(stack.isEmpty());
        stack.push(1);
        Assertions.assertFalse(stack.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        StackCraft<String> stack = new StackCraft<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");
        Assertions.assertEquals(0, stack.indexOf("apple"));
    }

    @org.junit.jupiter.api.Test
    void stackToList() {
        StackCraft<Double> stack = new StackCraft<>();
        stack.push(1.1);
        stack.push(2.2);
        stack.push(3.3);
        Assertions.assertEquals(Arrays.asList(1.1, 2.2, 3.3), stack.stackToList());
    }

    @org.junit.jupiter.api.Test
    void testPop() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
       StackCraft<Integer> copyStack = new StackCraft<>(stack);
       Assertions.assertEquals(3, copyStack.pop(2));
    }

    @org.junit.jupiter.api.Test
    void change() {
        StackCraft<String> stack = new StackCraft<>();
        stack.push("apple");
        stack.push("banana");
        stack.push("orange");
        stack.change(1, "pear");
        Assertions.assertEquals("pear", stack.get(1));
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Assertions.assertEquals("{1, 2, 3]", stack.toString());
    }
    @org.junit.jupiter.api.Test
    void testClone() {
        StackCraft<Integer> stack = new StackCraft<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        StackCraft<Integer> copyStack = stack.clone();
        Assertions.assertEquals(stack, copyStack);
    }
}