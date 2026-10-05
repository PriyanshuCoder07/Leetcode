class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Better Solution
        HashSet<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1; j<n; j++){
                int third=-(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }else{
                    set.add(nums[j]);
                }                
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(st);
        return ans;



        // // Brute force Approach 

        // HashSet<List<Integer>> st=new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(temp);
        //                 st.add(temp);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans=new ArrayList<>();
        // // To add all elements of one collection to another use .addAll();
        // ans.addAll(st);
        // return ans;
        
    }
}