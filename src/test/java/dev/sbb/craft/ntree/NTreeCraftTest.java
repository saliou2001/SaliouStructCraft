package dev.sbb.craft.ntree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NTreeCraftTest {

    @Test
    void addChild() {
        // Création de l'arbre avec un nœud racine contenant "Root"
        NTreeCraft<String> tree = new NTreeCraft<>("Root");

        // Ajout d'enfants au nœud racine
        tree.addChild(tree.getRoot(), "Child1");
        tree.addChild(tree.getRoot(), "Child2");

        // Vérification du nombre d'enfants du nœud racine
        assertEquals(2, tree.getRoot().children.size());
    }

    @Test
    void printTree() {
        // Création de l'arbre avec un nœud racine contenant "Root"
        NTreeCraft<String> tree = new NTreeCraft<>("Root");

        // Ajout d'enfants au nœud racine
        tree.addChild(tree.getRoot(), "Child1");
        tree.addChild(tree.getRoot(), "Child2");

        // Capture la sortie standard pour vérifier l'affichage
        final StringBuilder printedOutput = new StringBuilder();
        System.setOut(new java.io.PrintStream(System.out) {
            public void println(String s) {
                printedOutput.append(s).append("\n");
            }
        });

        // Appelle la méthode d'affichage de l'arbre
        tree.printTree();

        // Restaure la sortie standard
        System.setOut(System.out);

        // Vérifie que l'affichage correspond à ce qui est attendu
        assertEquals("Root\n  Child1\n  Child2\n", printedOutput.toString());
    }

    @Test
    void size() {
        // Création de l'arbre avec un nœud racine contenant "Root"
        NTreeCraft<String> tree = new NTreeCraft<>("Root");

        // Ajout d'enfants au nœud racine
        tree.addChild(tree.getRoot(), "Child1");
        tree.addChild(tree.getRoot(), "Child2");

        // Vérification de la taille de l'arbre
        assertEquals(3, tree.size());
    }

    @Test
    void insert() {
        // Création de l'arbre avec un nœud racine contenant "Root"
        NTreeCraft<String> tree = new NTreeCraft<>("Root");

        // Insertion d'un nouvel élément dans l'arbre
        NTreeCraft<String> newTree = tree.insert("NewNode");

        tree.addChild(newTree.getRoot(), "Child1");



        // Vérification de la taille de l'arbre
        assertEquals(2, newTree.size());



    }
}
