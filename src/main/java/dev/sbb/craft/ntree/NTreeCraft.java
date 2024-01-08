package dev.sbb.craft.ntree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author Saliou Bailo BAH
 * NTreeCraft is a generic class that represents a tree with an arbitrary number of children per node.
 * @param <T>
 */
class NTreeCraft<T> {
    private Craft<T> root;

    // Constructeur
    public NTreeCraft(T rootData) {
        root = new Craft<>(rootData);
    }

    /**
     * Adds a child to a parent node
     * @param parent the parent node
     * @param childData the data of the child node
     */
    public void addChild(Craft<T> parent, T childData) {
        Craft<T> child = new Craft<>(childData);
        parent.children.add(child);
    }

    /**
     * Returns the root of the tree
     * @return the root of the tree
     */
    public Craft<T> getRoot() {
        return root;
    }


    /**
     * Private Prints the tree
     * @param node the node to be printed
     * @param depth the depth of the node
     */
    private void printTree(Craft<T> node, int depth) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            indentation.append("  "); // Deux espaces pour chaque niveau de profondeur
        }

        System.out.println(indentation + node.data.toString());

        for (Craft<T> child : node.children) {
            printTree(child, depth + 1);
        }
    }

    /**
     * Prints the tree
     */
    public void printTree() {
        printTree(root, 0);
    }

    /**
     * Returns the number of elements in the tree
     * @return the number of elements in the tree
     */
    public int size()
    {
        return this.root.size();
    }

    /**
     * Inserts an element at the end of the tree
     * @param element the element to be inserted
     * @return the tree with the element inserted
     */
    public NTreeCraft<T> insert(T element)
    {
        return new NTreeCraft<>(element);
    }

 /**
     * Removes an element from the tree
     * @param element the element to be removed
     */
    public void remove(T element) {
        removeElement(root, element);
    }


    private void removeElement(Craft<T> node, T element) {
        Iterator<Craft<T>> iterator = node.children.iterator();
        while (iterator.hasNext()) {
            Craft<T> child = iterator.next();
            if (child.data.equals(element)) {
                iterator.remove();
                return;
            } else {
                removeElement(child, element);
            }
        }
    }


}