package easy

class _2678NumberOfSeniorCitizens {
    class Solution {
        fun countSeniors(details: Array<String>): Int {
            var result = 0
            for (detail in details) {
                val strAge = detail.subSequence(11, 13)
                var age = 0
                for (i in strAge) {
                    age *= 10
                    age += i - '0'
                }
                if (age > 60) {
                    result += 1
                }
            }
            return result
        }
    }
}