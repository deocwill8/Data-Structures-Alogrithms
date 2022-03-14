class RemoveDupsFromLinkedList {

    open class LinkedListFoo(value: Int) {
        var value = value
        var next: LinkedListFoo? = null
    }

    companion object {
        fun removeDuplicatesFromLinkedList(linkedList: LinkedListFoo): LinkedListFoo {
            var currentNode: LinkedListFoo? = linkedList
            var nextDistinctNode: LinkedListFoo?

            while(currentNode != null) {
                //println(currentNode.value)
                nextDistinctNode = currentNode.next
                //check if nextDistinctNode is not null
                //check if the currentNode.value and
                //nextDistinctNode.value match
                //every time the values match we change the next distinct node
                //moving down the list
                while (nextDistinctNode != null && nextDistinctNode.value == currentNode.value) {
                    //if we not null and both values match
                    //continue the loop
                    nextDistinctNode = nextDistinctNode.next
                }
                //we found a node whose value does
                //not match the current nodes value
                //remove all the nodes that did match
                //by removing the pointer to them
                currentNode.next = nextDistinctNode // next distinct number in the list
                currentNode = nextDistinctNode // change the current node
            }
            println(linkedList.value)
            println(linkedList.next?.value)
            return linkedList
        }
    }
}

fun main() {
    //region nodes in linked list
    val node1 = RemoveDupsFromLinkedList.LinkedListFoo(1)
    val node2 = RemoveDupsFromLinkedList.LinkedListFoo(1)
    val node3 = RemoveDupsFromLinkedList.LinkedListFoo(3)
    val node4 = RemoveDupsFromLinkedList.LinkedListFoo(4)
    val node5 = RemoveDupsFromLinkedList.LinkedListFoo(4)
    val node6 = RemoveDupsFromLinkedList.LinkedListFoo(4)
    val node7 = RemoveDupsFromLinkedList.LinkedListFoo(5)
    val node8 = RemoveDupsFromLinkedList.LinkedListFoo(6)
    val node9 = RemoveDupsFromLinkedList.LinkedListFoo(6)
   //endregion

    //region node relationships
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    node5.next = node6
    node6.next = node7
    node7.next = node8
    node8.next = node9
    node9.next = null
    //endregion

    RemoveDupsFromLinkedList.removeDuplicatesFromLinkedList(node1)
}