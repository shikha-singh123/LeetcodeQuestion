class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                break;
            }else if(nums[mid]<target){
                left=mid+1;
                ans=left;
            }else{
                right=mid-1;
                ans=mid;

            }
        }
        return ans;
    }
}