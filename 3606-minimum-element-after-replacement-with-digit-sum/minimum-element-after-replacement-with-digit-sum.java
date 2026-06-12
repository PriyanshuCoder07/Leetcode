class Solution {
    public int sumofDigits(int nums[],int i){
        int sum=0;
        while(nums[i]!=0){
            int num=nums[i]%10;
            sum+=num;
            nums[i]/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=sumofDigits(nums,i);
        }
        int mini=nums[0];
        for(int i=0; i<nums.length; i++){
            mini=Math.min(mini,nums[i]);
        }
        return mini;
    }

}