package com.datastructure;



/*
 * 平衡二叉树
 * @author: LiHuaHua
 * @date: 2024/9/29
 */
public class BalancedBinaryTree extends BinaryTree{

    BalancedBinaryTree(int data){
        super(data);
    }


    /*
     * 旋转树
     */
    public Node rotate(Node node){
        if(node.left.height - node.right.height > 1){
            //左子树比右子树高
            //左子树左子树比右子树高
            if(node.left.left.height - node.left.right.height > 0){
                return node.left;
            }
            //左子树左子树比右子树低
            else{
                node.left = rotate(node.left);
                return node;
            }
        }
        else if(node.right.height - node.left.height > 1){
            //右子树比左子树高
            //右子树右子树比左子树高
            if(node.right.right.height - node.right.left.height > 0){
                return node.right;
            }
            //右子树右子树比左子树低
            else{
                node.right = rotate(node.right);
                return node;
            }
        }

        return null;
    }


    /*
     *平衡
     */
    public Tree Balance(Tree node){
        return null;
    }

    public static void main(String[] args) {
        BalancedBinaryTree tree = new BalancedBinaryTree(5);
        tree.addNode(tree.root,new Node(2));
        tree.addNode(tree.root,new Node(1));
        tree.addNode(tree.root,new Node(4));
        tree.addNode(tree.root,new Node(3));
        tree.addNode(tree.root,new Node(6));
        tree.addNode(tree.root,new Node(7));
        tree.addNode(tree.root,new Node(8));
        print(tree);
        System.out.println("---------------------------------------------------------");
        BalancedBinaryTree.print(tree.Balance(tree));
        System.out.println();
    }
}