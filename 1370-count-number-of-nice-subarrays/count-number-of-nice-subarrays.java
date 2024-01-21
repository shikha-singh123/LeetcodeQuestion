class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostK(nums,k)-atmostK(nums,k-1);
    }
        private int atmostK(int []nums,int k){
        int count=0;
        int start=0;
        int end=0;
        int ans=0;
        int n=nums.length;
        for( start=0;start<n;start++){
            if(nums[start]%2!=0){
                count++;
            }
            while(count>k && end<=start){
                if(nums[end++]%2!=0)count--;
            }
            ans=ans+(start-end+1);
        }
        return ans;
    }
}