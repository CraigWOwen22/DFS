package com.company;

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        Node left, right;
    }


}




public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }

    public void printInOrder(Node node){

        if(node==null) {
            System.out.println("HIT");
            return;
        }
        System.out.println(node.key + "x ");
        printInOrder(node.left);
        System.out.println(node.key + " ");
        printInOrder(node.right);
        System.out.println(node.key + "xx ");

    }

    public void printInOrder(){
        printInOrder(root);
        System.out.println("root " + root.key);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nIn order traversal of binary tree is ");
        tree.printInOrder();

    }
}
