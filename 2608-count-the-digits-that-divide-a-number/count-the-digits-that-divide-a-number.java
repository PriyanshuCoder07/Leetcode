class Solution {
    public int countDigits(int num) {
        int ans=0;
        int a=num;
        while(num!=0){
            int n=num%10;
            if(a%n==0){
                ans++;
            }
            num/=10;
        }
        return ans;
        
    }
}