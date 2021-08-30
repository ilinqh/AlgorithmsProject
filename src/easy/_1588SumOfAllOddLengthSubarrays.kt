package easy

class _1588SumOfAllOddLengthSubarrays {
    class Solution {
        fun sumOddLengthSubarrays(arr: IntArray): Int {
            var answer = 0
            val length = arr.size
            for (i in arr.indices) {
                answer += arr[i]
                var step = 2
                while ((i + step) < length) {
                    for (j in i..(i + step)) {
                        answer += arr[j]
                    }
                    step += 2
                }
            }
            return answer
        }
    }

    class BestSolution {
        fun sumOddLengthSubarrays(arr: IntArray): Int {
            var answer = 0
            val length = arr.size
            for (i in arr.indices) {
                val rightCount = length - i - 1
                val leftOdd = (i + 1) / 2
                val rightOdd = (rightCount + 1) / 2
                val leftEven = i / 2 + 1
                val rightEven = rightCount / 2 + 1
                answer += arr[i] * (leftOdd * rightOdd + leftEven * rightEven)
            }
            return answer
        }
    }
}