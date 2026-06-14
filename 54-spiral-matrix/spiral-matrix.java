class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //Yad Rakna--> Iska bs ek hi soln hai optimal 
        //Number of rows
        int n=matrix.length; 
        //No of coulums
        int m=matrix[0].length; 
        int left=0 ,top=0;
        int right=m-1; 
        int bottom=n-1;
        List<Integer> ans=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
            ans.add(matrix[top][i]);
            }
            top++;
            //Think for edge case like if only a single row is given 
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i-- ){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){

                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ans;
    }
}