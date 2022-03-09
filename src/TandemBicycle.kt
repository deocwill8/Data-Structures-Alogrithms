class TandemBicycle {

    companion object {

        fun tandemBicycle(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
            redShirtSpeeds.sort()
            blueShirtSpeeds.sort()
            var totalSpeed = 0

            if(!fastest) blueShirtSpeeds.sortDescending()

            for (idx in 0 until redShirtSpeeds.size) {
                val blueShirtSpeed = blueShirtSpeeds[(blueShirtSpeeds.size - 1) - idx]
                val redShirtSpeed = redShirtSpeeds[idx]
                totalSpeed += maxOf(redShirtSpeed,blueShirtSpeed)
            }
            println(totalSpeed)
            return totalSpeed
        }


        // manually reverse list
        fun tandemBicycle2(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
            redShirtSpeeds.sort()
            blueShirtSpeeds.sort()
            var totalSpeed = 0

            if (!fastest) reverseListInOrder(blueShirtSpeeds)

            for (idx in 0 until redShirtSpeeds.size) {
                val blueShirtSpeed = blueShirtSpeeds[(blueShirtSpeeds.size - 1) - idx]
                val redShirtSpeed = redShirtSpeeds[idx]
                totalSpeed += maxOf(redShirtSpeed,blueShirtSpeed)
            }
            println(totalSpeed)
            return totalSpeed
        }

        fun reverseListInOrder(listToReverse: MutableList<Int>): MutableList<Int> {
            var startIdx = 0 //start of the list
            var endIdx = listToReverse.size - 1 // end of the list

            while(startIdx < endIdx) {
                val temp = listToReverse[startIdx]
                // first item in list is set to the last item
                // in the list
                listToReverse[startIdx] = listToReverse[endIdx]
                // last item in list is set to the first item
                // in the list
                listToReverse[endIdx] = temp

                startIdx++ //move start to the right
                endIdx-- // move end to the left
            }
            //println(listToReverse)
            return  listToReverse
        }
    }

}

fun main() {
    TandemBicycle.tandemBicycle(mutableListOf(5, 5, 3, 9, 2), mutableListOf(3, 6, 7, 2, 1), true)
    //TandemBicycle.reverseListInOrder(mutableListOf(3, 6, 7, 2, 1)) // 1,2,7,6,3
    //TandemBicycle.tandemBicycle2(mutableListOf(5, 5, 3, 9, 2), mutableListOf(3, 6, 7, 2, 1), false)
}