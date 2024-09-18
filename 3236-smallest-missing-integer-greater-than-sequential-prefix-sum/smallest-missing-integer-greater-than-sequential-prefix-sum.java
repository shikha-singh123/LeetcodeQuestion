class Solution {
    public int missingInteger(int[] nums) {
       int msum=nums[0];
       for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]==nums[i]+1){
            msum+=nums[i+1];
        }else break;
         
       }
       Arrays.sort(nums);
         for(int i:nums){
            if (i==msum) msum++;
          }
           if(msum==nums[0]) 
           return msum+1;
         
         return msum;

       
    }
}