package subtask3

import java.util.ArrayList

class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): ArrayList<String?>? {
        if (number.toInt() < 0) {
            return null
        }
        val arrayList = ArrayList<String?>()
        for (j in number.indices) {
            when {
                number[j] == '1' -> {
                    arrayList.add(number.replaceRange(j..j, "2"))
                    arrayList.add(number.replaceRange(j..j, "4"))
                }
                number[j] == '2' -> {
                    arrayList.add(number.replaceRange(j..j, "1"))
                    arrayList.add(number.replaceRange(j..j, "3"))
                    arrayList.add(number.replaceRange(j..j, "5"))
                }
                number[j] == '3' -> {
                    arrayList.add(number.replaceRange(j..j, "2"))
                    arrayList.add(number.replaceRange(j..j, "6"))
                }
                number[j] == '4' -> {
                    arrayList.add(number.replaceRange(j..j, "1"))
                    arrayList.add(number.replaceRange(j..j, "5"))
                    arrayList.add(number.replaceRange(j..j, "7"))
                }
                number[j] == '5' -> {
                    arrayList.add(number.replaceRange(j..j, "2"))
                    arrayList.add(number.replaceRange(j..j, "4"))
                    arrayList.add(number.replaceRange(j..j, "6"))
                    arrayList.add(number.replaceRange(j..j, "8"))
                }
                number[j] == '6' -> {
                    arrayList.add(number.replaceRange(j..j, "3"))
                    arrayList.add(number.replaceRange(j..j, "5"))
                    arrayList.add(number.replaceRange(j..j, "9"))
                }
                number[j] == '7' -> {
                    arrayList.add(number.replaceRange(j..j, "4"))
                    arrayList.add(number.replaceRange(j..j, "8"))
                }
                number[j] == '8' -> {
                    arrayList.add(number.replaceRange(j..j, "5"))
                    arrayList.add(number.replaceRange(j..j, "7"))
                    arrayList.add(number.replaceRange(j..j, "9"))
                    arrayList.add(number.replaceRange(j..j, "0"))
                }
                number[j] == '9' -> {
                    arrayList.add(number.replaceRange(j..j, "6"))
                    arrayList.add(number.replaceRange(j..j, "8"))
                }
                number[j] == '0' -> {
                    arrayList.add(number.replaceRange(j..j, "8"))
                }
            }
        }
        return arrayList
    }
}
