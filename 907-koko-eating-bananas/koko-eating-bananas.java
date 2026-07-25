class Solution {
    public boolean isPossible(int[] piles, int n, int h){
        long ans=0;
        for(int i=0; i<piles.length; i++){
            if(piles[i]<=n){
                ans++;
            }else{
                if(piles[i]>n && piles[i]%n==0){
                    ans+=piles[i]/n;
                }else{
                    ans+=(piles[i]/n)+1;
                }
            }
        }
        return ans<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0; i<piles.length; i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        int eatingspeed=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(piles,mid,h)){
                eatingspeed=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return eatingspeed;
        
    // public long solve(int[] piles,int speed){
    //     int n=piles.length;
    //     long eatspeed=0;
    //     for(int i=0; i<n; i++){
    //         eatspeed+=piles[i]/speed;
    //         if(piles[i]%speed!=0) eatspeed++;
    //     }
    //     return eatspeed;
    // }
    // public int minEatingSpeed(int[] piles, int h) {
    //     int max=0;
    //     for(int i=0; i<piles.length; i++){
    //         max=Math.max(piles[i],max);
    //     }
    //     int low=1;
    //     int high=max;
    //     int res=0;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;
    //         long hrs=solve(piles,mid);
    //         if(hrs>h){
    //             low=mid+1;
    //         }else{
    //             res=mid;
    //             high=mid-1;
    //         }

    //     }
    //     return res;
      
        
    }
}