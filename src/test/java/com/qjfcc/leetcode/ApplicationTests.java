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

        String s = "1";
        s = String.valueOf(Integer.parseInt(s) & 3);

        System.out.println(s);


        Solution78 solution78 = new Solution78();
        int[] a1 = {1, 2, 3, 4};
        List<List<Integer>> list = solution78.subSets3(a1);
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

    @Test
    public void test67() {
        Solution67 solution67 = new Solution67();
        String  s = solution67.addBinary2("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
                ,"110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");
        System.out.println(s);


    }
}
