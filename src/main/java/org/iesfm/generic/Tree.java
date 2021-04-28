package org.iesfm.generic;

import java.util.Objects;

public class Tree<T extends Comparable<T>> {

    private Node<T> root;

    public Tree(Node<T> root) {
        this.root = root;
    }

    public void insert(T value) {
        if (root == null) {
            root = new Node(value, null, null);
        } else {
            root.insert(value);
        }
    }

    public boolean contains(T newValue) {
        boolean result = false;
        if (root != null) {
            result = root.contains(newValue);
        }
        return result;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree<?> tree = (Tree<?>) o;
        return Objects.equals(root, tree.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
