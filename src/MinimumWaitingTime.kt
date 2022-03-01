class MinimumWaitingTime {

    fun minimumWaitingTime(queries: MutableList<Int>): Int {
        queries.sort()
        var minWaitTime = 0
        // keep looping until you hit the end of the collection
        for (query in 0 until queries.size) {
            val itemsLeft = (queries.size -1) - query
            val currentQueryTime = queries[query]
            //println(queries[query]) //value
            //println(query) // index
            println("There are $itemsLeft items left and current query time is: $currentQueryTime" )
            minWaitTime += (itemsLeft * currentQueryTime)
        }
        println(minWaitTime)
        return minWaitTime
    }
}

fun main() {
    MinimumWaitingTime().minimumWaitingTime(mutableListOf(5,1,4))
}