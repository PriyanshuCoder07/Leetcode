class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> mp1=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char d=t.charAt(i);
            mp2.put(d,mp2.getOrDefault(d,0)+1);
        }  
        // boolean a[]=new boolean[26];
        char c[]=s.toCharArray();
        for(char ch:c){
            int num1=mp1.getOrDefault(ch,0);
            int num2=mp2.getOrDefault(ch,0);
            if(num1!=num2) return false;
        }    
        return true;
          
        // while(i)
    }
}