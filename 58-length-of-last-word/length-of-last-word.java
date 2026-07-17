class Solution {
    public int lengthOfLastWord(String s) {
        //kewal first and last spaces ko remove krta hai trim()
        s=s.trim();
        String last="";
        int n=s.length();
        int cnt=0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)!=' '){
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }
}