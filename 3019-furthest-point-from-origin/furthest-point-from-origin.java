class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int space=0;
        int left=0;
        int right=0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i)=='L'){
                left++; 
            }else if(moves.charAt(i)=='R'){
                right++;
            }else{
                space++;
            }
        }
        return Math.abs(right-left)+space;
    }
}