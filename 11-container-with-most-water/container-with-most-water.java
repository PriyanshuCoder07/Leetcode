class Solution {
    public int maxArea(int[] height) {
        int i=0; 
        int maxarea=0;
        int j=height.length-1;
        while(i<j){
            int width=j-i;
            int m=Math.min(height[i],height[j]);
            int area= width * m;
            maxarea = Math.max(maxarea,area);
            if(height[i]<height[j]) 
            
            
            {
                i++;
            }
            else{ 
                j--;
            }

        }
        return maxarea;
    }
}