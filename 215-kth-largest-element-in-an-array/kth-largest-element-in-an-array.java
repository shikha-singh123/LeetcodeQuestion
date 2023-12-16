class Solution {
    public int findKthLargest(int[] nums, int k) {
    //    Arrays.sort(nums);
    //    return nums[nums.length-k];
       PriorityQueue<Integer>max=new PriorityQueue<Integer>(Collections.reverseOrder());
       
        for(int i=0;i<nums.length-k+1;i++){
            max.add(nums[i]);
        }
        for(int i=nums.length-k+1;i<nums.length;i++){
            if(nums[i]<max.peek()){
                max.poll();
                max.add(nums[i]);
            }
        }
          return  max.peek();


    }
}