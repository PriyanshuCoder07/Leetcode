class Solution {
    public int isPossible(int sumarr, int[] nums){
        int sumarray=0;
        int subarrcnt=0;
        for(int i=0; i<nums.length; i++){
            sumarray+=nums[i];
            if(sumarray==sumarr){
                subarrcnt++;
                sumarray=0;
            }else{
                if(sumarray>sumarr){
                    subarrcnt++;
                    sumarray=nums[i];
                }
            }
        }
        if(sumarray!=0)  subarrcnt++;
        return subarrcnt;
    }
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int low=max; 
        int high=sum; 
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(mid,nums)<=k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;













        //Approach using linear Search
        // for(int sm=max; sm<=sum; sm++){
        //     if(isPossible(sm,nums)<=k) return sm;
        // }
        // return 0;
        
    }
}