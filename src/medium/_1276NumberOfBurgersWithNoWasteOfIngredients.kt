package medium

class _1276NumberOfBurgersWithNoWasteOfIngredients {
    class Solution {
        fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> {
            if (tomatoSlices % 2 != 0 || tomatoSlices < cheeseSlices * 2) {
                return emptyList()
            }
            val jumbo = (tomatoSlices - cheeseSlices * 2) / 2
            val small = cheeseSlices - jumbo
            return if (small < 0) {
                emptyList()
            } else {
                listOf(jumbo, small)
            }
        }
    }
}