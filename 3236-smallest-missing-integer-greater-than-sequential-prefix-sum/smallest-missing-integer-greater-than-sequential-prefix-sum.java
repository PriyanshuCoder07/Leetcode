class Solution {
    public int check(int i, int[] nums){
        int sum=nums[0];
        for(int j=i; j<nums.length; j++){
            if(nums[j]==nums[j-1]+1){
                sum+=nums[j];
            }else{
                break;
            }
        }
        return sum;
    }
    public int missingInteger(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        int sum=check(1,nums);
        while(mp.containsKey(sum)){
            sum++;
        }
        return sum;
        
    }
}