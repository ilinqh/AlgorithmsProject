package easy

class _412FizzBuzz {
    class Solution {
        fun fizzBuzz(n: Int): List<String> {
            val result = ArrayList<String>()
            for (i in 1..n) {
                if (i % 15 == 0) {
                    result.add("FizzBuzz")
                } else if (i % 5 == 0) {
                    result.add("Buzz")
                } else if (i % 3 == 0) {
                    result.add("Fizz")
                } else {
                    result.add(i.toString())
                }
            }
            return result
        }
    }
}