class Solution {
        List<List<Integer>>result=new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        if(nums.length<3 || nums==null)
        return result;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i==0 || nums[i-1]!=nums[i]){
                twoSortedArray(i+1,n-1,nums,0-nums[i]);
            }
        }
        return result;

    }
    void twoSortedArray(int i,int j,int[]nums,int target){
        int a1=nums[i-1];
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                List<Integer>list=new ArrayList();
                list.add(a1);
                list.add(nums[i]);
                list.add(nums[j]);
                result.add(list);
                //duplicate b
                while(i<j && nums[i]==nums[i+1])i++;
                //duplicate c
                while(i<j && nums[j]==nums[j-1])j--;
                i++;
                j--;
            
        }
    }
}
}