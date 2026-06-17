class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        // g matlab greed factor har ek child ka
        int harchildkigreed=g.length; 
        //s matlab cookies ka size
        int cookieskasize=s.length; 
        int left=0;
        int right=0;
        while(left<harchildkigreed && right<cookieskasize){
            if(g[left]<=s[right]){
                left++;
            }
            right++;
        }
        return left;
        
    }
}