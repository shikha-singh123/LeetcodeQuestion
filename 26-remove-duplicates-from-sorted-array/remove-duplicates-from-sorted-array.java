class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        // for( i=0;i<n;i++){
            for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
            // else{
                nums[i]=nums[j];
            // }
            }
            }
        // }
          return i+1;

    //    int i=0;
    //  for(int j=1;j<nums.length;j++){
    //     if(nums[i]!=nums[j]){
    //         i++;
    //         nums[i]=nums[j];
    //     }
    //  }
    //  return i+1;
    }
}