class Solution {
    public boolean findTarget(int[] arr, int m, int target){
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; 
        int m=matrix[0].length;
        for(int row=0; row<n; row++){
            if(findTarget(matrix[row],m,target)) return true;
        }
        return false;














        // Brute force normally traverse all the array and having the time complexity as n*m
        // for(int row=0; row<n; row++){
        //     for(int col=0; col<m; col++){
        //         if(matrix[row][col]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
    }
}