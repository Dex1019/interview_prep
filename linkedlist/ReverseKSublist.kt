package linkedlist

fun main() {
    var head: NewNode? = NewNode(1)
    head?.next = NewNode(2)
    head?.next?.next = NewNode(3)
    head?.next?.next?.next = NewNode(4)
    head?.next?.next?.next?.next = NewNode(5)
    head?.next?.next?.next?.next?.next = NewNode(6)

    while (head != null) {
        if (head.next == null) {
            print("${head.data} ")
        } else {
            print("${head.data}->")
        }
        head = head.next
    }
}