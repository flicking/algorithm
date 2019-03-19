package com.flicking.study.algorithm.leetcode.array;

import java.util.*;

/**
 * 三数之和
 * @link https://leetcode-cn.com/problems/3sum/
 */
public class Sum3 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        Set<List<Integer>> setList = new HashSet<>();
        Arrays.sort(nums);//先排序
        //结果排序
        for(int a = 0; a < nums.length; a++){
            for (int b = a+1; b < nums.length; b++) {
                for (int c = b+1; c < nums.length; c++) {
                    if(nums[a]+nums[b]+nums[c] == 0){
                        setList.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    }
                }
            }
        }
        listList.addAll(setList);
        return listList;
    }

    /**
     * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     * 满足要求的三元组集合为：
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     * @param args
     */

    public static void main(String[] args) {
        Sum3 sum3 = new Sum3();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(sum3.threeSum(nums));
    }

}
