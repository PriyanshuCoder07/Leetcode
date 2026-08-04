class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        int left=Integer.MAX_VALUE;
        int right=0;
        for(int i=0; i<nums.length; i++){
            left=Math.min(nums[i],left);
            right=Math.max(nums[i],right);
            st.add(nums[i]);
        }
       
        // int val=left;
        while(left<right){
            if(st.contains(left)){
            }else{
                ans.add(left);
            }
            left++;
            // right--;
        }
        return ans;




















        // HashSet<Integer> st=new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     st.add(nums[i]);
        // }
        // Arrays.sort(nums);
        // for(int i=nums[0]; i<nums[nums.length-1]; i++){
        //     while(!st.contains(i)){
        //         ans.add(i);
        //         i++;
        //     }
        // }
        // return ans;
    }
}