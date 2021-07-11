package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val a = array[0].toLong()
        val b = array[1].toLong()
        for (i in 1..b) {
            if (a == (factorial(b)/(factorial(i)*factorial(b-i)))) {
                return i.toInt()
            }
        }
        return null
    }

    private fun factorial(int: Long): Long {
        var f = 1L
        for (i in 1..int) {
            f *= i
        }
        return f
    }
}