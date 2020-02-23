package leetcode633;

import java.util.Arrays;
import java.util.HashSet;

/**
*          Input: 5
 *         Output: True
 *         Explanation: 1 * 1 + 2 * 2 = 5
 *         题目描述：判断一个非负整数是否为两个整数的平方和。
 *
 *         整数包含的是正整数 负整数 零
 */

public class Solution {

    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)Math.sqrt(c);

        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;

    }
}
