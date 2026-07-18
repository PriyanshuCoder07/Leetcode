class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            char ch=s.charAt(i);
            char c=t.charAt(j);
            if(ch==c){
                i++;
                j++;
            }else{
                j++;
            }
            if(j==t.length() && i!=s.length()) return false;
        }
        if(t.isEmpty() && !s.isEmpty()) return false;
        return true;
    }
}