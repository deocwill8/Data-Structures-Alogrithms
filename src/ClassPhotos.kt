class ClassPhotos {

    companion object{
        fun classPhotos(redShirtHeights: MutableList<Int>, blueShirtHeights: MutableList<Int>): Boolean {
            redShirtHeights.sortDescending()
            blueShirtHeights.sortDescending()

            val tallestPersonShirtColor: String = if (redShirtHeights[0] > blueShirtHeights[0]) "RED" else "BLUE"

            for (idx in 0 until blueShirtHeights.size) {
                println(idx)
                if (tallestPersonShirtColor == "BLUE") {
                    if (redShirtHeights[idx] >= blueShirtHeights[idx]) {
                        println("false")
                        return false
                    }
                }
                if (tallestPersonShirtColor == "RED") {
                    if (blueShirtHeights[idx] >= redShirtHeights[idx]) {
                        println("false")
                        return false
                    }
                }
            }
            //println(tallestPersonShirtColor)
            // compare items in both array
            // if on item is greater than the other
            // then it goes in back,
            // if all the items in one array are greater than the other
            // then we can have a class photo
            // Write your code here.
            println("true")
            return true
        }
    }

}

fun main() {
    ClassPhotos.classPhotos(mutableListOf(5, 8, 1, 3, 4), mutableListOf(6, 9, 2, 4, 5))
}