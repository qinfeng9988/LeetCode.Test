package com.qjfcc.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: qinjiangfeng
 * @Date: 2022/2/10 18:08
 * @Description:
 */
public class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        if (nums.length == 1) {
            lists.add(Collections.singletonList(nums[0]));
            return lists;
        }
        //临时数据，存放每一次外层循环产生的数组列表
        List<LinkedList<Integer>> lists1 = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            LinkedList<Integer> array3 = new LinkedList<>();
            array3.add(nums[j]);
            if ((j + 1) != nums.length) {
                lists1.add(array3);
            }
            lists.add(array3);
        }

        while (lists1.size() > 0) {
            int c = lists1.size();
            for (int j = 0; j < c; j++) {
                List<LinkedList<Integer>> lists2 = this.subsets1(lists1.get(j), nums);
                if (lists2 == null) {
                    continue;
                }
                lists1.addAll(lists2);
                lists.addAll(lists2);
            }
            lists1 = lists1.subList(c, lists1.size());
        }
        return lists;
    }

    public List<LinkedList<Integer>> subsets1(LinkedList<Integer> startList, int[] nums) {
        //获取数组中最的最后一个数据
        int lastNum = startList.getLast();
        if (lastNum == nums[nums.length - 1]) {
            return null;
        }
        List<LinkedList<Integer>> lists = new ArrayList<>();
        for (int i = nums.length - 1; i > 0; i--) {
            if (lastNum == nums[i]) {
                break;
            }

            LinkedList<Integer> a = new LinkedList<>();
            a.add(nums[i]);
            a.addAll(0, startList);
            lists.add(a);
        }
        return lists;

    }

    public List<List<Integer>> subSets3(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int loopSize = lists.size();
            for (int j = 0; j < loopSize; j++) {
                List<Integer> list = new ArrayList<>(lists.get(j));
                list.add(nums[i]);
                lists.add(list);
            }
        }
        return lists;
    }

}
