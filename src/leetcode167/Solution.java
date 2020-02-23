package leetcode167;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]

 */

public class Solution {

    /**
     * 暴力法 双层for循环
     *  时间复杂度为O(n^2)
     */

    public int[] twoSum(int [] num, int target) throws IllegalAccessException {

        for(int i=0; i<num.length; i++) {
            for(int j=i+1; j<num.length; j++) {
                if(num[j] == target - num[i]) {
                    return new int[] {i, j};
                }
            }
        }
       throw new IllegalAccessException("No Two Sum Solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numS = new int[] {2,4,5,6};
        int[] num = new int[2];
        try {
            num  = solution.twoSum(numS, 8);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("["+num[0]+","+num[1]+"]");
    }


}
