class Solution {
    public int climbStairs(int n) {
        //No. of ways diya hai to dp lagao
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);

        //ye to hua normal recursive code
        // if(n==0 || n==1) return 1;
        // return climbStairs(n-1)+climbStairs(n-2);
        
    }
    public int solve(int n, int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    }
}