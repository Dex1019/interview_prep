package linkedlist

fun main(args: Array<String>) {
    val list = LinkedList()
    // insert first
    list.insertFirst(4)
    list.insertFirst(3)
    list.insertFirst(2)
    list.insertFirst(1)

    // insert after
    list.insertAfter(list.head?.next!!.next, 9)

    // insert last
    list.insertLast(10)

    // insert at position
    list.insertAtPosition(list.head, 100, -1)
    println("\nCreated Linked list is: ")
    list.printList()
}