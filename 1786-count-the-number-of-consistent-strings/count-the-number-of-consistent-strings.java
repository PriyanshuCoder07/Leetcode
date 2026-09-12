class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consStr=0;
        HashSet<Character> st=new HashSet<>();
        for(int i=0; i<allowed.length(); i++){
            char c=allowed.charAt(i);
            st.add(c);
        }
        for(int i=0; i<words.length; i++){
            boolean chk=true;
            for(int j=0; j<words[i].length(); j++){
                char c=words[i].charAt(j);
                if(!st.contains(c)) {
                    chk=false;
                    break;
                }
            }
            if(chk) consStr++;
        }
        return consStr;
        
    }
}