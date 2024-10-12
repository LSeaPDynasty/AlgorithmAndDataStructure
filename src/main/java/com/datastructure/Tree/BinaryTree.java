package com.datastructure.Tree;


/*
 * 二叉树
 * @author: LiHuaHua
 * @date: 2024/9/29
 */
public class BinaryTree extends Tree{

    public BinaryTree(int i) {
        root = new Node(i);
    }



    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(5);
        tree.addNode(tree.root,new Node(2));
        tree.addNode(tree.root,new Node(1));
        tree.addNode(tree.root,new Node(4));
        tree.addNode(tree.root,new Node(3));
        tree.addNode(tree.root,new Node(6));
        tree.addNode(tree.root,new Node(7));
        tree.addNode(tree.root,new Node(8));


        print(tree);
    }

}
