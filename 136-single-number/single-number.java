class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor=xor^nums[i];
        }
        return xor;
        /*  0^4=4;
           4^1^2^1^2 jisme 1 do bar aur 2 bhi do bar dono cancel
           bachega kya 
           sirf 4;
           */
        
    }
}