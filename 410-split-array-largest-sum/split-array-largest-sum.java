class Solution {
    public int splitArray(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i],maxi);
            sum=sum+nums[i];
        }
        int low=maxi;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            int painters=countPts(nums,mid);
        if(painters>k){
        low=mid+1;
        
        }else
        high=mid-1;
    }
    return low;
}
    static int countPts(int[]nums,int paints){
         int painters=1;
         int splitPaint=0;
         for(int i=0;i<nums.length;i++){
             if(splitPaint+nums[i]<=paints){
                  splitPaint+=nums[i];
             }else{
                 painters++;
                 splitPaint=nums[i];
             }
         }
         return painters;
    }
}