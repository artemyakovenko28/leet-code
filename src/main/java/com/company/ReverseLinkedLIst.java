package com.company;

public class ReverseLinkedLIst {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode first = head.next;
        ListNode curr = head;
        while (curr.next.next != null) {
            ListNode newNode = new ListNode(curr.next.val, curr);
            newNode.next = curr;
            first = newNode;
            curr = curr.next;
        }
        return first;
    }
}
