package easy

class _3274CheckIfTwoChessboardSquaresHaveTheSameColor {
    class Solution {
        fun checkTwoChessboards(coordinate1: String, coordinate2: String): Boolean {
            return ((coordinate1[0] - 'a') + (coordinate1[1] - '0')) % 2 == ((coordinate2[0] - 'a') + (coordinate2[1] - '0')) % 2
        }
    }
}