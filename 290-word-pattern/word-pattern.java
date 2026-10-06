class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp=new HashMap<>();
        HashSet<String> st=new HashSet<>();
        int[] vis=new int[26];
        String[] str=s.split(" ");
        if(str.length!=pattern.length()) return false; 
        for(int i=0; i<pattern.length(); i++){
            char c=pattern.charAt(i);
            if(vis[c-'a']!=0){
                if(!mp.get(c).equals(str[i])) return false;
            }else{
                if(st.contains(str[i])){
                    return false;
                }else{    
                    mp.put(c,str[i]);
                    st.add(str[i]);
                    vis[c-'a']=1;
                }
            }
            
        }
        return true;

        
    }
}