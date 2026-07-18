class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int max=0;
        int min=1001;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return gcd(max,min);
        
    }
}