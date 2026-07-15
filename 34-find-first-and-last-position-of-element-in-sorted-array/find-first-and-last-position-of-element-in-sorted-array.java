class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length; 
        int low=0;
        int high=n-1;
        int first=-1;
        int last=-1;
        for(int i=0; i<n; i++){
            if(nums[i]==target){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        return new int[]{first,last};


















        //Approach using Binary Search
        // int ans1=-1;
        // int ans2=-1;
        // int low=0; 
        // int high=nums.length-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]==target){
        //         ans1=mid;
        //         high=mid-1;
        //     }else{
        //         if(nums[mid]>target){
        //             high=mid-1;
        //         }else{
        //            low=mid+1;
        //         }
        //     }
        // }
        // low=0;
        // high=nums.length-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]==target){
        //         ans2=mid;
        //         low=mid+1;
        //     }else{
        //         if(nums[mid]>target){
        //             high=mid-1;
        //         }else{
        //            low=mid+1;
        //         }
        //     }
        // }
        // return new int[]{ans1,ans2};
        
    }
}