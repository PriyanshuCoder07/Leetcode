class Solution {
    public boolean check(long sum, int a){
        String s=String.valueOf(sum);
        char c=(char)(a+'0');
        if(s.charAt(0)==c && s.charAt(s.length()-1)==c){
            return true;
        }
        return false;
        
    }
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        if(n==1 && nums[0]!=x) return 0;
        int first=nums[0];
        int last=nums[n-1];
       int count=0;
        for(int i=0; i<n; i++){
            long sum=0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                if(check(sum,x)){
                    count++;
                }
            }
        }
        return count;
        
    }
}