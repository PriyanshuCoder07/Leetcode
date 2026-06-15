class Solution {
    public int numberOfMatches(int n) {
        int ans=0;
        int match=0;
        int team=0;
        while(n!=1){
            if(n%2==0){
                 match=n/2;
                 team=n/2;
                ans+=match;

            }else{
                 match=(n-1)/2;
                 team=(n-1)/2+1;
                ans+=match;
                
            }
            n=team;
        }
        return ans;
        
    }
}