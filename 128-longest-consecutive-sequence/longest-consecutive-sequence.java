class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int curLen=1;
        if(nums.length==0 )
        return 0;
    
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            if(nums[i]==nums[i-1]+1){
                curLen++;
            }else{
                ans=Math.max(ans,curLen);
                curLen=1;
            }
        }
    }
         ans=Math.max(ans,curLen);
         return ans;
            
    }
}