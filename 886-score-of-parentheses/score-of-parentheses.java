class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        int score=0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if(ch=='('){
                //naya brackets mil gye
                st.push(score);
                //reset abhi tk ka score push aue reset
                score=0;
            }else{
                if(s.charAt(i-1)=='('){
                    score=st.peek()+1;
                }else{
                    score=st.peek()+2*score;
                }
                st.pop();
                

            }

           


        }
        return score;
        
    }
}