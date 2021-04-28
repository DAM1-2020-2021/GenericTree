package org.iesfm.generic;

import org.junit.Assert;
import org.junit.Test;

public class TreeTests {
    @Test
    public void insertInEmptyTreeTest() {

        Tree<Integer> integerTree = new Tree<>(null);

        integerTree.insert(3);

        Assert.assertEquals(3, integerTree.getRoot().getValue().longValue());
    }

    @Test
    public void insertNotEmptyTree() {
        Tree<Integer> integerTree = new Tree<>(new Node<>(3, null, null));

        integerTree.insert(2);

        Assert.assertEquals(2, integerTree.getRoot().getLeft().getValue().longValue());
    }

    @Test
    public void emptyTreeContainsTest() {

        Tree<Integer> integerTree = new Tree<>(null);

        Assert.assertFalse(integerTree.contains(1));

    }

    @Test
    public void notEmptyTreeContainsTest() {

        Tree<Integer> integerTree = new Tree<>(new Node<>(3, null, null));

        Assert.assertFalse(integerTree.contains(1));

        Assert.assertTrue(integerTree.contains(3));
    }

}
