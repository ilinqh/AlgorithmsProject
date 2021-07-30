package easy

class PalindromeNumberSolution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        val temp = x.toString()
        for (index in 0 until temp.length / 2) {
            if (temp[index] != temp[temp.length - index - 1]) {
                return false
            }
        }

        return true
    }
}

class SecondSolution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        var temp = x
        var answer = 0
        while (temp != 0) {
            val pop = temp % 10
            answer = answer * 10 + pop
            temp /= 10
        }

        return answer == x
    }
}

// best solution
class PalindromeNumberBestSolution {
    fun isPalindrome(x: Int): Boolean {
        if(x<0){
            return false
        }

        var temp = x
        var answer = 0
        while (temp != 0) {
            var pop = temp % 10
            answer = answer * 10 + pop
            temp /= 10
        }

        if (answer == x) {
            return true
        }
        return false
    }
}