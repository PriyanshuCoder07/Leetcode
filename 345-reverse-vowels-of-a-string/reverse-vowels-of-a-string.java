class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                sb.append(ch);
            }
        }
        sb=sb.reverse();
        int ptr=0;
        StringBuilder str=new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
               str.setCharAt(i,sb.charAt(ptr));
                ptr++;
            }
        }
        return str.toString();
        
    }
}