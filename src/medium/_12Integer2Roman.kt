package medium

class _12Integer2Roman {
    class Solution {
        var thousands = arrayOf("", "M", "MM", "MMM")
        var hundreds = arrayOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
        var tens = arrayOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
        var ones = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
        fun intToRoman(num: Int): String {
            val roman = StringBuffer()
            roman.append(thousands[num / 1000])
            roman.append(hundreds[num % 1000 / 100])
            roman.append(tens[num % 100 / 10])
            roman.append(ones[num % 10])
            return roman.toString()
        }
    }
}