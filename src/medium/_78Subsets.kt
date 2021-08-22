package medium

class _78Subsets {
class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result: MutableList<ArrayList<Int>> = ArrayList()
        result.add(arrayListOf())
        for (count in nums.indices) {
            val tempList = ArrayList(result)
            for (i in result.indices) {
                val temp = ArrayList(tempList[i])
                temp.add(nums[count])
                result.add(temp)
            }
//                val size = result.size
//                for (i in 0 until  size) {
//                    val temp = ArrayList(result[i])
//                    temp.add(nums[count])
//                    result.add(temp)
//                }
        }
        return result
    }
}

    class BestSolution {
        fun subsets(nums: IntArray): List<List<Int>> {
            val result = arrayListOf<ArrayList<Int>>()
            result.add(arrayListOf())

            for (i in nums) {
                val c = ArrayList(result)
                val n = c.size
                for (j in 0 until n) {
                    val temp = ArrayList(c[j])
                    temp.add(i)
                    c.add(temp)
                }
                result.clear()
                result.addAll(c)
            }
            return result
        }
    }
}