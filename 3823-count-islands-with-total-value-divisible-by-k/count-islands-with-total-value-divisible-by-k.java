class Solution {
      int directions[][]={{0,1},{0,-1},{-1,0},{1,0}};
    public long dfs(int i, int j, int[][] grid){
        long sum=grid[i][j];
        grid[i][j]=0;
        for(int dir[]:directions){
            int ni=i+dir[0];
            int nj=j+dir[1];

            if(ni>=0 && ni<grid.length && nj>=0 && nj<grid[0].length && grid[ni][nj]>0){
                sum+=dfs(ni,nj,grid);
            }
        }
        return sum;

    }
    public int countIslands(int[][] grid, int k) {
        int rows=grid.length; 
        int cols=grid[0].length; 
        int count=0;

        // int directions[][]={{0,1},{0,-1},{-1,0},{1,0}};
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]>0){

                    long sum=dfs(i,j,grid);
                    if(sum%k==0) count++;
                }
            }
        }
        return count;
        
    }
}