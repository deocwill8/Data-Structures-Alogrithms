class NthFibonacci {
    companion object {
        //recursive
        fun getNthFib(n: Int): Int {
            //n is the index <n, value>
            val memomize = mutableMapOf<Int,Int>()
            //region setup
            memomize[1] = 0
            memomize[2] = 1
//            memomize[3] = 1
//            memomize[4] = 2
//            memomize[5] = 3
//            memomize[6] = 5
//            memomize[7] = 8
            //endregion

            if (memomize.containsKey(n)) {
                //println(memomize[n])
                println("found it!")
            } else {
                memomize.put(n, getNthFib(n-1) + getNthFib(n-2))
                //println(getNthFib(n-1) + getNthFib(n-2))
                println(memomize.get(n))
            }
            return -1
        }
        //iterative
    }
}

fun main() {
    NthFibonacci.getNthFib(6)
    //NthFibonacci.getNthFib(22)
}