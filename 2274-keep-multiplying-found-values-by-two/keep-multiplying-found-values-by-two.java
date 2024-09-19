class Solution {
    public int findFinalValue(int[] nums, int original) {
       int j=0;
       while(j<nums.length){
        if(nums[j]==original){
            original=original*2;
                j=0;
        }else
                   j++;
        
       }
       return (original);
    }
}