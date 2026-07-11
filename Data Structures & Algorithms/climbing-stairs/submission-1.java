class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return solve(0, n, dp);
    }

    public int solve(int x, int n, int[] dp) {
        if (x == n) return 1;
        if (x > n) return 0;

        if (dp[x] != 0) return dp[x];

        dp[x] = solve(x + 1, n, dp) + solve(x + 2, n, dp);
        return dp[x];
    }
}