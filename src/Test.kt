import easy.*

fun main() {
    /**
     *     int sum = 0;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < nums.length; ++i) {
    sum = Math.max(nums[i], sum + nums[i]);
    max = Math.max(sum, max);
    [-2,1,-3,4,-1,2,1,-5,4]
    }
    "mississippi"
    "issip"
    return max;
     */
    val solution = _35SearchInsertPosition.BestSolution()
    val solve = solution.searchInsert(intArrayOf(1, 3, 3, 3, 3, 5), 3)
    println(solve)
//    solve.forEach {
//        println(it)
//    }
}
