class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=nums[0];
        int diff=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
        int curDiff=Math.abs(nums[i]);
             if(curDiff<diff){
                ans=nums[i];
                diff=curDiff;
             }
            if (diff==curDiff &&  nums[i]>ans){
                ans=nums[i];
            }

        }
        return ans;
    }
}