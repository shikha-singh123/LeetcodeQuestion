class Solution {
    public int[] decompressRLElist(int[] nums) {
         int n=nums.length;
         ArrayList<Integer> list=new ArrayList<>();
         int sum=0;
         
         for(int i=0;i<n-1;i=i+2){
            
         int freq=nums[i];
         int value=nums[i+1];
         sum=sum+freq;
         while(freq>0){
            list.add(value);
            freq--;
         }
         }
        
        int arr[]=new int[sum];
        for(int i=0;i<sum;i++){
            arr[i]=list.get(i);
        }
        return arr;
 
      }
}