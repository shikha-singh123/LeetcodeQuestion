class Solution {
    public boolean check(int[] nums) {
       int n=nums.length;
       int pivot=0;
       boolean isIncreasing =true;
       for(int i=1;i<n;i++){
           if(nums[i]<nums[i-1]){
              pivot=i;
               isIncreasing =false;
               break;
           }
       }
       if(isIncreasing){
           return true;
       }
       int rotation=n-pivot;
       if(rotation>n){
           return false;
       }
       int rotatedArray[]=new int[n];
        for(int i=0;i<n;i++){
            rotatedArray[(i+rotation)%n]=nums[i];
        }
        for(int i=1;i<n;i++){
            if(rotatedArray[i]<rotatedArray[i-1])
            return false;
        }
        return true;
      

}
}