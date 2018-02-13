/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 * 设置两个指针,一个快一个慢,可以快得多走2步,由于速度有差异且有环的情况下,快的先进入环并最终追上慢的,可以进行判断。
 * 如果没有环,那么快的会先遍历完链表到null,返回true
 * @NogizakaZ
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast, slow;
        fast = slow = head;
        if (fast == null) {
            return false;
        }
        fast = fast.next;
        while (fast != slow) {

            if (fast != null) {
                fast = fast.next;
                if (fast != null)
                    fast = fast.next;
                else
                    return false;
            } else {
                return false;
            }

            slow = slow.next;
        }
        return true;
    }

}
