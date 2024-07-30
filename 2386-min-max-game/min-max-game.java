class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        List<Integer> newNums=new ArrayList<>();
        for(int i=0;i<nums.length/2;i++){
            if(i%2==0){
                newNums.add(Math.min(nums[2*i],nums[2*i+1]));
            }else{
                newNums.add(Math.max(nums[2*i],nums[2*i+1]));
            }
        }
            return minMaxGame(newNums.stream().mapToInt(i->i).toArray());
    }
}