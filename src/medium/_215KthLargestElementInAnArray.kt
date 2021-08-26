package medium

class _215KthLargestElementInAnArray {
    // 堆排序可以尽可能的降低时间复杂度
class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        var heapSize = nums.size
        buildMaxHeap(nums, heapSize)
        for (i in (nums.size - 1) downTo (nums.size - k + 1)) {
            swap(nums, 0, i)
            heapSize--
            maxHeapify(nums, 0, heapSize)
        }
        return nums[0]
    }

    private fun buildMaxHeap(a: IntArray, heapSize: Int) {
        for (i in (heapSize / 2) downTo 0) {
            maxHeapify(a, i, heapSize)
        }
    }

    private fun maxHeapify(a: IntArray, i: Int, heapSize: Int) {
        val left = i * 2 + 1
        val right = (i + 1) * 2
        var largest = i
        if (left < heapSize && a[left] > a[largest]) {
            largest = left
        }
        if (right < heapSize && a[right] > a[largest]) {
            largest = right
        }
        if (largest != i) {
            swap(a, largest, i)
            maxHeapify(a, largest, heapSize)
        }
    }

    private fun swap(a: IntArray, i: Int, j: Int) {
        val temp = a[i]
        a[i] = a[j]
        a[j] = temp
    }
}
}