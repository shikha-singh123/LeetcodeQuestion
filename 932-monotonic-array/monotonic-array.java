class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1) return true;
        if(nums[0]-nums[nums.length-1]>0){
            return decres(nums);
        }
        return incres(nums);
    }
    public static boolean decres(int []nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                return false;
            }
        }
                return true;
        }
    public static boolean incres(int []nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
                return true;
        
    }
}