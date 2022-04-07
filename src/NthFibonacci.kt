class NthFibonacci {
    companion object {
        //recursive
//        fun updateCache(cache: MutableMap<Int, Int>) {
//            cache.put(1,0)
//            cache.put(2,1)
//        }
        //simple
        fun getNthFib(n: Int): Int {
           if (n == 2) {
               return 1
           } else if (n == 1) {
               return 0
           }
            return  getNthFib(n-1) + getNthFib(n - 2)
        }
    }
}

fun main() {
    NthFibonacci.getNthFib(6)
    //NthFibonacci.getNthFib(22)
}