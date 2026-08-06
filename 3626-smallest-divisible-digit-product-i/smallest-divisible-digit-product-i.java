class Solution {
    public int findProd(int a){
        int prod=1;
        while(a!=0){
            int n=a%10;
            prod*=n;
            a/=10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100; i++){
            int num=findProd(i);
            if(num%t==0) return i;
        }
        return -1;
    }
}