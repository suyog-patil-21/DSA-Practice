package ExtraQuestions;

class leetCode976 {
    // ? https://leetcode.com/problems/middle-of-the-linked-list

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode middleNodeMethod2(ListNode head) {
        ListNode slow = null;
        while (head != null && head.next != null) {
            slow = (slow == null) ? head : slow.next;
            head = head.next.next;
        }
        ListNode mid = slow.next;
        // this made null because it might merge sort will give StackOverFlow Error
        slow.next = null;
        return mid;
    }

    /** this method takes more space compare to method 2 */
    public ListNode middleNodeMethod1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}