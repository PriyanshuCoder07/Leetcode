class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            int factors=0;
            int num=nums[i];
            for(int j=1; j<=Math.sqrt(num); j++){
                    if(num%j==0){
                        sum+=j;
                        factors++;
                    }
                    if(j!=num/j && num%(num/j)==0){
                            sum+=num/j;
                            factors++;
                    }

            }
            if(factors==4) ans+=sum;

        }
        return ans;
        
    }
}