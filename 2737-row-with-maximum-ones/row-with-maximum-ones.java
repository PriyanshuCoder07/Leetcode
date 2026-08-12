class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int ans[]=new int[2];
        int maxones=0;
        for(int row=0; row<rows; row++){
            int cnt=0;
            for(int col=0; col<cols; col++){ 
                if(mat[row][col]==1){
                    cnt++;
                }
            }
            if(cnt>maxones){
                maxones=cnt;
                ans[0]=row;
                ans[1]=cnt;
            }
        }

        return ans;

        // int n=mat.length; 
        // int m=mat[0].length;
        // int ans[]=new int[2];
        // int maxcnt=0;
        // for(int i=0; i<n; i++){
        //     int cnt=0;
        //     for(int j=0; j<m; j++){
        //         if(mat[i][j]==1)cnt++;
        //     }
        //     if(cnt>maxcnt){
        //         maxcnt=cnt;
        //         ans[0]=i;
        //         ans[1]=cnt;
        //     }
        // }
        // return ans;
        
    }
}