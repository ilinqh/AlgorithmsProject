package medium

class _638ShoppingOffers {
    class Solution {
        private val memo = HashMap<List<Int>, Int>()
        fun shoppingOffers(price: List<Int>, special: List<List<Int>>, needs: List<Int>): Int {
            val n = price.size
            val filterSpecial = ArrayList<List<Int>>()
            for (sp in special) {
                var totalCount = 0
                var totalPrice = 0
                for (i in 0 until n) {
                    totalCount += sp[i]
                    totalPrice += sp[i] * price[i]
                }
                if (totalCount > 0 && totalPrice > sp[n]) {
                    filterSpecial.add(sp)
                }
            }
            return dfs(price, special, needs, filterSpecial, n)
        }

        private fun dfs(
            price: List<Int>,
            special: List<List<Int>>,
            curNeeds: List<Int>,
            filterSpecial: List<List<Int>>,
            n: Int
        ): Int {
            if (!memo.containsKey(curNeeds)) {
                var minPrice = 0
                for (i in 0 until n) {
                    minPrice += curNeeds[i] * price[i]
                }
                for (curSpecial in filterSpecial) {
                    val specialPrice = curSpecial[n]
                    val nextNeeds = ArrayList<Int>()
                    for (i in 0 until n) {
                        if (curSpecial[i] > curNeeds[i]) {
                            break
                        }
                        nextNeeds.add(curNeeds[i] - curSpecial[i])
                    }
                    if (nextNeeds.size == n) {
                        minPrice = Math.min(minPrice, dfs(price, special, nextNeeds, filterSpecial, n) + specialPrice)
                    }
                }
                memo[curNeeds] = minPrice
            }
            return memo[curNeeds]!!
        }
    }
}