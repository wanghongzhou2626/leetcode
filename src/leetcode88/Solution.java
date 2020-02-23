package leetcode88;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array (Easy)
 *
 *给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 需要从尾开始遍历，否则在 nums1 上归并得到的值会覆盖还未进行归并比较的值。
 */
public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //把数组nums2 copy到 nums1中 从nums1中 m 位置索引开始 copy 的个数为n个
        System.arraycopy(nums2, 0, nums1, m, n);
        //将nums1进行排序
        Arrays.sort(nums1);
    }


}
