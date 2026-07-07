class Solution {
    public long sumAndMultiply(int n) {
        int cnt=0;
        int rev=0;
        while(n!=0){
            int num=n%10;
            if(num!=0){
                rev=rev*10+num;
                cnt++;
            }
            n/=10;
        }
        if(cnt==0)return 0;
        int a=rev;
        long sum=0;
        rev=0;
        while(a!=0){
            int x=a%10;
            rev=rev*10+x;
            sum+=x;
            a/=10;
        }
        return rev*sum;
        
    }
}