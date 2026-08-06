class Solution {
    public int findSum(int a, int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=Math.ceil((double)nums[i]/a);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        // int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            // min=Math.min(min,nums[i]);
        }

        int low=1;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(findSum(mid,nums)<=threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        //Approach using linear search
        // for(int i=1; i<=max; i++){
        //     int sum=findSum(i,nums);
        //     if(sum<=threshold) return i;

        // }
        // return -1;
        
    }
}