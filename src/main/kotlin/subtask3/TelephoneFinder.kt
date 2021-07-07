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
            when(number[j]) {
                '1' -> {
                    arrayList.add(number.replace(number[j], '2'))
                    arrayList.add(number.replace(number[j], '4'))
                }
                '2' -> {
                    arrayList.add(number.replace(number[j], '1'))
                    arrayList.add(number.replace(number[j], '3'))
                    arrayList.add(number.replace(number[j], '5'))
                }
                '3' -> {
                    arrayList.add(number.replace(number[j], '2'))
                    arrayList.add(number.replace(number[j], '6'))
                }
                '4' -> {
                    arrayList.add(number.replace( number[j], '1'))
                    arrayList.add(number.replace(number[j], '5'))
                    arrayList.add(number.replace(number[j], '7'))
                }
                '5' -> {
                    arrayList.add(number.replace(number[j], '2'))
                    arrayList.add(number.replace(number[j], '4'))
                    arrayList.add(number.replace(number[j], '6'))
                    arrayList.add(number.replace(number[j], '8'))
                }
                '6' -> {
                    arrayList.add(number.replace(number[j], '3'))
                    arrayList.add(number.replace(number[j], '5'))
                    arrayList.add(number.replace(number[j], '9'))
                }
                '7' -> {
                    arrayList.add(number.replace(number[j], '4'))
                    arrayList.add(number.replace(number[j], '8'))
                }
                '8' -> {
                    arrayList.add(number.replace(number[j], '5'))
                    arrayList.add(number.replace(number[j], '7'))
                    arrayList.add(number.replace(number[j], '9'))
                    arrayList.add(number.replace(number[j], '0'))
                }
                '9' -> {
                    arrayList.add(number.replace(number[j], '6'))
                    arrayList.add(number.replace(number[j], '8'))
                }
                '0' -> {
                    arrayList.add(number.replace(number[j], '8'))
                }
            }
        }
        return arrayList
    }
}