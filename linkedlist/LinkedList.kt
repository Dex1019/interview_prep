package linkedlist

class LinkedList {
    var head: Node? = null
    fun printLinkedList() {
        var node = head
        while (node != null) {
            print(node.data.toString() + " ")
            node = node.next
        }
    }

    fun insertFirst(date: Int) {
        val newNode = Node(date)
        newNode.next = head
        head = newNode
    }

    fun insertAfter(prevNode: Node?, data: Int) {
        if (prevNode == null) return
        val newNode = Node(data)
        newNode.next = prevNode.next
        prevNode.next = newNode
    }

    fun insertLast(data: Int) {
        if (head == null) {
            head = Node(data)
            return
        }
        val newNode = Node(data)
        newNode.next = null
        var last = head
        while (last!!.next != null) {
            last = last.next
        }
        last.next = newNode
    }

    fun insertAtPosition(head: Node?, data: Int, position: Int) {
        val newNode = Node(data)
        var currentNode = head
        var index = 0
        while (index < position - 1) {
            currentNode = currentNode!!.next
            index++
        }
        newNode.next = currentNode!!.next
        currentNode.next = newNode
    }

    fun nodeCount(): Int {
        if (head == null) return -1
        var temp = head
        var index = 0
        while (temp != null) {
            index++
            temp = temp.next
        }
        return index
    }

    fun reverseList(node: Node?): Node? {
        var node = node
        var prev: Node? = null
        var currentNode = node
        var next: Node?
        while (currentNode != null) {
            next = currentNode.next
            currentNode.next = prev
            prev = currentNode
            currentNode = next
        }
        node = prev
        return node
    }

    fun printList() {
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
}