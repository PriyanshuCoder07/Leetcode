class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n=strs.length;
        int i=0;
        String ans="";
        while(i<strs[0].length() && i<strs[n-1].length()){
            if(strs[0].charAt(i)==strs[n-1].charAt(i)){
                ans+=strs[0].charAt(i);
            }else{
                break;
            }
            i++;
        }
        return ans;
















        // String ans="";
        // int idx=0;
        // for(int i=0; i<strs[0].length(); i++){
        //     char ch=strs[0].charAt(idx);
        //     for(int i=0; i<strs.length; i++){
        //        if(strs[i].charAt(idx)!=ch) return "";
        //     }
        //     ans+=ch;
        //     idx++;
        // }
        // return ans;
        
    }
}