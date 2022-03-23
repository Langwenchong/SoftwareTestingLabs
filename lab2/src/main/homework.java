package main;

/**
 * @Author Lang wenchong
 * @Date 2022/3/16 11:54
 * @Version 1.0
 */
public class homework {

    public static int solve(int n) {
        int[] dp = new int[n + 5];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * dp[i - j], j * (i - j)));
            }
        }
        return dp[n];
    }
}
