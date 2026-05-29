class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        if(n==1)return new int[]{-1};
        int ans[]=new int[n];
        ans[n-1]=-1;
        ans[n-2]=arr[n-1];
        int max=arr[n-1];
        for(int i=n-3; i>=0; i--){
            max=Math.max(max,arr[i+1]);
            ans[i]=max;
        }
        return ans;
        
    }
}