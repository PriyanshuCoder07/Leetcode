class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        for(int i=0; i<Math.min(word1.length(),word2.length()); i++){
            char c1=word1.charAt(i);
            char c2=word2.charAt(i);
            sb.append(c1);
            sb.append(c2);


        }
        if(len1>len2){
             for(int i=word2.length(); i<word1.length(); i++){
                  sb.append(word1.charAt(i));
             }
        }else{
                for(int i=word1.length(); i<word2.length(); i++){
                    sb.append(word2.charAt(i));
                }
        }

        return sb.toString();
    }
}