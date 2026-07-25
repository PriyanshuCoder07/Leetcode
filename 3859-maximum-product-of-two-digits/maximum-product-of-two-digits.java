class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int num=n%10;
            arr.add(num);
            n/=10;
        }
        int max=0;  
        Collections.sort(arr);
        int s=arr.size();
        return arr.get(s-1)*arr.get(s-2); 
        // for(int i=0; i<arr.size(); i++){
        //     int num=0;
        //     for(int j=i+1; j<arr.size(); j++){
        //         num=arr.get(i)*arr.get(j);
        //         max=Math.max(num,max);
        //     }
        // }
        // return max;
    }
}