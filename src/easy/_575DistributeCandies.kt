package easy

class _575DistributeCandies {
    class Solution {
        fun distributeCandies(candyType: IntArray): Int {
            val set = HashSet<Int>()
            for (type in candyType) {
                set.add(type)
            }
            return Math.min(set.size, candyType.size / 2)
        }
    }
}