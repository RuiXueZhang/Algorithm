package offer.simple;

/**
 * 费波切纳数列
 */
public class Fibonacci {
    public int fib(int n) {

        int pre = 0;
        int current = 1;
        int sum;

        for (int i = 0; i < n; i++) {
          sum = (pre + current) % 1000000007;
          pre = current;
          current = sum;
        }
        return pre;
    }
}
