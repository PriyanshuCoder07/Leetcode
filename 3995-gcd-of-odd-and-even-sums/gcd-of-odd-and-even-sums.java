class Solution {
    public int findGCD(int a, int b){
        int gcd=0;
        for(int i=1; i<Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd=1;
        int even=2;
        int sumodd=0;
        int sumeven=0;
        for(int i=0; i<n; i++){
            odd+=2;
            sumodd+=odd;
            even+=2;
            sumeven+=even;
        }
        return findGCD(sumodd,sumeven);    
    }
}