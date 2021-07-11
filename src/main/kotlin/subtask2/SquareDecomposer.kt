package subtask2

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        val square = number.toLong() * number.toLong()
        val list = decomposer(number.toLong(), square)

        return list?.toTypedArray()
    }

    private fun decomposer(number: Long, squareNumber: Long): ArrayList<Int>? {
        if (squareNumber == 0L) return arrayListOf()
        var list: ArrayList<Int>? = null

        for (i in number - 1 downTo 1) {
            val num = squareNumber - i * i
            if (num >= 0) {
                list = decomposer(i, num)
                list?.add(i.toInt())
            }

            if (list != null) {
                return list
            }
        }

        return list
    }
}