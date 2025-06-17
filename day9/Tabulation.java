import java.util.Arrays;

public class Tabulation {
    public static void main(String[] args) {
        long[] memo = new long[100];
        memo[0] = 0;
        memo[1] = 1;

        System.out.println(fibTabulation(30, memo));
        System.out.println(fibTabulation(40, memo));
        System.out.println(fibTabulation(90, memo));
        System.out.println(Arrays.toString(memo));
    }

    public static long fibTabulation(int n, long[] memp) {
        if (memp.length > n) {
            for (int i = 2; i <= n; i++) {
                if (memp[i] == 0) {
                    memp[i] = memp[i - 1] + memp[i - 2];
                }
            }
            return memp[n];
        }
        System.out.println("Insufficient memory! memp.length = " + memp.length);
        return -1;
    }

    public static long fib(long n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}

