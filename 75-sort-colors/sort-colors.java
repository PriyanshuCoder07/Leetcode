class Solution {
    public void sortColors(int[] nums) {
        //Dutch National flag Algorithm 
        //take 3 pointers 
        int low=0;
        int mid=0; 
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++; 
                mid++;
            }else if(nums[mid]==1){
                //because 0->low-1 all 0's && low->mid-1 all 1's if the next idx is 1 then its ok no need to do anything it will still be sorted
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        
    }
}