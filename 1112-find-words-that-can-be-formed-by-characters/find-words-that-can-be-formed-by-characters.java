class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0; i<chars.length(); i++){
            mp.put(chars.charAt(i),mp.getOrDefault(chars.charAt(i),0)+1);
        }
        int ans=0;
        for(int i=0; i<words.length; i++){
            HashMap<Character,Integer> mp1=new HashMap<>();
            for(int j=0; j<words[i].length(); j++){
                char c=words[i].charAt(j);
                mp1.put(c,mp1.getOrDefault(c,0)+1);
            }
            boolean chk=true;
            for(char c:mp1.keySet()){
                if(mp1.get(c) > mp.getOrDefault(c,0)){
                    chk=false;
                    break;
                }
            }
            if(chk==true) ans+=words[i].length();
        }
        return ans;
    }
}