package ExtraQuestions;

class leetCode142 {
    // ? https://leetcode.com/problems/linked-list-cycle-ii/

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // 1. find the length.
                ListNode temp = slow;
                length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;
        // 2. move one point till the length position from start.
        while (length > 0) {
            s = s.next;
            length--;
        }

        // 3. keep moving both forward and they will meet at cycle start 
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }
}