import java.util.HashMap;
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
            HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i+=2){
        int count=1;
            if( i+1<n && nums[i]==nums[i+1]){
                count++;
            }
                   map.put(nums[i],count);
        }

        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
               


        
        return -1;
    }
}