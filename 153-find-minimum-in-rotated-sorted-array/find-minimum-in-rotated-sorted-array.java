class Solution {
    public int findMin(int[] nums) {
        //Approach using Binary Search
        int low=0;
        int high=nums.length-1;
        //if anything is given as rotated and sorted in an array
        //Always look for finding the sorted halves
        int ans=Integer.MAX_VALUE; 
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                //means ki left half sorted hai
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;

        // //Approach using normal linear search with TC-:O(n)
        // int n=nums.length; 
        // int min=Integer.MAX_VALUE;
        // for(int i=0; i<n; i++){
        //     min=Math.min(min,nums[i]);
        // }
        // return min;
        
    }
}