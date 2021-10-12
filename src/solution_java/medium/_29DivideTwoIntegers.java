package solution_java.medium;

public class _29DivideTwoIntegers {
    public class Solution {
        public int divide(int a, int b) {
            long dividend = Math.abs((long) a);
            long divisor = Math.abs((long) b);
            long quotient = 0L;
            for (int i = 31; i >= 0; i--) {
                if ((dividend >> i) >= divisor) {
                    quotient += (1L << i);
                    dividend -= (divisor << i);
                }
            }
            if ((a ^ b) < 0) {
                quotient = ~quotient + 1;
            }
            if (quotient == (1L << 31)) {
                return (int) (quotient - 1);
            }
            return (int) quotient;
        }
    }
}
