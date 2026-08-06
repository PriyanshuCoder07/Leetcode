class Solution {
    public boolean isPossible(int dist, int[] position, int magnets){
        int mgcnt=1;
        int lastmg=position[0];
        for(int i=1; i<position.length; i++){
            if(position[i]-lastmg>=dist){
                mgcnt++;
                lastmg=position[i];
            }
            if(mgcnt>=magnets) return true;
        }
        return mgcnt>=magnets;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int maxdist=position[n-1]-position[0];
        if(m==2) return maxdist;
        int ans=0;
        int low=1;
        int high=maxdist;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(mid,position,m)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;














        //Approach using linear search
        // for(int i=1; i<=maxdist; i++){
        //     if(isPossible(i,position,m)){
        //         ans=i;
        //     }else{
        //         return ans;
        //     }
        // }
        // return ans;
        
    }
}