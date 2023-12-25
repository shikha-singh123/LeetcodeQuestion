class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer>result = new ArrayList<>();
         int n=nums.length;
         if(n==0){
             return result;
         }
         int el1=-1;
         int el2=-1;
         int count1=0,count2=0;
         for(int i=0;i<n;i++){
             if(count1==0 && el2!=nums[i]){
                 count1=1;
                 el1=nums[i];
             }else if(count2==0 && nums[i]!=el1){
                 count2=1;
                 el2=nums[i];
             }else if(el1==nums[i]){
                 count1++;
             }else if(el2==nums[i]){
                 count2++;
             }else {
                 count1--;
                 count2--;
             }

         }
              count1=0;
              count2=0;
         for(int i=0;i<n;i++){
             if(el1==nums[i]){
                 count1++;

             }else if(el2==nums[i]){
                 count2++;
             }
         }
             if(count1>n/3){
                 result.add(el1);
             } if(count2>n/3){
                 result.add(el2);
             }
         
             return result;

         }

    }
















































































      