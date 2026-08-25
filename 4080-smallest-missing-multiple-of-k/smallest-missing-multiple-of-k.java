class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> st=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            // st.put(nums[i],st.getOrDefault(nums[i],0)+1);
            st.add(nums[i]);
        }
        int num=k;
        for(int n:st){
            if(st.contains(num)){
                num+=k;
            }
        }
        return num;
        
    }
}