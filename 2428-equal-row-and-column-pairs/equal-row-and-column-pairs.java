class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0; i<grid.length; i++){
            int row[]=grid[i];
            for(int j=0; j<grid[i].length; j++){
                int col[]=new int[n];
                for(int k=0; k<n; k++){
                    col[k]=grid[k][j];
                }
                if(Arrays.equals(row,col))count++;
                
            }
        }
        return count;
        
    }
}