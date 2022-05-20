class ProductSum {

    companion object {
        fun productSum(array: List<*>): Int {
            var sum = 0
            var depth = 1
            for(item in array) {
                when (item) {
                    is Int -> {
                        sum += item
                        //println("Integer is $item")
                    }
                    is List<*> -> {
                        sum += productSum(item)
                        //productSum(item, depth)
                        //println("List is $item")
                    }
                    else -> println("item not recognized")
                }
            }
            println("Sum is $sum")
            return -1
        }

//        fun productSum(array: List<*>, depth: Int): Int {
//            val sum = 0
//            val depth = 1
//            for(item in array) {
//                println("The number $item was printed from the given list")
//            }
//            return -1
//        }
    }
}

fun main()  {
    val listOne = listOf(5, 2, listOf(7,-1), 3, listOf(6, listOf(-13, 8), 4))
    ProductSum.productSum(listOne)
}