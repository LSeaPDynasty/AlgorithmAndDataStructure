package com.datastructure.Tree;

/*
 *  树
 * @author: LiHuaHua
 * @date: 2024/9/29
 */

public class Tree {

     public Node root;


    Tree() {
        root = new Node();
        root.data = 0;
        root.left = root.right = null;
    }

    Tree(int data) {
        this.root = new Node();
        this.root.data = data;
        root.left = root.right = null;
    }
    /*
     * 添加节点
     * @param node
     */

    public void addNode(Node root,Node node){
        if(root == null){
            root= node;
            return;
        }
        if(node.data==root.data) return;

        if(node.data<root.data){
            if(root.left==null){
                root.left = node;
                node.height=0;
                node.root = root.root;
            }
            else{
                addNode(root.left,node);
            }
        }else{
            if(root.right==null){
                root.right = node;
                node.height=0;
                node.root = root;
            }
            else{
                addNode(root.right,node);
            }
        }
    }
    /*
     * 打印树
     */
    public static void print(Tree tree) {
        System.out.println("The binary tree is:");
        printInOrder(tree.root, 0, "H", 17);
    }

    private static void printInOrder(Node root, int height, String to, int len) {
        if (root == null) {
            return;
        }
        printInOrder(root.right, height + 1, "v", len);
        String val = to + root.data + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(root.left, height + 1, "^", len);
    }

    private static String getSpace(int num) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(space);
        }
        return stringBuilder.toString();
    }

}
