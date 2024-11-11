class Solution {
    public long findTheArrayConcVal(int[] nums) {
        List<String> list=new ArrayList<>();
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(i!=j){
                list.add(nums[i]+""+nums[j]+"");
                i++;
                j--;
            }else{
                list.add(nums[i]+"");
                i++;
                j--;
            }
        }
        long ans=0;
        for(String s:list){
            ans+=Long.parseLong(s);

        }
        return ans;
    }
}