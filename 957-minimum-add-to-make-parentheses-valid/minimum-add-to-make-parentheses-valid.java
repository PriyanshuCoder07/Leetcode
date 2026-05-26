class Solution {
    public int minAddToMakeValid(String s) {
        int open=0;
        int close=0;
        int ans=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'&& open>0){
                open--;
                close++;
            }else if(s.charAt(i)=='('){
                open++;
            }
        }
      
        return s.length()-2*close;
        
    }
}