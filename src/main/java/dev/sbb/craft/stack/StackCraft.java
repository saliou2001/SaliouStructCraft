package dev.sbb.craft.stack;

import java.util.List;
import java.util.Stack;

public class StackCraft<T> implements Cloneable{

    private Stack<T> stack=new Stack<>();

    /**
     * Creates an empty stack
     */
    public StackCraft(){
        this.stack = new Stack<>();
    }

    /**
     * @param stack the stack to be used
     */
    public StackCraft(StackCraft<T> stack){
        this.stack = stack.stack;
    }
    /**
     * Inserts an element at the top of the stack
     * @param  element the element to be pushed
     *
     *
     */
    public void push(T element){
        stack.push(element);
    }

    /**
     * Removes the element at the top of the stack
     * @return the removed element
     */
    public T pop() {
        return stack.pop();
    }

    /**
     * Returns the element at the top of the stack
     * @return the element at the top of the stack
     */
    public T peek() {
        return stack.peek();
    }

    /**
     * Returns the number of elements in the stack
     * @return the number of elements in the stack
     */

    public int size() {
        return stack.size();
    }

    /**
     * Returns true if the stack is empty
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the index of the specified element
     * @param element the element whose index is to be returned
     * @return the index of the specified element
     */
    public int indexOf(T element) {
        return stack.indexOf(element);
    }

    /**
     * Returns the stack as a list
     * @return the stack as a list
     */
    public List<T> stackToList()
    {
        return this.stack.stream().toList();
    }

    /**
     * Deletes the element at the specified index
     * @param index the index of the element to be returned
     * @return the element at the specified index
     */
    public T pop(int index)
    {
        return this.stack.remove(index);
    }

    /**
     * Change the element at the specified index
     *
     * @param index   the index of the element to be returned
     * @param element the element to be changed
     */
    public void change(int index, T element)
    {
        if(index < 0 || index >= this.stack.size())
        {
            return;
        }
        this.stack.set(index, element);
    }



    public T get(int index)
    {
        return this.stack.get(index);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (T element : stack) {
            sb.append(element);
            sb.append(" - ");
        }
        sb.delete(sb.length() - 3, sb.length());
        sb.append("]");
        return sb.toString();
    }



    @Override
    public StackCraft<T> clone() {
        try {
            StackCraft<T> clone = (StackCraft) super.clone();
            this.stack.forEach(element -> clone.stack.push(element));
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
