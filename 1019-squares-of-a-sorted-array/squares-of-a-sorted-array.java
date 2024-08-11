class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int left=0;
        int right=n-1;

        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                ans[i]=nums[left]*nums[left];
                left++;
            }else{
                ans[i]=nums[right]*nums[right];
                right--;
            }

        }
        return ans;
    }
}