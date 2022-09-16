package com.company

import spock.lang.Specification

class MergeTwoSortedListsTest extends Specification {

    private final MergeTwoSortedLists s = new MergeTwoSortedLists()

    def "MergeTwoLists"() {
        given:
        def l1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(3, null)))
        def l2 = new ListNode(1,
                new ListNode(3,
                        new ListNode(4, null)))
//        def res = new MergeTwoSortedLists.ListNode(1,
//                new MergeTwoSortedLists.ListNode(1,
//                        new MergeTwoSortedLists.ListNode(2,
//                        new MergeTwoSortedLists.ListNode(3,))))

        expect:
        true
        ListNode result = s.mergeTwoLists(l1, l2)
        println result
    }
}
