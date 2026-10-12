class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        HashMap<Character,String> mp=new HashMap<>();
        HashSet<String> st=new HashSet<>();
        if(str.length!=pattern.length()) return false;
        for(int i=0; i<str.length; i++){
            char ch=pattern.charAt(i);
            //mere map me nii hai to 
            if(!mp.containsKey(ch)){
                if(st.contains(str[i])) return false;
                mp.put(ch,str[i]);
                st.add(str[i]);
            }else{
                //agar map me already key present 
                if(!mp.get(ch).equals(str[i])) return false;
            }
        }
        return true;



























        // HashMap<Character,String> mp=new HashMap<>();
        // HashSet<String> st=new HashSet<>();
        // int[] vis=new int[26];
        // String[] str=s.split(" ");
        // if(str.length!=pattern.length()) return false; 
        // for(int i=0; i<pattern.length(); i++){
        //     char c=pattern.charAt(i);
        //     if(vis[c-'a']!=0){
        //         if(!mp.get(c).equals(str[i])) return false;
        //     }else{
        //         if(st.contains(str[i])){
        //             return false;
        //         }else{    
        //             mp.put(c,str[i]);
        //             st.add(str[i]);
        //             vis[c-'a']=1;
        //         }
        //     }
            
        // }
        // return true;

        
    }
}