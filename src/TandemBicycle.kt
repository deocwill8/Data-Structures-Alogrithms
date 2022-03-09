class TandemBicycle {

    companion object {
        fun tandemBicycle(redShirtSpeeds: MutableList<Int>, blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
            redShirtSpeeds.sort()
            blueShirtSpeeds.sort()
            var totalSpeed = 0
            if (fastest) {
                for (idx in 0 until redShirtSpeeds.size) {
                    val blueShirtSpeed = blueShirtSpeeds[(blueShirtSpeeds.size - 1) - idx]
                    val redShirtSpeed = redShirtSpeeds[idx]
                    totalSpeed += maxOf(redShirtSpeed,blueShirtSpeed)
                }
            } else {
                blueShirtSpeeds.sortDescending()
                for (idx in 0 until redShirtSpeeds.size) {
                    val blueShirtSpeed = blueShirtSpeeds[(blueShirtSpeeds.size - 1) - idx]
                    val redShirtSpeed = redShirtSpeeds[idx]
                    totalSpeed += maxOf(redShirtSpeed,blueShirtSpeed)

                }
            }
            println(totalSpeed)
            return totalSpeed
        }

        //TODO find more elegant way to implement code
    }

}

fun main() {
    TandemBicycle.tandemBicycle(mutableListOf(5, 5, 3, 9, 2), mutableListOf(3, 6, 7, 2, 1), true)
}