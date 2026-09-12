class Solution {
    public int balancedStringSplit(String s) {
        int lc=0, rc=0;
        int balanceStr=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='L') lc++;
            else rc++;
            if(lc==rc) balanceStr++;
        }
        return balanceStr;
    }
}