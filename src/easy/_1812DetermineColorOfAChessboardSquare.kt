package easy

class _1812DetermineColorOfAChessboardSquare {
    class Solution {
        fun squareIsWhite(coordinates: String): Boolean {
            return ((coordinates[0] - 'a') + (coordinates[1] - '0')) % 2 == 0
        }
    }
}