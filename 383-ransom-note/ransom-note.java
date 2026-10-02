class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // return magazine.contains(ransomNote);
        HashMap<Character,Integer> mp1=new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            char ch=magazine.charAt(i);
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            char ch=ransomNote.charAt(i);
            if(!mp1.containsKey(ch) || mp1.get(ch)==0) return false;
            else{
                int num=mp1.get(ch);
                mp1.put(ch,num-1);
            }
        }
        return true;

        
    }
}