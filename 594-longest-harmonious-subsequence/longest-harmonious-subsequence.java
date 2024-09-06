class Solution {
    public int findLHS(int[] nums) {
        int ret=0;
        HashMap<Integer,Integer> hm = new HashMap();
        for(int num : nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

       for(int key : hm.keySet()){
            if(hm.containsKey(key+1))
            {
                ret=Math.max(ret, hm.get(key) + hm.get(key+1));
            }
        }
        return ret;
    }
}