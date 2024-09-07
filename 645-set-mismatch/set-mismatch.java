class Solution {
    public int[] findErrorNums(int[] nums) {
        int []arr={1,1};
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(int i=1;i<nums.length+1;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    arr[0]=i;
                }
            }else{
                arr[1]=i;
            }
        }
        return arr;
    }
}