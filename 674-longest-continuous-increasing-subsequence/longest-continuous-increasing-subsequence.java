class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxlength=0;
        int len=1;
        int n=nums.length; 
        if(n==1) return 1;
        for(int i=0; i<n-1; i++){
            if(nums[i]<nums[i+1]){
                len++;
                // maxlength=Math.max(maxlength,len);
            }else{
                len=1;
            }
            maxlength=Math.max(maxlength,len);

        }
        return maxlength;
    }
}