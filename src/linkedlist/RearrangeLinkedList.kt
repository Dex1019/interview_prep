package linkedlist

fun main() {
    var head: NewNode? = NewNode(2)
    head?.next = NewNode(4)
    head?.next?.next = NewNode(6)
    head?.next?.next?.next = NewNode(8)
    head?.next?.next?.next?.next = NewNode(10)
    head?.next?.next?.next?.next?.next = NewNode(12)
    rearrangeList(head)

    while (head != null) {
        print("${head.data} ")
        head = head.next
    }
}

fun rearrangeList(head: NewNode?) {
    if (head?.next == null) return

    // find middle element
    var slow = head
    var fast = head
    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }


    var headSecondHalf = reverse1(slow)
    var headFirstHalf = head

    while (headFirstHalf != null && headSecondHalf != null) {
        var temp = headFirstHalf.next
        headFirstHalf.next = headSecondHalf
        headFirstHalf = temp

        temp = headSecondHalf.next
        headSecondHalf.next = headFirstHalf
        headSecondHalf = temp
    }

    if (headFirstHalf != null) {
        headFirstHalf.next = null
    }
}

fun reverse1(head: NewNode?): NewNode? {
    var prev: NewNode? = null
    var tempHead = head
    while (tempHead != null) {
        val next = tempHead.next
        tempHead.next = prev
        prev = tempHead
        tempHead = next
    }
    return prev
}