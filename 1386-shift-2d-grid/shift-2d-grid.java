class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=grid.length; 
        int m=grid[0].length;
        // int a[][]=new int[n][m];
        int ele=n*m;
        int nk=k%ele;
        for(int i=0; i<grid.length; i++){
            ans.add(new ArrayList<>());
        }
        if(nk==0){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    ans.get(i).add(grid[i][j]);
                }
            }
        }else{
            // int a[][]=new int[n][m];
            while(nk!=0){
                 int a[][]=new int[n][m];

                for(int i=0; i<n; i++){
                    for(int j=0; j<m; j++){
                        if(j<m-1){
                           a[i][j+1]=grid[i][j];

                        }else{
                            if(i!=n-1){
                               a[i+1][0]=grid[i][j];
                            }else{
                                a[0][0]=grid[i][j];
                            }
                        }                   
                    }
                }
                grid=a;
                nk--;
            }
        }
        if(k%ele!=0){
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    ans.get(i).add(grid[i][j]);
                }
            }
        }
        return ans;
        
    }
}