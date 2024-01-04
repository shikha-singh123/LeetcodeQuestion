class Solution {
    public int[] searchRange(int[] nums, int target) {
     int lb=lowerbound(nums,target);
     if(lb==nums.length || nums[lb]!=target)
     return new int []{-1,-1};

     return new int[]{lb,upperbound(nums,target)-1};
    }

        public static int lowerbound(int[]nums,int target ){
        int n=nums.length;
        int left=0;
        int right=n-1;
        int ans=n;
        while(left<=right){
           int mid=(left+right)/2;
           if(nums[mid]>=target){
               ans=mid;
               right=mid-1;
              } else{
               left=mid+1;
                }
          
           }
           return ans;
    }
            public static int upperbound(int[]nums,int target ){
                int n=nums.length;
        int left=0;
        int right=n-1;
        int ans=n;
            while(left<=right){
           int mid=(left+right)/2;
           if(nums[mid]>target){
               ans=mid;
               right=mid-1;
              } else{
               left=mid+1;
                }
          
           }
           return ans;
        }
}
        //brute force approach
//         int first=-1;
//         int last=-1;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==target){
//                if(first==-1){
//                    first=i;
//                    last=i;
//                }else{
//                    last=i;
//                }
//            }
//        }
//        int[]position={first,last};
//        return position;
//     }
// }