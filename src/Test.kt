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
    return max;
     */
    val solution = _53MaximumSubarray.Solution()
    val solve = solution.maxSubArray(intArrayOf(-1, -10))
    println(solve)
//    solve.forEach {
//        println(it)
//    }
}
