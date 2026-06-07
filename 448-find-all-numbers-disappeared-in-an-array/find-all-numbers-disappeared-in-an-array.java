class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        for(int i=0; i<n; i++){
            st.add(nums[i]);
        }
        for(int i=1; i<=n; i++){
            while(!st.contains(i) && i<=n){
                ans.add(i);
                i++;

            }
        }
        return ans;
        
    }
}