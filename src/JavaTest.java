public class JavaTest {

    public static void main(String[] args) {
        int a = ~-1;
        System.out.println(a);
    }

    /*
     * a : 被除数
     * b : 除数
     */
    /*int divide(int a, int b){
        // 先取被除数和除数的绝对值
        int dividend = a > 0 ? a : add(~a, 1);
        int divisor = b > 0 ? a : add(~b, 1);

        int quotient = 0;// 商
        int remainder = 0;// 余数
        // 不断用除数去减被除数，直到被除数小于被除数（即除不尽了）
        while(dividend >= divisor){// 直到商小于被除数
            quotient = add(quotient, 1);
            dividend = substract(dividend, divisor);
        }
        // 确定商的符号
        if((a ^ b) < 0){// 如果除数和被除数异号，则商为负数
            quotient = add(~quotient, 1);
        }
        // 确定余数符号
        remainder = b > 0 ? dividend : add(~dividend, 1);
        return quotient;// 返回商
    }*/

    /**
     * 这里有和简单版乘法运算一样的问题，如果被除数非常大，除数非常小，那就要进行很多次减法运算，有没有更简便的方法呢？
     * 上面的代码之所以比较慢是因为步长太小，每次只能用1倍的除数去减被除数，所以速度比较慢。那能不能增大步长呢？如果能，应该怎么增大步长呢？
     * 计算机是一个二元的世界，所有的int型数据都可以用[2^0, 21,...,231]这样一组基来表示（int型最高31位）。不难想到用除数的231,230,...,22,21,2^0倍尝试去减被除数，如果减得动，则把相应的倍数加到商中；如果减不动，则依次尝试更小的倍数。这样就可以快速逼近最终的结果。
     * 2的i次方其实就相当于左移i位，为什么从31位开始呢？因为int型数据最大值就是2^31啊。
     * @param a
     * @param b
     * @return
     */

    /*int divide_v2(int a,int b) {
        // 先取被除数和除数的绝对值
        int dividend = a > 0 ? a : add(~a, 1);
        int divisor = b > 0 ? a : add(~b, 1);
        int quotient = 0;// 商
        int remainder = 0;// 余数
        for(int i = 31; i >= 0; i--) {
            //比较dividend是否大于divisor的(1<<i)次方，不要将dividend与(divisor<<i)比较，而是用(dividend>>i)与divisor比较，
            //效果一样，但是可以避免因(divisor<<i)操作可能导致的溢出，如果溢出则会可能dividend本身小于divisor，但是溢出导致dividend大于divisor
            if((dividend >> i) >= divisor) {
                quotient = add(quotient, 1 << i);
                dividend = substract(dividend, divisor << i);
            }
        }
        // 确定商的符号
        if((a ^ b) < 0){
            // 如果除数和被除数异号，则商为负数
            quotient = add(~quotient, 1);
        }
        // 确定余数符号
        remainder = b > 0 ? dividend : add(~dividend, 1);
        return quotient;// 返回商
    }*/
}
