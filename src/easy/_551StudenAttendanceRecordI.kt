package easy

class _551StudenAttendanceRecordI {
    class Solution {
        fun checkRecord(s: String): Boolean {
            var absentCount = 0
            var lateCount = 0
            for (char in s) {
                if (char == 'A') {
                    absentCount++
                    if (absentCount == 2) {
                        return false
                    }
                }
                if (char == 'L') {
                    lateCount++
                    if (lateCount == 3) {
                        return false
                    }
                } else {
                    lateCount = 0
                }
            }
            return true
        }
    }
}