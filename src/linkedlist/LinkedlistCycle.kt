package linkedlist

/**
 * 141. Linked List Cycle
 * https://leetcode.com/problems/linked-list-cycle/
 */

class NewNode constructor(var data: Int) {
    var next: NewNode? = null
}

fun main() {
    val head = NewNode(1)
    head.next = NewNode(2)
    head.next?.next = NewNode(3)
    head.next?.next?.next = NewNode(4)
    head.next?.next?.next?.next = NewNode(5)
    head.next?.next?.next?.next?.next = NewNode(6)
    head.next?.next?.next?.next?.next?.next = head.next?.next

    print(hasCycle(head))
//    printLinkedList(head)
}

private fun printLinkedList(head: NewNode) {
    var temp = head
    while (temp != null) {
        if (temp.next == null) {
            print(" " + temp.data + " -> null")
        } else {
            print(" " + temp.data + " ->")
        }
        if (temp.next == null) {
            break
        } else {
            temp = temp.next!!
        }
    }
}

fun hasCycle(head: NewNode?): Boolean {
    var slow = head
    var fast = head
    while (fast?.next != null) {
        fast = fast.next?.next
        slow = slow?.next
        if (slow == fast) {
            return true
        }
    }
    return false
}
