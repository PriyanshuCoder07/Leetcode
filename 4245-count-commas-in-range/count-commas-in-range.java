class Solution {
    public int countCommas(int n) {
        int org=n;
        int num=0;
        int count=0;
            
    
        while(n!=0){
            int x=n%10;
            count++;
            n/=10;
            
        }
        if(count<=3) return 0;
        else if(count>3){
            num=org-1000;       
        }
          return num+1;
    }
}