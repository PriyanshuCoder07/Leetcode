class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        // //Edge case
        int xor=0;
        for(int i=0; i<n; i++){
            xor=xor^nums[i];
        }
        return xor;
        // if(nums[0]!=nums[1]) return nums[0];
        // if(nums[n-1]!=nums[n-2])return nums[n-1];
        // int low=1;
        // int high=n-2;
        // while(low<high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]!=nums[mid-1] || nums[mid]!=nums[mid+1]) return nums[mid];
        //     if(n%2==1){
                
        //     }
        // }
        // if(n==1) return nums[0];
        // for(int i=0; i<nums.length; i++){
        //     if(i==0){
        //         if(nums[i]!=nums[i+1]) return nums[i];
        //     }else if(i==n-1){
        //         if(nums[i-1]!=nums[i]) return nums[i];
        //     }else{
        //         //iss condn me sare middle ke ele lie karenge
        //         if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]) return nums[i];
        //     }
        // }
        // return -1;
    }
}