class Solution {
    public int divide(int dividend, int divisor) {
        int ans=(int)dividend/divisor;
        if(ans==Integer.MIN_VALUE && divisor<0) return Math.abs(Integer.MIN_VALUE+1);
       
        return ans;
    }
}