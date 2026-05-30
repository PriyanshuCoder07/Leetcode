class Solution {
    public int longestConsecutive(int[] nums) {
        //Optimal Solution
        int n=nums.length;
        if(n==0) return 0;
        int longest=1; 
        HashSet<Integer> st=new HashSet<>();
        for(int i=0; i<n; i++){
            st.add(nums[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                int count=1;
                int x=it;
                while(st.contains(x+1)){
                    count++;
                    x+=1;
                }
                longest=Math.max(count,longest);


            }
        }
        return longest;









        // //Better solution
        // int n=nums.length;
        // int lastSmallest=Integer.MIN_VALUE;
        // int count=0;
        // int longest=1;
        // Arrays.sort(nums);
        // for(int i=0; i<n; i++){
        //     if(nums[i]-1==lastSmallest){
        //         count++;
        //         lastSmallest=nums[i];
        //     }else if(nums[i]!=lastSmallest){
        //         count=1;
        //         lastSmallest=nums[i];
        //     }
        //     longest=Math.max(longest,count);
        // }
        // return longest;

      //--> Brute force    
    // public boolean linearSearch(int x, int nums[]){
    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i]==x) return true;
    //     }
    //     return false;
    // }
    // public int longestConsecutive(int[] nums) {
    //     //Brute force
    //     int longest=1;
    //     int n=nums.length; 
    //     for(int i=0; i<n; i++){
    //         int x=nums[i];
    //         int count=1;
    //         while(linearSearch(x+1,nums)==true){
    //             count++;
    //             x+=1;
    //         }
    //         longest=Math.max(longest,count);
    //     }
    //     return longest;
    }
}