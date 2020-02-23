package leetcode167;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    /* 使用一次循环 时间复杂度为O(n)
        再循环中找不到目标元素后再放入hash表中
     */

    public int[] twoNum(int[] num, int target) throws IllegalAccessException {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<num.length; i++) {
            int compare = target - num[i];
            if(map.containsKey(compare)) {
                return new int[] {map.get(compare), i};
            }
            map.put(num[i], i);
        }

        throw new IllegalAccessException("no two sum solution");
    }
}
