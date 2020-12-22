package linkedlist

fun main() {
    var head: NewNode? = NewNode(1)
    head?.next = NewNode(2)
//    head?.next?.next = NewNode(3)
//    head?.next?.next?.next = NewNode(4)
//    head?.next?.next?.next?.next = NewNode(5)

//    deleteAt(head, 2)
//    deleteNode(head?.next?.next)
    var result = deleteFromLast(head, 1)

//    while (head != null) {
//        print("${head.data} ")
//        head = head.next
//    }
    printLinkList(result)

}

fun deleteNode(head: NewNode?) {
    if (head == null) return
    head.data = head.next?.data!!
    head.next = head.next?.next
}

fun deleteFromLast(head: NewNode?, position: Int): NewNode? {
    var slow = head
    var fast = head

    for (i in 1..position) {
        if (fast?.next == null && i == position) {
            return head?.next
        }
        fast = fast?.next
    }

    while (fast?.next != null) {
        fast = fast.next
        slow = slow?.next
    }
    slow?.next = slow?.next?.next
    return head
}

fun deleteAt(head: NewNode?, position: Int) {
    if (head == null) return
    var temp = head

    // check if delete position in head then change head
    if (position == 0) {
        temp = temp.next
    }

    // traverse till the position to delete
    for (i in 0 until position - 1) {
        temp = temp?.next
    }

    // return if we didn't find the position
    if (temp?.next == null) {
        return
    }

    // point to the next item that has to be deleted
    val next = temp.next?.next
    temp.next = next
}

