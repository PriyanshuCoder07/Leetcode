class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        HashMap<Character,Integer> mp=new HashMap<>();
        int arr[]=new int[26];
        for(int i=0; i<sentence.length(); i++){
            char c=sentence.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr[i]==0) return false;
        }

    
        return true;
        
    }
}