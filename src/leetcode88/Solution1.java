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
public class Solution1 {
    /**
     * 数组从后往前进行比较 填充
     * 时间复杂度O(m+n)
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //创建两个指针分别指向数组的最后一个元素
        int p1 = m-1;
        int p2 = n-1;
        //数组合并后的元素个数
        int merge = m+n-1;
        while (p1 >= 0 || p2 >= 0) {
            //如果数组一索引小于零 说明：数组一的元素都已经移动到数组一种从后往前指定的位置了 只需移动数组二
            if (p1 < 0) {
                nums1[merge--] = nums2[p2--];
            } else if (p2 < 0) {
                nums1[merge--] = nums1[p1--];
            //数组一最后一个大于数组二最后一个，说明数组一最后一个应该是最大的
            } else if (nums1[p1] > nums2[p2]) {
                nums1[merge--] = nums1[p1--];
            } else {
                nums1[merge--] = nums2[p2--];
            }
        }
    }
}
