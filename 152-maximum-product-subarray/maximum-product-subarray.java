class Solution {
    public int maxProduct(int[] nums) {
        //Brute force
        //  int n=nums.length;
        //  int maxi= Integer.MIN_VALUE;
        //  for(int i=0;i<n;i++){
        //  int product=1;
        //      for(int j=i;j<n;j++){
        //          product*=nums[j];
        //          maxi=Math.max(maxi,product);
        //      }
        //  }
        //  return maxi;
         
        //Optimal solution with time complexity O(n) and space complexity O(1).
        int n=nums.length;
        int leftProduct=1;
        int rightProduct=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
        //check 0 condition
        leftProduct=leftProduct==0? 1:leftProduct;
        rightProduct=rightProduct==0? 1:rightProduct;
        //prefix product
        leftProduct*=nums[i];
        //suffix product
        rightProduct*=nums[n-1-i];
         ans=Math.max(ans,Math.max(leftProduct,rightProduct));

    }
    return ans;
    }
}