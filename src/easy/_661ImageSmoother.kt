package easy

class _661ImageSmoother {
    class Solution {
        fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
            val row = img.size
            val column = img.first().size
            val result = Array(row) { IntArray(column) }
            for (i in 0 until row) {
                for (j in 0 until column) {
                    var count = 1
                    var sum = img[i][j]
                    if (j - 1 >= 0) {
                        count += 1
                        sum += img[i][j - 1]
                    }
                    if (j + 1 < column) {
                        count += 1
                        sum += img[i][j + 1]
                    }
                    if (i - 1 >= 0) {
                        count += 1
                        sum += img[i - 1][j]
                        if (j - 1 >= 0) {
                            count += 1
                            sum += img[i - 1][j - 1]
                        }
                        if (j + 1 < column) {
                            count += 1
                            sum += img[i - 1][j + 1]
                        }
                    }
                    if (i + 1 < row) {
                        count += 1
                        sum += img[i + 1][j]
                        if (j - 1 >= 0) {
                            count += 1
                            sum += img[i + 1][j - 1]
                        }
                        if (j + 1 < column) {
                            count += 1
                            sum += img[i + 1][j + 1]
                        }
                    }
                    result[i][j] = sum / count
                }
            }
            return result
        }
    }
}