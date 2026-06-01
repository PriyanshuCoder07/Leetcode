class Solution {
    public void setZeroes(int[][] matrix) {
        //Better Approach
        int n=matrix.length; 
        int m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    // //Brute Force
    // public void setRow(int i, int a, int matrix[][]){
    //     for(int j=0; j<a; j++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=Integer.MIN_VALUE;
    //         }
    //     }
    // }
    // public void setCol(int i, int b, int matrix[][]){
    //     for(int j=0; j<b; j++){
    //         if(matrix[j][i]!=0){
    //             matrix[j][i]=Integer.MIN_VALUE;
    //         }
    //     }
    // }
    // public void setZeroes(int[][] matrix) {
    //     int n=matrix.length; 
    //     int m=matrix[0].length; 
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(matrix[i][j]==0){
    //                 setRow(i,m,matrix);
    //                 setCol(j,n, matrix);
    //             }
    //         }
    //     } 
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(matrix[i][j]==Integer.MIN_VALUE){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }   

    }
}