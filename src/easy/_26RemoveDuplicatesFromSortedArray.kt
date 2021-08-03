package easy

class RemoveDuplicatesFromSortedArraySolution {
    fun removeDuplicates(numArray: IntArray): Int {
        if (numArray.isEmpty()) {
            return 0
        }
        var count = 1
        var currentInt = numArray[0]
        for (index in numArray.indices) {
            if (numArray[index] > currentInt) {
                currentInt = numArray[index]
                numArray[count] = currentInt
                count++
            }
        }
        return count
    }
}