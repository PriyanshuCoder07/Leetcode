class Solution {
    public boolean binarySearch(int arr[], int value){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==value) return true;
            else if(arr[mid]<value) low=high+1;
            else high=mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length; 
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;
        while(low<=high){
            int mid=(low+high);
            int r=mid/col;
            int c=mid%col;
            if(matrix[r][c]==target) return true;
            else if(matrix[r][c]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        // int r
        // for(int i=0; i<matrix.length; i++){
        //    if(binarySearch(matrix[i],target)) return true;
        // }
        return false;
    }
}