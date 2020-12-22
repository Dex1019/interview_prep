package linkedlist

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */

fun main() {
    val head1 = NewNode(2)
    val head2 = NewNode(1)
    var newList: NewNode? = mergeList(head1, head2)
    while (newList != null) {
        print("${newList.data} ")
        newList = newList.next
    }
}

fun mergeList(l1: NewNode?, l2: NewNode?): NewNode? {
    var r1 = l1
    var r2 = l2
    val ll = NewNode(0)
    var rr = ll
    while (true) {
        if (r1 == null && r2 == null) {
            break
        }
        if (r1 == null) {
            rr.next = r2
            break
        }
        if (r2 == null) {
            rr.next = r1
            break
        }
        if (r1.data <= r2.data) {
            rr.next = r1
            r1 = r1.next
        } else {
            rr.next = r2
            r2 = r2.next
        }
        rr = rr.next!!
    }
    return ll.next
}