package easy

class TwoSumSolution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (index in numbers.indices) {
            val temp = target - numbers[index]
            if (map.containsKey(temp) && map[temp] != index) {
                return intArrayOf(index, map[temp]!!)
            }
            map[numbers[index]] = index
        }
        return intArrayOf(0, 0)
    }
}

// best solution

class TwoSumBestSolution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map: MutableMap<Int, Int?> = HashMap()
        for (i in numbers.indices) {
            val temp = target - numbers[i]//获取差值
            if (map.containsKey(temp) && map[temp] != i) {
                return intArrayOf(i, map[temp]!!)
            }
            map[numbers[i]] = i
        }
        return intArrayOf(0, 0)
    }
}