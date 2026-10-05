class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length; 
        TreeSet<Integer> st=new TreeSet<>();
        for(int i=0; i<n; i++){
            st.add(nums[i]);

        }
        int ptr=0;
        for(int num:st){
            nums[ptr]=num;
            ptr++;
        }
        return st.size();
        
    }
}