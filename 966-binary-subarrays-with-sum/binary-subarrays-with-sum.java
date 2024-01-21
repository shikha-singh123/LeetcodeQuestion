class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    return atmostK(nums,goal)-atmostK(nums,goal-1);
    }
    
    private int atmostK(int[]nums,int goal){

        int ans=0;
        int i=0;
        int j=0;
        int sum=0;
        int n=nums.length;
        for( j=0;j<n;j++){
            sum=sum+nums[j];
            while(sum>goal && i<=j){
                sum=sum-nums[i];
                i++;
            }
            ans=ans+(j-i+1);
        }
        return ans;
    }
}