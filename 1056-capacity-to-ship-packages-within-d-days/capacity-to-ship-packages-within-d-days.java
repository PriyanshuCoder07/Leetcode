class Solution {
    public int findCapacity(int a, int[] weights){
        int days=0;
        int caps=0;
        for(int i=0; i<weights.length; i++){
            caps+=weights[i];
            if(caps==a){
                days++;
                caps=0;
            }else if(caps>a){
                // int n=caps-weights[i];
                // caps-=n;
                caps=weights[i];
                days++;
            }
        }
        if(caps!=0) days++;
        return days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0; i<weights.length; i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int ans=0;
        int low=max;
        int high=sum; 
        while(low<=high){
            int mid=(low+high)/2;
            if(findCapacity(mid,weights)<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;

         //Approach using linear search 

        // for(int i=max; i<=sum; i++){
        //     int capct=findCapacity(i,weights);
        //     if(capct<=days) return i;
        // }
        // // if(days==1) return sum;  ye to aise hi bs lekin code ab shi ho gya 
        // return -1;
    }
}