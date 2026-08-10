class Solution {
    
    public int fib(int n) {
        if(n<=1) return n;
        //memoisation
        return fib(n-1)+fib(n-2);
    }
}