class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        //1st approach
    //     Set<Integer>set=new HashSet<>();
    //    for (int num:nums){
    //        if(!set.add(num)){
    //            set.remove(num);
    //        }

    //    }
    //    return set.iterator().next();
    //2nd approach
    // Arrays.sort(nums);
    // for(int i=0;i<n-1;i+=2){
    //     if(nums[i]!=nums[i+1]){
    //         return nums[i];
    //     }
    //     }
    //         return nums[n-1];
    //     }
    // }
    
//3rd approach
int xor=0;
for(int num:nums){
    xor^=num;
}
return xor;
}
}