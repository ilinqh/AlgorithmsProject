package medium

import java.util.*

class _1333FilterRestaurantsByVeganFriendlyPriceAndDistance {
    class Solution {
        fun filterRestaurants(
            restaurants: Array<IntArray>,
            veganFriendly: Int,
            maxPrice: Int,
            maxDistance: Int
        ): List<Int> {
            val filter = ArrayList<IntArray>()
            restaurants.forEach {
                if (it[3] <= maxPrice && it[4] <= maxDistance && !(veganFriendly == 1 && it[2] == 0)) {
                    filter.add(it)
                }
            }
            Collections.sort(filter, object : Comparator<IntArray> {
                override fun compare(o1: IntArray, o2: IntArray): Int {
                    if (o1[1] == o2[1]) {
                        return o2[0] - o1[0]
                    }
                    return o2[1] - o1[1]
                }
            })
            return filter.map {
                it[0]
            }
        }
    }
}