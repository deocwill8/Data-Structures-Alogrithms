class NthFibonacci {
    companion object {
        //recursive

        //TODO figure out the cache way of solving it

        //simple
//        fun getNthFib(n: Int): Int {
//           if (n == 2) {
//               return 1
//           } else if (n == 1) {
//               return 0
//           }
//            return  getNthFib(n-1) + getNthFib(n - 2)
//        }

        // iterative
        // TODO write in less lines
        fun getNthFib(n:Int): Int {
            val lastTwo: MutableList<Int> = mutableListOf(0,1)
            var counter: Int = 3
            var nextFib: Int

            while (counter <= n) {
                nextFib = lastTwo[0] + lastTwo[1]
                lastTwo[0] = lastTwo[1]
                lastTwo[1] = nextFib
                counter++
            }
            return when (n) {
                1 -> {
                    println("0")
                    0
                }
                2 -> {
                    println("1")
                    1
                }
                else -> {
                    println(lastTwo[1])
                    lastTwo[1]
                }
            }
        }
    }
}

fun main() {
    NthFibonacci.getNthFib(5)
    //NthFibonacci.getNthFib(22)
}