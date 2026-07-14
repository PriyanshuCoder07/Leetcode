class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c=t.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)-1);

                if(mp.get(c)<0){
                    return c;
                }
        }
        //flow of execution will never reach here;
        return 'x';
        
    }
}