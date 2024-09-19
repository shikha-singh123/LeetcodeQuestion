class Solution {
    public int unequalTriplets(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=i+2;k<nums.length;k++){
                    if(i<j && j<k){
                    if(nums[i]!=nums[j] && nums[j]!=nums[k] && nums[i]!=nums[k]){
                        count++;
                    }
                }
                }
            }
        }
        return count;
    }
}