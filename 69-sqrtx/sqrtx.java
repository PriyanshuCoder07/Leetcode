class Solution {
    public int mySqrt(int x) {
        long ans=1;
        for(long i=0; i<=x; i++){
            if(i*i==x){
                return (int)i;
            }else if(i*i<x){
                ans=i;
            }else{
                break;
            }
        }
        return (int)ans;






        // //Binary Search 
        // long low=1;
        // long high=x; 
        // long ans=0;
        // while(low<=high){
        //     long mid=low+(high-low)/2;
        //     if(mid*mid<=x){
        //         ans=mid;
        //         low=mid+1;
        //     }else{
        //         high=mid-1;
        //     }
        // }
        // return (int)ans;

        // return(int) Math.sqrt(x);
        
    }
}