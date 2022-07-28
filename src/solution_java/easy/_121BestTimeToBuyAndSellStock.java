package solution_java.easy;

public class _121BestTimeToBuyAndSellStock {
public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > ans) {
                ans = price - min;
            }
        }
        return ans;
    }
}
}
