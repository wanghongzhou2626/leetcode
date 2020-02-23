package leetcode167;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {


    /**
     * 使用哈希表两次迭代
     * 用空间换取时间 查找的时间负责度从O(n)下降到O(1)
     *
     */

    public int[] twoNum(int[] num, int target) throws IllegalAccessException {
        //存数据
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<num.length; i++) {
            //元素当key 索引当value
            map.put(num[i], i);
        }

        //查找数据
        for(int i=0; i<num.length; i++) {
            int compare = target - num[i];
            //存入map 集合中是否包含目标元素并且目标元素不能是num[i]本身
            if(map.containsKey(compare) && map.get(compare) != i) {
                return new int[] {i, map.get(compare)};
            }
        }
        throw new IllegalAccessException("no two sum solution");
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] numS = new int[] {2,4,5,6};
        int[] num = new int[2];
        try {
            num  = solution.twoNum(numS, 4);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("["+num[0]+","+num[1]+"]");
    }
}
