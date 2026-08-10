class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length; 
        // return solve(n,cost);
        int dp[]=new int[n+1];
        //starting points
        dp[0]=0;
        dp[1]=0;
        for(int i=2; i<=n; i++){
            int left=dp[i-1]+cost[i-1];
            int right=dp[i-2]+cost[i-2];
            dp[i]=Math.min(left,right);
        }
        return dp[n];
        
    }
    public int solve(int n, int[] cost){
        if(n<=1) return 0;
        int left=solve(n-1,cost)+cost[n-1];
        int right=Integer.MAX_VALUE;
        if(n>1){
            right=solve(n-2,cost)+cost[n-2];
        }
        return Math.min(left,right);
    }
}