package com.datastructure.Table;

public class ListTable {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    private Node head;
    private int size;
    public ListTable() {
        head = null;
        size = 0;
    }
    public void insert(int element) {
        // 创建新节点
        Node newNode = new Node(element);

        // 如果链表为空，则直接设置头节点
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        // 遍历链表直到找到最后一个节点
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // 将新节点添加到最后一个节点之后
        current.next = newNode;
        size++;
    }

    public void remove(int element) {
        Node node = head;
        Node pre = null;
        while (node != null) {
            if (node.data == element) {
                if (pre == null) {
                    head = node.next;
                } else {
                    pre.next = node.next;
                }
                size--;
                return;
            }
            pre = node;
            node = node.next;
        }
    }
}
