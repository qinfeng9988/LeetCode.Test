package com.qjfcc.leetcode;

/**
 * @Author: qinjiangfeng
 * @Date: 2022/2/11 15:21
 * @Description:
 */
public class Solution67 {

    //region 最终解法
    public String addBinary2(String a, String b) {
        int length = Math.max(a.length(), b.length());
        a = add(a, length);
        b = add(b, length);
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        StringBuilder s = new StringBuilder();
        //进位
        int c = 0;
        for (int i = length - 1; i >= 0; i--) {
            int sum = Integer.parseInt(String.valueOf(aChars[i])) + Integer.parseInt(String.valueOf(bChars[i])) + c;
            if (sum > 2) {
                c = 1;
                s.insert(0, "1");
            } else if (sum == 2) {
                c = 1;
                s.insert(0, "0");
            } else if (sum == 1) {
                c = 0;
                s.insert(0, "1");
            } else {
                s.insert(0, "0");
            }
        }
        if (c == 1) {
            s.insert(0, "1");
        }
        return s.toString();
    }

    private String add(String a, int length) {
        if (a.length() >= length) {
            return a;
        }
        StringBuilder aBuilder = new StringBuilder(a);
        for (int i = 0; i < length - a.length(); i++) {
            aBuilder.insert(0, "0");
        }
        return aBuilder.toString();
    }

    //endregion

    //region 第一种解法 整型想加，容易溢出
    public String addBinary(String a, String b) {
        long aValue = Long.parseUnsignedLong(a, 2);
        long bValue = Long.parseUnsignedLong(b, 2);
        aValue += bValue;
        return castToString(aValue);
    }

    public String castToString(long v) {
        StringBuilder r = new StringBuilder();
        if (v == 0) {
            r.append("0");
            return r.toString();
        }
        while (v > 0) {
            if (v % 2 == 1) {
                r.insert(0, "1");
            } else {
                r.insert(0, "0");
            }
            v = v / 2;
        }
        return r.toString();
    }

    //endregion
}
