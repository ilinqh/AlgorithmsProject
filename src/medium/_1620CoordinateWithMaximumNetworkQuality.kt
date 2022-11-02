package medium

class _1620CoordinateWithMaximumNetworkQuality {
    class Solution {
        fun bestCoordinate(towers: Array<IntArray>, radius: Int): IntArray {
            var maxX = Int.MIN_VALUE
            var maxY = Int.MIN_VALUE
            for (i in towers.indices) {
                val tower = towers[i]
                maxX = Math.max(tower[0], maxX)
                maxY = Math.max(tower[1], maxY)
            }
            var cx = 0
            var cy = 0
            var maxQuality = 0

            for (x in 0..maxX) {
                for (y in 0..maxY) {
                    val coordinate = intArrayOf(x, y)
                    var quality = 0
                    for (i in towers.indices) {
                        val tower = towers[i]
                        val squareDistance = getSquaredDistance(coordinate, tower)
                        if (squareDistance <= (radius * radius)) {
                            quality += Math.floor(tower[2] / (1.0 + Math.sqrt(squareDistance.toDouble()))).toInt()
                        }
                    }
                    if (quality > maxQuality) {
                        maxQuality = quality
                        cx = x
                        cy = y
                    }
                }
            }

            return intArrayOf(cx, cy)
        }

        private fun getSquaredDistance(coordinate: IntArray, tower: IntArray): Int {
            return (tower[0] - coordinate[0]) * (tower[0] - coordinate[0]) + (tower[1] - coordinate[1]) * (tower[1] - coordinate[1])
        }
    }
}