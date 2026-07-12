class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        if(n==1) return new int[]{1};
        if(n==2 && arr[n-2]<arr[n-1]) return new int[]{1,2};
        int org[]=arr.clone();
        int nums[]=new int[n];
        Arrays.sort(arr);
        HashMap<Integer,Integer> mp=new HashMap<>();
        int rank=1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                nums[i]=rank;
                mp.put(arr[i],rank);
                rank++;

            }else{
                nums[i]=rank;
                mp.put(arr[i],rank);
            }
        }
        if(n>2){
            if(arr[n-2]!=arr[n-1]){
                nums[n-1]=rank;
                mp.put(arr[n-1],rank);
            }else{
                arr[n-1]=nums[n-2];
                mp.put(arr[n-1],nums[n-2]);
            }
        }
        for(int i=0; i<org.length; i++){
            int val=mp.get(org[i]);
            org[i]=val;
        }
        return org;
    }
}