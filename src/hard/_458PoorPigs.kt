package hard

class _458PoorPigs {
    class Solution {
        /**
         * CV
         */
        fun poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int {
            val states = minutesToTest / minutesToDie + 1
            return Math.ceil(Math.log(buckets.toDouble()) / Math.log(states.toDouble())).toInt()
        }
    }
}