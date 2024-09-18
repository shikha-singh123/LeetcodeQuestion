class Solution {
    public int findMaxK(int[] nums) {
      HashSet <Integer>hs=new HashSet<>();
      int  ans=-1;
     for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
        if(hs.contains(-nums[i])){
            ans=Math.max(ans,Math.abs(nums[i]));
        }
     }
     return ans;
    }
}