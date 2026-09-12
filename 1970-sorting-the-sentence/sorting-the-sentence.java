class Solution {
    public String sortSentence(String s) {
        
        int sp=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ') sp++;
        }
        String arr[]=new String[sp+1];
        for(int i=0; i<s.length(); i++){
            StringBuilder sb=new StringBuilder();
            int j=i;
            while(j<s.length() && s.charAt(j)!=' '){
                sb.append(s.charAt(j));
                j++;
            }
            i=j;
            int a=(sb.charAt(sb.length()-1)-'0');
            int len=sb.length()-1;
            sb.deleteCharAt(len);
            arr[a-1]=sb.toString();
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0; i<arr.length; i++){
            ans.append(arr[i]);
            if(i<arr.length-1){
               ans.append(' ');
            }

        }
        return ans.toString();
        
    }
}