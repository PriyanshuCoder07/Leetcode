class Solution {
    public int search(int[] nums, int target) {
        //Approach using linear search having TC O(log N)
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return i;
        }
        return -1;
        
    }
}