class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        int maxlen=0;
        List<Character> list=new ArrayList<>();
        while(end<s.length()){
             char ch=s.charAt(end);
            if(!list.contains(ch)){
                list.add(ch);
                end++;
                maxlen=Math.max(maxlen,list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                // list.add(ch);
                start++;
            }
            // end++;
        }
        return maxlen;
    }
}