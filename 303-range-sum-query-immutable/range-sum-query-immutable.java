class NumArray {

         int total = 0;
    List<Integer> prefix = new ArrayList<>();
    public NumArray(int[] nums) {
        for(int n:nums){
            total+=n;
            prefix.add(total);
        }
    }
    
    public int sumRange(int left, int right) {
         int rightSum = prefix.get(right);
        int leftSum=0;
        if(left>0){
            leftSum = prefix.get(left-1);
        }
        return rightSum-leftSum;
    }
}

