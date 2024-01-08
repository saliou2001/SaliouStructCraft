package dev.sbb.craft.ntree;

import java.util.ArrayList;
import java.util.List;


class NTreeCraft<T> {
    private Craft<T> root;

    // Constructeur
    public NTreeCraft(T rootData) {
        root = new Craft<>(rootData);
    }

    // Méthode pour ajouter un enfant à un nœud donné
    public void addChild(Craft<T> parent, T childData) {
        Craft<T> child = new Craft<>(childData);
        parent.children.add(child);
    }

    public Craft<T> getRoot() {
        return root;
    }

    // Méthode récursive pour afficher l'arbre
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

    // Méthode publique pour afficher l'arbre en partant de la racine
    public void printTree() {
        printTree(root, 0);
    }

    public int size()
    {
        return this.root.size();
    }

    public NTreeCraft<T> insert(T element)
    {
        return new NTreeCraft<>(element);
    }


}