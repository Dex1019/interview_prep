package linkedlist

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 */

fun main(args: Array<String>) {
    val list = LinkedList()
    list.insertFirst(5)
    list.insertFirst(4)
    list.insertFirst(3)
    list.insertFirst(2)
    list.insertFirst(1)
    println("Original list:")
    list.printList()
    println("\nReverse list:")
    val result = list.reverseList(list.head)
    printList(result)
}

fun printList(head: Node?) {
    var node = head
    while (node != null) {
        if (node.next == null) {
            print(" " + node.data + " -> null")
        } else {
            print(" " + node.data + " ->")
        }
        node = node.next
    }
}