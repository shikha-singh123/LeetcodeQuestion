class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count=0;
            }else{
                count++;
                ans=Math.max(count,ans);
            }

        }
        return ans;
    }
}