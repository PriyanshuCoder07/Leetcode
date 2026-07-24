class Solution {
    public int mySqrt(int x) {
        int ans=1;
        for(long i=0; i<=x; i++){
            if(i*i==x){
                ans=(int)i;
                return ans;
            }else if(i*i<=x){
                ans=(int)i;
            }else{
                break;
            }
        }
        return ans;






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

        //linear search having a tc of O(N)
        // int ans=1;
        // for(int i=1; i<=x; i++){
        //     if(i*i<=x){
        //         ans=i;
        //     }else{
        //         break;
        //     }
        // }
        // return ans;
        // return(int) Math.sqrt(x);
        
    }
}