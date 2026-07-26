class Solution {
    public int number(int num){
        int newsum=0;
        while(num!=0){
            int ld=num%10;
            newsum+=ld*ld;
            num/=10;
        }
        return newsum;
    }
    HashMap<Integer,Integer> mp=new HashMap<>();
    public boolean isHappy(int n) {
        int org=n;
        while(n!=1){
           int num=number(n);
           if(!mp.containsKey(num)){
              mp.put(num,1);
           }else{
              return false;
           }
           n=num;
        }
        return true;
        
        
    }
}