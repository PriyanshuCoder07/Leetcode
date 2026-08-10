class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int cnt=0;
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                cnt++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return cnt;















        // Arrays.sort(g);
        // Arrays.sort(s);
        // // g matlab greed factor har ek child ka
        // int harchildkigreed=g.length; 
        // //s matlab cookies ka size
        // int cookieskasize=s.length; 
        // int left=0;
        // int right=0;
        // while(left<harchildkigreed && right<cookieskasize){
        //     if(g[left]<=s[right]){
        //         left++;
        //     }
        //     right++;
        // }
        // return left;
        
    }
}