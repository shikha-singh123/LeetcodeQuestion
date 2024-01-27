class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int n=nums.length;
        int count=0;
        int prefixSum=0;
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            if(prefixSum==k) count++;
            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            if(map.containsKey(prefixSum)){
                map.put(prefixSum,map.get(prefixSum)+1);
            }else{
                map.put(prefixSum,1);
            }
        }
        return count;
      
    }
}