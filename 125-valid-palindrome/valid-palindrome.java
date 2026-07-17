class Solution {
    public boolean isPalindrome(String s) {
        //ye sare character jo string me h unko lowercase me kr diya
        s=s.toLowerCase();
        //ye sare spaces ko remove kar diya
        s=s.trim();
        //ye kewal a-z tk jo bhi character hai unko kewal rhne dega baki ko replace kardega
        s=s.replaceAll("[^a-z0-9]","");
    
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;



    }
}