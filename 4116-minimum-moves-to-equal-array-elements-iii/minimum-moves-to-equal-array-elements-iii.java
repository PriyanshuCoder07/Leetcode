class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        for(int num:nums){
            moves+=Math.abs(num-nums[nums.length-1]);

        }
        return moves;
        
    }
}