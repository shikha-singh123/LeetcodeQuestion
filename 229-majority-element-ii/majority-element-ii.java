class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>list=new ArrayList<>();
        int k=n/3;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int element=entry.getKey();
            int count=entry.getValue();
            if(count>k){
                list.add(element);
            }
        }
return list;
       
    }
}