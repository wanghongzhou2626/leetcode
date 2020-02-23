package leetcode141;

import java.util.HashSet;

public class Solution1 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    /**
     * 把链表放入哈希表中  如果当前节点为空节点 说明已经检测到链表的尾部
     * 那么我们已经遍历完整个链表了 并且链表并不是有环的
     * 如果当前节点的引用已经存入了哈希表 就说明当前的链表为环状
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();

        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            } else {
                hashSet.add(head);
            }
        }
        return false;

    }
}
