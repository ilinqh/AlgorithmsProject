class ListNode {
    var `val` = 0
    var next: ListNode? = null

    constructor(`val`: Int) {
        this.`val` = `val`
    }

    constructor(`val`: Int, next: ListNode?) {
        this.`val` = `val`
        this.next = next
    }
}

fun arrayToListNode(intArray: IntArray): ListNode? {
    val preHead = ListNode(-1)
    var prev = preHead
    intArray.forEach {
        prev.next = ListNode(it)
        prev = prev.next!!
    }
    return preHead.next
}

fun listNodeToArray(tempList: ListNode?): IntArray {
    val intArray = ArrayList<Int>()
    var listNode = tempList
    while (listNode != null) {
        intArray.add(listNode.`val`)
        listNode = listNode.next
    }
    return intArray.toIntArray()
}