class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length; 
        int cnt[]=new int[1001];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int ct=0;
            for(int j=0; j<arr.length; j++){
                if(mp.containsKey(arr[i]))continue;
                else if(arr[i]==arr[j]){
                    ct++;
                }
            }
            if(cnt[ct]!=0)return false;
            cnt[ct]=ct;
            mp.put(arr[i],ct);
        }
        return true;

        
    }
}