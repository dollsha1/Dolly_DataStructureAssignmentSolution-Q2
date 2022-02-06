package com.greatlearning.bstconverter.main;

import com.greatlearning.bstconverter.model.*;
import com.greatlearning.bstconverter.services.*;

public class Main {
	public Node node;
    public static void main(String[] args) {
        var bSTServices = new BstServices();

        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.left.right= new Node(40);

        System.out.println("Result before Conversion");
        bSTServices.inOrder(tree.node);


        Node skewedTree = bSTServices.convertBSTIntoRightSkewedBST(tree.node);

        System.out.println("\nResult After Conversion");
        Node rightNode = skewedTree;
        while(rightNode != null){
            System.out.print(rightNode.getData() + " ");
            rightNode = rightNode.right;
        }
    }
}