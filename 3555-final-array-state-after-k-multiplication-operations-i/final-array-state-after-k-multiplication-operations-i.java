class Solution {
    public int findMin(int nums[]){
        int mini=nums[0];
        for(int i=0; i<nums.length; i++){
            mini=Math.min(mini,nums[i]);
        }
        return mini;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k!=0){
            int x=findMin(nums);
            for(int i=0 ; i<nums.length; i++){
                if(nums[i]==x){
                    nums[i]=nums[i]*multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}