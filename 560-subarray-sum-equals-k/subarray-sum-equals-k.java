class Solution {
    public int subarraySum(int[] nums, int k) {
        //Optimal Approach will use prefix sum
        int n=nums.length; 
        int presum=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0,1);
        int count=0;
        for(int i=0; i<n; i++){
            presum+=nums[i];
            if(mp.containsKey(presum-k)){
                count+=mp.get(presum-k);
            }
            mp.put(presum, mp.getOrDefault(presum,0)+1);

        }
        return count;
        //Better solution
        // int n=nums.length; 
        // int count=0;
        // for(int i=0; i<n; i++){
        //     int sum=0;
        //     for(int j=i; j<n; j++){
        //         sum+=nums[j];
        //         if(sum==k) count++;
        //     }
        // }
        // return count;

        
        //brute force
        // int n=nums.length;
        // int count=0;
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         int sum=0;
        //         for(int l=i; l<=j; l++){
        //             sum+=nums[l];
        //         }
        //         if(sum==k) count++;
        //     }
        // }
        // return count;
        
    }
}