package linkedlist

/**
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 */

fun main() {
//    val head = NewNode(1)
//    head.next = NewNode(2)
//    head.next?.next = NewNode(2)
//    head.next?.next?.next = NewNode(1)
//
//    println(isPalindrome(head))


    val head = NewNode(1)
    head.next = NewNode(0)
    head.next?.next = NewNode(1)
    println(getDecimalValue(head))


}

fun getDecimalValue(head: NewNode?): Int {
    if (head == null) return 0
    var node = head
    var num = head.data
    while (node?.next != null) {
        node = node.next
        num = (num * 2) + (node?.data ?: 0)
    }
    return num
}


fun isPalindrome(head: NewNode?): Boolean {
    if (head == null) return true

    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    var tempHead = head
    var nextHalf = reverse(slow)
    var copyNextHalf = nextHalf

    while (tempHead != null && nextHalf != null) {
        if (tempHead.data != nextHalf.data) break
        tempHead = tempHead.next
        nextHalf = nextHalf.next
    }
    reverse(copyNextHalf)
    if (tempHead == null || nextHalf == null) {
        return true
    }
    return false
}

fun reverse(head: NewNode?): NewNode? {
    var prev: NewNode? = null
    var tempHead = head
    while (tempHead != null) {
        var next = tempHead.next
        tempHead.next = prev
        prev = tempHead
        tempHead = next
    }
    return prev
}