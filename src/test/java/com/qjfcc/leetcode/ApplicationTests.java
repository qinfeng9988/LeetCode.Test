package com.qjfcc.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test78() {
        Solution78 solution78 = new Solution78();
        int[] a1 = {1, 2, 3, 4};
        List<List<Integer>> list = solution78.subsets(a1);
        for (List<Integer> integers : list) {
            System.out.println(integers);
        }
    }

    @Test
    public void test78SubSets() {
        Solution78 solution78 = new Solution78();
        int[] a1 = {1, 2, 3, 4};
        // for (int i : a1) {
        LinkedList<Integer> startList = new LinkedList<>();
        startList.add(5);
        startList.add(6);

        List<LinkedList<Integer>> list = solution78.subsets1(startList, a1);
        if (list != null) {
            for (List<Integer> integers : list) {
                System.out.println(integers);
            }
        }
        // }

    }
}
