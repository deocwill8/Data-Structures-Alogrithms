class Node(name: String, children:MutableList<Node>?) {
    val name: String = name
    var children = children ?: mutableListOf()

    private fun depthFirstSearch(childList: MutableList<String>): List<String> {
        childList.add(this.name)
        for (child in this.children) {
            child.depthFirstSearch(childList)
        }

        // the list is never being overridden
        // so it is adding children
        // to the end of the list
        return childList
    }

    fun depthFirstSearch(): List<String> {
        println(depthFirstSearch(mutableListOf()))
        return depthFirstSearch(mutableListOf())
    }
}
fun main() {
    //region nodes
    val c = Node("c", null)
    val e = Node("e", null)
    val h = Node("h", null)
    val i = Node("i", null)
    val j = Node("j", null)
    val k = Node("k", null)
    val g = Node("g", mutableListOf(k))
    val d = Node("d", mutableListOf(g, h))
    val f = Node("f", mutableListOf(i,j))
    val b = Node("b", mutableListOf(e,f))
    val a = Node("a",  mutableListOf(b,c,d))
    //endregion
    Node(a.name, a.children).depthFirstSearch()
}