package easy

class _2739TotalDistanceTraveled {
    class Solution {
        fun distanceTraveled(mainTank: Int, additionalTank: Int): Int {
            var result = 0
            var tank = mainTank
            var tempTank = additionalTank
            while (tank >= 5) {
                result += 50
                tank -= 5
                if (tempTank > 0) {
                    tank += 1
                    tempTank -= 1
                }
            }
            return result + tank * 10
        }
    }
}