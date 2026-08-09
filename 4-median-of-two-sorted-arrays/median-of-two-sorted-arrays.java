class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length; 
        int m=nums2.length;
        int x=n+m;
        int nums3[]=new int[x];
        //using two pointer
        int i=0;
        int j=0;
        int ptr=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                nums3[ptr]=nums1[i];
                i++;
                ptr++;
            }else{
                nums3[ptr]=nums2[j];
                j++;
                ptr++;
            }
        }

        //Remaining ones
        while(i<n){
            nums3[ptr]=nums1[i];
            i++;
            ptr++;
        }
        while(j<m){
            nums3[ptr]=nums2[j];
            j++;
            ptr++;
        }
        if(x%2==1) return (double)nums3[x/2];
        double median=((double)nums3[x/2]+nums3[(x/2)-1])/2;
        return median;













        //Extreme brute force
        // int[] nums3=new int[x];
        // int ptr=0;
        // for(int i=0; i<n; i++){
        //     nums3[ptr]=nums1[i];
        //     ptr++;
        // }
        // for(int i=0; i<m; i++){
        //     nums3[ptr]=nums2[i];
        //     ptr++;
        // }
        // Arrays.sort(nums3);

        // if(x%2!=0) return (double)nums3[x/2];
        // double sum=((double)nums3[x/2]+nums3[(x/2)-1])/2;
        // return sum;
    }
}