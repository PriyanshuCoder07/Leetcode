class Solution {
    public int longestValidParentheses(String s) {
        int open=0;
        int close=0;
        int ans=0;
        //left to right traversal
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='(') open++;
            else close++;
            if(close>open){
                // dono ko reset kardo because hme contigeous chahiye as it is asking for substring
                open=close=0;

            }else if(open==close){
                ans=Math.max(ans,open+close);
            }
        }
         open=close=0;

        for(int i=s.length()-1; i>=0; i--){
            char ch=s.charAt(i);
            if(ch=='(') open++;
            else close++;
            if(open>close){
                open=close=0;
            }else if(open==close){
                ans=Math.max(ans,open+close);
            }
        
        }
        return ans;
    }
}