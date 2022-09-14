package com.company;

public class MergeTwoSortedLists {

    public static class ListNode {
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0, null);
        ListNode tail = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                tail.next = l1;
            } else {
                tail.next = l2;
            }
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            head.next = l1;
        } else {
            head.next = l2;
        }
        return head.next;
    }
}
