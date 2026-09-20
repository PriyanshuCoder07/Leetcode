class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int res=0;
        /* 122-97=25+1*/
        for(int i=0; i<n; i++){
            int c=('z'-s.charAt(i)+1)*(i+1);
            res+=c;

        }
        return res;
        
    }
}