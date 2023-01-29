package Algorithms.Sort;

public class LLMergeSort {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Linked List MergeSort
     */
    public ListNode mergeSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode left = mergeSortList(head);
        ListNode right = mergeSortList(mid);
        return mergeTwoLists(left, right);
    }

    public ListNode middleNode(ListNode head) {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode head = result;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        result.next = (list1 != null) ? list1 : list2;
        return head.next;
    }

}
