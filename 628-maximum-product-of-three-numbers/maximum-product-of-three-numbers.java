class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int negcnt=0;
        for(int i=0; i<n; i++){
            if(nums[i]<0) negcnt++;
        }
        if(negcnt==0 || negcnt==n) return nums[n-1]*nums[n-2]*nums[n-3];
        else if(negcnt<=n-1 && (nums[0]*nums[1]>nums[n-2]*nums[n-3])){
            return nums[0]*nums[1]*nums[n-1];
        }    
        // }else{
        //     if(n>=5 && negcnt%2==1){
        //         int num1=nums[0];
        //         int num2=nums[1];
        //         int num3=nums[n-3];
        //         int num4=nums[n-2];
        //         int num5=nums[n-1];
        //         if(num1*num2>num3*num4) return num1*num2*num5;
        //     }
        // }
        return nums[n-1]*nums[n-2]*nums[n-3];

    }
}