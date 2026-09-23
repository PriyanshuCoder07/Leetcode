class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int l=0;
        int r=0;
        int sum=0;
        int ts=0;
        int ans=-1;
        for(int i=0; i<n; i++){
            ts+=nums[i];
        }
        int remsum=ts-x;
        while(r<n){
            sum+=nums[r];
            while(l<n && sum>remsum){
                sum-=nums[l];
                l++;
            }
            if(sum==remsum){
                ans=Math.max(ans,r-l+1);
            }
            r++;

        }
        if(ans==-1) return -1;
        return n-ans;
        
    }
}