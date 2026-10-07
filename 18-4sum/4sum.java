class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         HashSet<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                 HashSet<Long> set=new HashSet<>();
                for(int k=j+1; k<n; k++){
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long fourth=(long)target-sum;
                        if(set.contains(fourth)){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                            Collections.sort(temp);
                            st.add(temp);
                        }else
                            set.add((long)nums[k]);
                        
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        ans.addAll(st);
        return ans;
        


        // Brute force Approach 
        // HashSet<List<Integer>> st=new HashSet<>();
        // int n=nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         for(int k=j+1; k<n; k++){
        //             for(int l=k+1; l<n; l++){
        //                 if(nums[i]+nums[j]+nums[k]+nums[l]==target){
        //                     List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
        //                     Collections.sort(temp);
        //                     st.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans=new ArrayList<>();
        // ans.addAll(st);
        // return ans;
        
    }
}