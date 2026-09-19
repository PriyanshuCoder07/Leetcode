class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            String s=String.valueOf(nums[i]);
            for(int j=0; j<s.length(); j++){
                int n=s.charAt(j)-'0';
                arr.add(n);
            }
        }
        int res[]=new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i]=arr.get(i);
        }
        return res;
        
    }
}