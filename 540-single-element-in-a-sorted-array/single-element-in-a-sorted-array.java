// import java.util.HashMap;
class Solution {
    public int singleNonDuplicate(int[] nums) {
       int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!= nums[mid+1]){
            return nums[mid];
        } if((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]==nums[mid+1])){
           low=mid+1;
        }else{
            high=mid-1;
        }
    }
        return -1;

 }
}
//Brute force approach
//         int n=nums.length;
//             HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<n;i+=2){
//         int count=1;
//             if( i+1<n && nums[i]==nums[i+1]){
//                 count++;
//             }
//                    map.put(nums[i],count);
//         }

//         for(int key:map.keySet()){
//             if(map.get(key)==1){
//                 return key;
//             }
//         }
//                return -1;
//     }
// }
