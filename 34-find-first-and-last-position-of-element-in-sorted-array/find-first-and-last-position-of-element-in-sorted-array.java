class Solution {
    public int[] searchRange(int[] nums, int target) {

        // int n=nums.length;
        // int left=0;
        // int right=n-1;
        // while(left<=right){
        //    int mid=(left+right)/2;
        //    if(nums[mid]<target){
        //        left=mid+1;
        //        if(nums[left]==target){
        //            return left;
        //        }
        //    }else if(nums[mid]>target){
        //        right=mid-1;
        //        if(nums[right]==target){
        //            return right;
        //        }
        //    }
        // }
        int first=-1;
        int last=-1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
               if(first==-1){
                   first=i;
                   last=i;
               }else{
                   last=i;
               }
           }
       }
       int[]position={first,last};
       return position;
    }
}