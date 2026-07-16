class Solution {
    public int search(int[] nums, int target) {
        //Approach using Binary Search 
        //since the array is sorted and rotated
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            //if not the case then we will the check the sorted halves
            if(nums[low]<=nums[mid]){
                //this is the case where we can find that left half may be sorted
                if(nums[low]<=target && target<=nums[mid]){
                    //left half me hi element hoga
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                //wo case hai nums[low]>nums[mid]
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;


        // //Approach using linear search having TC O(log N)
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target) return i;
        // }
        // return -1;
        
    }
}