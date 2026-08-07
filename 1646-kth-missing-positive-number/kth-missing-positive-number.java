class Solution {
    public int findKthPositive(int[] arr, int k) {
        int val=1;
        int ptr=0;
        while(k!=0){
            if(ptr<arr.length && arr[ptr]==val){
                ptr++;
            }else{
                k--;
                if(k==0)return val;
            }
            val++;
        }
        return val;








        // if(k<arr[0]) return k;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]<=k)k++;
        //     else break;
        // }
        // return k;
        
    }
}