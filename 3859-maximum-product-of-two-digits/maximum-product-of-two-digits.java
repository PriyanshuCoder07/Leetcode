class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int num=n%10;
            arr.add(num);
            n/=10;
        }
        int ans[]=new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            ans[i]=arr.get(i);
        }
        int max=0;   
        for(int i=0; i<ans.length; i++){
            int num=0;
            for(int j=i+1; j<ans.length; j++){
                num=ans[i]*ans[j];
                max=Math.max(num,max);
            }
        }
        return max;
    }
}