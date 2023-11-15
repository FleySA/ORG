package com.telran.org.lesson_13;

import java.util.LinkedList;
import java.util.Queue;

public class TestBFS {
    public static void main(String[] args) {
        BinaryTree binaryTreeTwo = new BinaryTree();
        binaryTreeTwo.insert(10, "node 10");
        binaryTreeTwo.insert(9, "node 9");
        binaryTreeTwo.insert(7, "node 7");
        binaryTreeTwo.insert(8, "node 8");
        binaryTreeTwo.insert(13, "node 13");
        binaryTreeTwo.insert(11, "node 11");
        binaryTreeTwo.insert(14, "node 14");
        binaryTreeTwo.print();

   depthInOrder(binaryTreeTwo.getRoot());

    }
    public static void depthInOrder(Node node) {
        if (node == null) {
            return;
        }
        depthInOrder(node.getLeft());
        System.out.println("Value = " + node.getValue());
        depthInOrder(node.getRight());
    }

    private static void  breadFirstSearch(BinaryTree binaryTree){
        Queue<Node> queue = new LinkedList<>();
        queue.add(binaryTree.getRoot); //3

        while (!queue.isEmpty()){ // 5 /1 4 / 2 3
            Node node = queue.poll();
            System.out.println("Value = " + node.getValue());
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
    }
}
