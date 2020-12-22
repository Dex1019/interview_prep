package linkedlist


fun main() {
    var head: NewNode? = NewNode(1)
    head?.next = NewNode(2)
    head?.next?.next = NewNode(3)
    head?.next?.next?.next = NewNode(4)
    head?.next?.next?.next?.next = NewNode(5)
    head?.next?.next?.next?.next?.next = NewNode(6)
    val resutl = rotateLinkedList(head, 3)
    printLinkList(resutl)

//    while (head != null) {
//        if (head.next == null) {
//            print("${head.data} ")
//        } else {
//            print("${head.data}->")
//        }
//        head = head.next
//    }
}

fun printLinkList(head: NewNode?) {
    var tempHead = head
    while (tempHead != null) {
        if (tempHead.next == null) {
            print("${tempHead.data} ")
        } else {
            print("${tempHead.data}->")
        }
        tempHead = tempHead.next
    }
}

fun rotateLinkedList(head: NewNode?, rotation: Int): NewNode? {
    if (head?.next == null || rotation <= 0) return head
    var tempHead = head
    var lastNode = head
    var length = 1
    while (lastNode?.next != null) {
        lastNode = lastNode.next
        length++
    }

    lastNode?.next = tempHead // circular linked list
    var rotate = rotation
    rotate %= length
    var skipLength = length - rotate

    var lastNodeOfRotatedList = tempHead
//    println("before rotate: ${lastNodeOfRotatedList.data}")
    for (i in 0 until skipLength - 1) {
        lastNodeOfRotatedList = lastNodeOfRotatedList?.next
//        println("after rotate: ${lastNodeOfRotatedList?.data}")
    }

    tempHead = lastNodeOfRotatedList?.next
    lastNodeOfRotatedList?.next = null
    return tempHead
}

