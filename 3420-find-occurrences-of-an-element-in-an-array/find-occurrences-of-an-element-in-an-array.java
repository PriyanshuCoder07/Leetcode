class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n=nums.length; 
        int freq_x=0;
        int ans[]=new int[queries.length];
       ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i]==x){
                freq_x++;
                arr.add(i);
            }
        }
        for(int i=0; i<queries.length; i++){
            int y=queries[i];
            if(y>freq_x || freq_x==0){
                ans[i]=-1;
            // }else if(y==freq_x){
            //     ans[i]=arr.get(y-1);
            // }
            }
            else{
                ans[i]=arr.get(y-1);
            }
        }
        return ans;
    }
}