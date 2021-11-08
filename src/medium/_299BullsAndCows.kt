package medium

class _299BullsAndCows {
    class Solution {
        fun getHint(secret: String, guess: String): String {
            var bull = 0
            var cow = 0
            val secretArray = IntArray(10)
            val guessArray = IntArray(10)

            for (i in secret.indices) {
                if (secret[i] == guess[i]) {
                    bull += 1
                } else {
                    secretArray[secret[i] - '0'] += 1
                    guessArray[guess[i] - '0'] += 1
                }
            }
            for (i in 0..9) {
                cow += Math.min(secretArray[i], guessArray[i])
            }
            return "${bull}A${cow}B"
//            return StringBuilder().append(bull).append('A').append(cow).append('B').toString()
        }
    }
}