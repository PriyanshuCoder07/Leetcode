class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int count=0;
        int res=0;
        int i=0;
        while(i<n){
            char c=s.charAt(i);
            if(c=='('){
                count++;
                i++;
            }else{
                //mtlb ki ')' ye wala char mila phir aage chk krenge
                if(count>0){
                    count--;
                    if(i+1<n && s.charAt(i+1)==')'){
                        i+=2;
                    }else{
                        res++;
                        i++; //close braces add
                    }
                }else{
                    if(i+1<n && s.charAt(i+1)==')'){
                        res++;
                        i+=2;
                    }else{
                        //kyuki is case me na hi open hai aur na hi aage close hai 
                        res+=2;
                        i++;
                    }
                }
            }
        
        }
        return res+count*2;
        
    }
}