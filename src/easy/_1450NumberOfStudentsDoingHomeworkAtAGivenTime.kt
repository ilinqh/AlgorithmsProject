package easy

class _1450NumberOfStudentsDoingHomeworkAtAGivenTime {
    class Solution {
        fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
            var result = 0
            for (i in startTime.indices) {
                if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                    result = result.inc()
                }
            }
            return result
        }
    }
}