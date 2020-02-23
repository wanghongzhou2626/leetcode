package leetcode345;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.javafx.geom.Edge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;


/**
 * 345. Reverse Vowels of a String (Easy)
 *
 * Leetcode / 力扣
 *
 * Given s = "leetcode", return "leotcede".
 *
 * 使用双指针，一个指针从头向尾遍历，一个指针从尾到头遍历，当两个指针都遍历到元音字符时，交换这两个元音字符。
 * 为了快速判断一个字符是不是元音字符，我们将全部元音字符添加到集合 HashSet 中，从而以 O(1) 的时间复杂度进行该操作。
 *
 * 时间复杂度为 O(N)：只需要遍历所有元素一次
 * 空间复杂度 O(1)：只需要使用两个额外变量
 */
public class Solution {

    private final HashSet<Character> hashSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    /**
     * 主要思想使用 双指针进行收尾检测
     * 建立新数组接收调整后的数据
     * @param s
     * @return
     */

    public String reverseVowels(String s) {
         int i = 0;
         int j = s.length()-1;
         //用于返回结果的数组
         char[] result = new char[s.length()];
         while (i <= j) {
             //按照索引取出对应位置上的值
             char ci = s.charAt(i);
             char cj = s.charAt(j);
             //取出的数值不包含原音直接复制给新数组
             if (!hashSet.contains(ci)) {
                 result[i++] = ci;
             } else if (!hashSet.contains(cj)) {
                 result[j--] = cj;
             } else {
             //如果发现原音字母进行交换
                 result[i++] = cj;
                 result[j--] = ci;
             }
         }
         return new String(result);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.reverseVowels("leetcode");
        System.out.println(s);
    }
}
