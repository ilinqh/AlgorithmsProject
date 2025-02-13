package easy

class _1742MaximumNumberOfBallsInABox {
    class Solution {
        fun countBalls(lowLimit: Int, highLimit: Int): Int {
            val map = HashMap<Int, Int>()
            var result = 0
            for (i in lowLimit..highLimit) {
                var box = 0
                var temp = i
                while (temp != 0) {
                    box += temp % 10
                    temp /= 10
                }
                map[box] = map.getOrDefault(box, 0) + 1
                result = Math.max(result, map[box]!!)
            }
            return result
        }
    }
}