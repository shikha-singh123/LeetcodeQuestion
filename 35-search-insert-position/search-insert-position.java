class Solution {
    public int searchInsert(int[] nums, int target) {
         int n=nums.length;
        int ans=n;
            int left=0;
            int right=n-1;
            
            while(left<=right){
                int mid=(left+right)/2;
                if(nums[mid]==target){
                    return ans=mid;
                }else if(nums[mid]<target){
                    left=mid+1;
                }else {
                    right=mid-1;
                    ans=mid;
                }

            

        }
        return ans;

    }
}