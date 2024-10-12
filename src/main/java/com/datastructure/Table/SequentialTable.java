package com.datastructure.Table;

import java.util.Arrays;

/*
 * 顺序表
 * @author lihuahua
 * @date 2024/10/12
 */
public class SequentialTable {

    private int[] elements;
    private int size;
    private final int DEFAULT_CAPACITY = 10;//默认容量

    public SequentialTable() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }
    // 插入元素
    public void insert(int element) {
        if (size < DEFAULT_CAPACITY) {
            elements[size] = element;
            size++;
        }
        else {
            int DEFAULT_LOAD_FACTOR = 2;//扩容因子
            int newCapacity = DEFAULT_CAPACITY * DEFAULT_LOAD_FACTOR;//新容量
            elements = resizeArray(elements, newCapacity);//扩容
            elements[size] = element;
        }
    }

    // 扩容1
    private static int[] resizeArray(int[] elements, int newCapacity) {
        int[] newElements = new int[newCapacity];
        // srcPos: 旧数组起始位置 ， length: 复制的数量， destPos: 复制到新数组的起始位置
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        return newElements;
    }

    // 扩容2 原理同“扩容1” 属于小白使用
    private static int[] resizeArray2(int[] elements, int newCapacity) {
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        return newElements;
    }
    // 扩容3
    private static int[] resizeArray3(int[] elements, int newCapacity) {
        return Arrays.copyOf(elements, newCapacity);
    }
    // 删除元素
    public void remove(int element) {
        for (int i = 0; i < size;i++) {
            if (elements[i] == element) {
                elements[i] = elements[size - 1];
                size--;
            }
        }
    }
    // 获取元素
    public int get(int index) {
        return elements[index];
    }
    // 获取长度
    public int size() {
        return size;
    }
}
