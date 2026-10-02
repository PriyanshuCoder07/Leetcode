class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> st=new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        int count=0;
        for(int i=left; i<=right; i++){
            String word=words[i];
            char first=word.charAt(0);
            char last=word.charAt(word.length()-1);
            if(st.contains(first) && st.contains(last)) count++;

        }
        return count;
        
    }
}