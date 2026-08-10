class Solution {
    public int climbStairs(int n) {
        //No. of ways diya hai to dp lagao
        int dp[]=new int[n+1];
        //Tabulation
        // if(n==0)
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];




        // Arrays.fill(dp,-1);
        // return solve(n,dp);

        //ye to hua normal recursive code
        // if(n==0 || n==1) return 1;
        // return climbStairs(n-1)+climbStairs(n-2);
        
    }
    //Memoisation
    // public int solve(int n, int[] dp){
    //     if(n==0 || n==1) return 1;
    //     if(dp[n]!=-1) return dp[n];
    //     return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    // }
}