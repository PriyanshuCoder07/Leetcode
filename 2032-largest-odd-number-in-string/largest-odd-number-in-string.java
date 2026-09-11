class Solution {
    public String largestOddNumber(String num) {
        int j=-1;
        int n=num.length()-1;
        while(n>=0){
            if((num.charAt(n)-'0')%2==1){
                j=n;
                break;
            }
            n--;
        }
        if(j==-1) return "";
        int i=0;
        while(i<=n){
            if(num.charAt(i)!=0) break;
            i++;
        }
        return num.substring(i,j+1);

        
    }
}