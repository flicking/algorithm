package com.flicking.study.algorithm.geekbang.a1_array;

import java.util.ArrayList;

/**
 * （整型）数组实现
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
        ArrayList arrayList = new ArrayList();
    }

    //删除

    //扩容

}
