package day16;

import java.util.Scanner;

public class BinarySearchTreeCount {
    private static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        long[] dp = calculateBinarySearchTreeCount();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long count = dp[n];
            System.out.println(count);
        }
    }

    public static long[] calculateBinarySearchTreeCount() {
        int maxN = 1000;
        long[] dp = new long[maxN + 1];
        dp[0] = 1;
        dp[1] = 1;


        for (int i = 2; i <= maxN; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += (dp[j] * dp[i - j - 1]) % MOD;
                dp[i] %= MOD;
            }
        }

        return dp;
    }
}
