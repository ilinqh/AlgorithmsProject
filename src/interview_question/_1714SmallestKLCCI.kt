package interview_question

import java.util.*

class _1714SmallestKLCCI {
    class Solution {
        fun smallestK(arr: IntArray, k: Int): IntArray {
            if (k == 0) {
                return IntArray(0)
            }
            val maxHeap = PriorityQueue<Int>(k) { a, b -> b - a }
            for (i in arr.indices) {
                if (maxHeap.size == k) {
                    val max = maxHeap.peek()
                    if (arr[i] < max) {
                        maxHeap.poll()
                        maxHeap.add(arr[i])
                    }
                } else {
                    maxHeap.add(arr[i])
                }
            }
            return maxHeap.toIntArray()
        }
    }

    class BestSolution {
        fun smallestK(arr: IntArray, k: Int): IntArray {
            randomizedSelected(arr, 0, arr.size - 1, k)
            val vec = IntArray(k)
            for (i in 0 until k) {
                vec[i] = arr[i]
            }
            return vec
        }

        private fun randomizedSelected(arr: IntArray, left: Int, right: Int, k: Int) {
            if (left > right) {
                return
            }
            val position = randomizedPartition(arr, left, right)
            val num = position - left + 1
            if (k == num) {
                return
            } else if (k < num) {
                randomizedSelected(arr, left, position - 1, k)
            } else {
                randomizedSelected(arr, position + 1, right, k - num)
            }
        }

        private fun randomizedPartition(nums: IntArray, left: Int, right: Int): Int {
            val i = Random().nextInt(right - left + 1) + left
            swap(nums, right, i)
            return partition(nums, left, right)
        }

        private fun partition(nums: IntArray, left: Int, right: Int): Int {
            val pivot = nums[right]
            var i = left - 1
            var j = left
            while (j <= right - 1) {
                if (nums[j] <= pivot) {
                    i += 1
                    swap(nums, i, j)
                }
                j++
            }
            swap(nums, i + 1, right)
            return i + 1
        }

        private fun swap(nums: IntArray, i: Int, j: Int) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        }
    }
}