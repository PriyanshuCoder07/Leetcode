class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        //Edge case
        if(n==1) return nums[0];
        for(int i=0; i<nums.length; i++){
            if(i==0){
                if(nums[i]!=nums[i+1]) return nums[i];
            }else if(i==n-1){
                if(nums[i-1]!=nums[i]) return nums[i];
            }else{
                //iss condn me sare middle ke ele lie karenge
                if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]) return nums[i];
            }
        }
        return -1;
    }
}