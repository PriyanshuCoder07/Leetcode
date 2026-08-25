class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> mp=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            // mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            mp.add(nums[i]);
        }
        int num=k;
        for(int n:mp){
            if(mp.contains(num)){
                num+=k;
            }
        }
        return num;
        
    }
}