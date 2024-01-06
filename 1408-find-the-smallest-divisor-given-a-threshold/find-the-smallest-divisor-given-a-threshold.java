class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
         int maxi=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             maxi=Math.max(nums[i],maxi);
         }
         int low=1;
         int high=maxi;
         while(low<=high){
             int mid=(low+high)/2;
             if(sumByDiv(nums,mid)<=threshold){
                 high=mid-1;
             }else{
                 low=mid+1;
             }
         }
             return low;
         
    }
    static int sumByDiv(int[]nums,int div){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(int) Math.ceil ((double)nums[i]/(double)div);
        }
        return sum;
    }
}