package com.datastructure;

/*
 * 节点
 * @author:LiHuaHua
 * @date: 2024/9/29
 */
public class Node {
    int data;
    Node root;
    Node left;
    Node right;
    int height;
    Node()
    {
        data=0;
        root=null;
        left=null;
        right=null;
        height=0;
    }

    public Node(int data,int height) {
        this.data = data;
        this.height = height;
    }

    public Node(int i) {
        data=i;
        height=0;
        root=null;
        left=null;
    }
}
