class Solution {
    public int countElements(int[] nums) {
       int count=0;
       Arrays.sort(nums);
       int l=nums[0];
       int r=nums[nums.length-1];
       for(int i=1;i<nums.length-1;i++){
        if(nums[i]>l && nums[i]<r){
            count++;
        }
       }
       return count;
        
    }
}