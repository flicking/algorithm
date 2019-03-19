package com.flicking.study.algorithm.geekbang.a1_array;

import java.util.ArrayList;

/**
 * （整型）固定大小的数组实现，不支持扩容
 */
public class Array {

    //参数定义，数组，容量大小，实际个数
    private int data[];
    private int n;
    private int count;

    //构造函数，定义数组大小，初始化数组
    public Array(int capacity) {
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    //索引查找
    public int find(int index){
        if(index < 0 || index >= count){
            return -1;
        }
        return data[index];
    }

    //插入
    public boolean insert(int index, int value){
        if(count == n){
            System.out.println("数组空间已满");
            return false;
        }
        //支持尾部插入
        if(index < 0 || index > count){
            System.out.println("位置不合法");
            return false;
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = value;
        count++;
        return true;
    }

    //删除
    public boolean delete(int index){
        if(index < 0 || index >= count){
            return false;
        }
        for (int i = index+1; i < count; i--) {
            data[i-1] = data[i];
        }
        count--;
        return true;
    }

}
