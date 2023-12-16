class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
       if(n==0){
           return 0;
       }
       int arr[]=new int[n];
       int j=0;
        arr[j++] = nums[0];
       for(int i=1;i<n;i++){
           if(nums[i]!=nums[i-1]){
            arr[j++]=nums[i];
           }
       }
        for(int k=0;k<j;k++){
            nums[k]=arr[k];
        }
    
    return j;
    }
}