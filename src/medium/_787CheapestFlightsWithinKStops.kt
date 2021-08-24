package medium


class _787CheapestFlightsWithinKStops {
    internal class Solution {
        fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
            val INF = 10000 * 101 + 1
            val f = Array(k + 2) { IntArray(n) { INF } }
            f[0][src] = 0
            for (t in 1..k + 1) {
                for (flight in flights) {
                    val j = flight[0]
                    val i = flight[1]
                    val cost = flight[2]
                    f[t][i] = Math.min(f[t][i], f[t - 1][j] + cost)
                }
            }
            var ans = INF
            for (t in 1..k + 1) {
                ans = Math.min(ans, f[t][dst])
            }
            return if (ans == INF) -1 else ans
        }
    }

    class BestSolution {
        fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
            val INF = 10000 * 101 + 1
            var f = IntArray(n) { INF }
            f[src] = 0
            var ans = INF
            for (t in 0..k) {
                val g = IntArray(n) { INF }
                for (flight in flights) {
                    val j = flight[0]
                    val i = flight[1]
                    val cost = flight[2]
                    g[i] = Math.min(g[i], f[j] + cost)
                }
                f = g
                ans = Math.min(ans, f[dst])
            }
            return if (ans == INF) -1 else ans
        }
    }
}