class Solution {
    HashMap<Integer,Integer> mp=new HashMap<>();
    public void findsubcnt(int[] nums, int i, int len){
        HashSet<Integer> st=new HashSet<>();
        int sizee=i+len;
        for(int j=i; j<sizee; j++){
            if(st.add(nums[j]))
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
        }
    }
    public int largestInteger(int[] nums, int k) {
        for(int i=0; i<=nums.length-k; i++){
            findsubcnt(nums,i,k);
        }
        int max=-1;
        for(int i=0; i<nums.length; i++){
            int a=mp.get(nums[i]);
            if(a==1){
                max=Math.max(nums[i],max);
            }

        }
        // if(nums.length==k) return 0;
        return max;

        
    }
}