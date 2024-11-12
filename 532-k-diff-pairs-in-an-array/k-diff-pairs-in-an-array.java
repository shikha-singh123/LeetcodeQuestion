class Solution {
    public int findPairs(int[] nums, int k) {
       int i=0;
       int j=1;
       int n=nums.length;
       int count=0;
       Arrays.sort(nums);
       while(j<n){
            int left=nums[i];
            int right=nums[j];
            int diff=right-left;
            
            if(diff==k){
                count++;
            
            while(left==nums[i]){
                i++;
                if(i==n)
                return count;
            }
            while(right==nums[j]){
                j++;
                if(j==n) return count;
            }
            if(i==j){
                j++;
            }
            }else if(diff<k){
                j++;
            }else{
                i++;
                if(i==j){
                    j++;
                }
            }
       }
       return count;
    }
}