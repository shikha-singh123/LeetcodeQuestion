class Solution {
    public int nextGreaterElement(int n) {
        char [] nums = (""+n).toCharArray();

        int i=nums.length-1;
        while(i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        if(i==0) return -1;
        i--;
         int j=nums.length-1;
        while(nums[j]<=nums[i]){
            j--;
        }
        swap (nums,i,j);
        reverse(nums,i+1,nums.length-1);

        long ansLong=Long.parseLong(new String(nums));
        return (ansLong>Integer.MAX_VALUE)?-1: (int) ansLong;
    }
    private void swap(char []nums,int i,int j){
        char temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void reverse(char[]nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}