package org.iesfm.generic;

import java.util.Objects;

public class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> left;
    private Node<T> right;

    public Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void insert(T newValue) {
        int result = value.compareTo(newValue);
        if (result < 0) {
            if (right == null) {
                right = new Node<>(newValue, null, null);
            } else {
                right.insert(newValue);
            }
        } else if (result > 0) {
            if (left == null) {
                left = new Node<>(newValue, null, null);
            } else {
                left.insert(newValue);
            }
        }
    }

    public boolean contains(T newValue) {
        int result = value.compareTo(newValue);
        boolean found = false;
        if (result == 0) {
            found = true;
        } else if (result < 0) {
            if (right != null) {
                found = right.contains(newValue);
            }
        } else {
            if (left != null) {
                found = left.contains(newValue);
            }
        }
        return found;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value) && Objects.equals(left, node.left) && Objects.equals(right, node.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, left, right);
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
