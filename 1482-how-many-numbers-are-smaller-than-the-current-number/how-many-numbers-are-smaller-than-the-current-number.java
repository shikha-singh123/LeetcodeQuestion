class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []count=new int [101];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
            for(int i=1;i<=100;i++){
                count[i]+=count[i-1];
            }
            int []result=new int[n];
       
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            result[i]=0;
        }else{
            result[i]=count[nums[i]-1];
        }
       }
       return result;
        }
}