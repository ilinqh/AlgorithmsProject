package easy

class RemoveElementSolution {
    fun removeElement(numArray: IntArray, value: Int): Int {
        if (numArray.isEmpty()) {
            return 0
        }
        var count = 0
        for (i in numArray.indices) {
            if (numArray[i] != value) {
                numArray[count] = numArray[i]
                count++
            }
        }
        return count
    }
}