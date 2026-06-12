class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int a=n;
        while(n!=0){
            int num=n%10;
            prod*=num;
            n/=10;
        }
        int sum=0;
        while(a!=0){
            int num=a%10;
            sum+=num;
            a/=10;
        }
        return prod-sum;
        
    }
}