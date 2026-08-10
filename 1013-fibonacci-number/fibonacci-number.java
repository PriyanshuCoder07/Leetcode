class Solution {   
    public int fib(int n) {
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       return solve(n,dp);
    }
    public int solve(int a, int[] dp){
        if(a<=1) return a;
        if(dp[a]!=-1) return dp[a];
        return dp[a]=solve(a-1,dp)+solve(a-2,dp);
    }


}