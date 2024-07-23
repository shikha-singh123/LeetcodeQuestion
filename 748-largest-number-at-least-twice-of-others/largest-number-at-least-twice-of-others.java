class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int largest=nums[0];
        int largestIndex=0;
        for(int i=1;i<n;i++){
            if(nums[i]>largest){
                largest=nums[i];
                largestIndex=i;
            }
        }
         for (int i = 0; i < n; i++) {
            if (i != largestIndex && nums[i] * 2 > largest) {
                return -1;
            }
        }
        
        return largestIndex;
    }
}