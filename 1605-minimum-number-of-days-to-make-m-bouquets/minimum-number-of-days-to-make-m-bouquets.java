class Solution {
    public int findBqes(int a, int[] bloomDay, int k){
        int boq=0;
        int cnt=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=a){
                cnt++;
                if(cnt==k){
                    boq++;
                    cnt-=k;
                }    
            }else{
                cnt=0;
            }
        }
        return boq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0; i<bloomDay.length; i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }
        int low=min;
        int high=max;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(findBqes(mid,bloomDay,k)>=m){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;
        //Approach using linear search
        // for(int i=min; i<=max; i++){
        //     if(m*k>bloomDay.length) return -1;
            
        //     if(findBqes(i,bloomDay,k)>=m) return i;

        // }
        // return -1;
        
    }
}