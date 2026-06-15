class Solution {
    public int totalMoney(int n) {
        int money=0;
        int saving=1;
        int monday=1;
        for(int i=1; i<=n; i++){
             if(i!=1 && i%7==1){
                monday++;
                saving=monday;
            }
            money+=saving;
            saving++;
            // if(i!=1 && i%7==1){
            //     monday++;
            //     saving=monday;
            // }
            
        }
        return money;
    }
}