class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        for (int i=0;i<n;i++){

        int left=i;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else 
            right=mid-1;
        }    
        }  
        return-1;
    }
}