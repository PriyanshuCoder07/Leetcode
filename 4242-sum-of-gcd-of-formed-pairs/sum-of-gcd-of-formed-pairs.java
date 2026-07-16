class Solution {
    public long findGCD(long a,long b){
      //yad rakhne ye gcd using Eucidian formula/Approach
      while(b!=0){
        long temp=b;
        b=a%b;
        a=temp;
      }
      return a;
    }
    public long gcdSum(int[] nums) {
        long mxi=0;
        long[] prefGCD=new long[nums.length];
        for(int i=0; i<nums.length; i++){
            mxi=Math.max(mxi,nums[i]);
            long num=findGCD(mxi,nums[i]);
            prefGCD[i]=num;

        }
        Arrays.sort(prefGCD);
        int n=prefGCD.length;
        int start=0;
        int end=n-1;
        long ans=0;
        // int mididx=n/2;
        while(start<end){
            ans+=findGCD(prefGCD[start],prefGCD[end]);
            start++;
            end--;
        }
        return ans;
    }
}