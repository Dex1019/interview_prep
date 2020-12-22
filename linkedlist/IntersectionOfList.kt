package linkedlist

fun main() {
    var head1: NewNode? = NewNode(1)
    head1?.next = NewNode(2)
    head1?.next?.next = NewNode(3)
    head1?.next?.next?.next = NewNode(4)
    head1?.next?.next?.next?.next = NewNode(5)
    head1?.next?.next?.next?.next?.next = NewNode(6)

}