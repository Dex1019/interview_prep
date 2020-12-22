package linkedlist

fun main(args: Array<String>) {
    val list = LinkedList()
    list.insertFirst(5)
    list.insertFirst(4)
    list.insertFirst(3)
    list.insertFirst(2)
    list.insertFirst(1)
    list.printList()
    println("Total nodes: ${nodeCount(list.head)}")
}

private fun nodeCount(head: Node?): Int {
    if (head == null) return -1
    var temp = head
    var index = 0
    while (temp != null) {
        index++
        temp = temp.next
    }
    return index
}
