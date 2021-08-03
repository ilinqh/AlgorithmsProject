package easy

class _27RemoveElement {
    class Solution {
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

    // Best
    class BestøSolution {
        fun removeElement(array: IntArray, element: Int): Int {
            if (array.size == 1) {
                return if (array[0] == element) 0 else 1
            }
            var after = array.size - 1
            var before = 0
            var size = array.size

            while (before <= after) {
                // 先检查最后的元素
                if (array[after] == element) {
                    --after
                    --size
                    continue
                }

                // 如果为关键元素则放置最后
                if (array[before] == element) {
                    array[before] = array[after]
                    array[after] = element
                    --after
                    --size
                }
                ++before
            }
            return size
        }
    }
}
