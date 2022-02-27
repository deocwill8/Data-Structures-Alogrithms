//https://www.youtube.com/watch?v=BHB0B1jFKQc
open class BinaryTree(var value: Int) {
    var left: BinaryTree? = null
    var right: BinaryTree? = null


     companion object {
         @JvmStatic
        fun preOrder(node: BinaryTree?) {
             if(node == null) return
             println("Visted node with value: " + node.value.toString())

             preOrder(node.left)
             preOrder(node.right)

        }

         @JvmStatic
         fun inOrder(node: BinaryTree?) {
             if(node == null) return

             inOrder(node.left)
             println("Visted node with value: " + node.value.toString())
             inOrder(node.right)
         }

         @JvmStatic
         fun postOrder(node: BinaryTree?) {
             if(node == null) return

             postOrder(node.left)
             postOrder(node.right)
             println("Visted node with value: " + node.value.toString())
         }

         // do this iteratively with a "stack"
    }
}

fun main() {
//region tree
    val ten = BinaryTree(10)
    val seven = BinaryTree(7)
    val six = BinaryTree(6)
    val eight = BinaryTree(8)
    val one = BinaryTree(1)
    val nine = BinaryTree(9)
    val eleven = BinaryTree(11)
    val twenty = BinaryTree(20)
    val fourteen = BinaryTree(14)
    val twentyTwo = BinaryTree(22)

    ten.left = seven
    ten.right = eleven

    seven.left = six
    seven.right = eight

    six.left = one

    eight.right = nine

    eleven.right = twenty

    twenty.left = fourteen
    twenty.right = twentyTwo
//endregion
    BinaryTree.preOrder(ten)
    //BinaryTree.inOrder(ten)
    //BinaryTree.postOrder(ten)
}


