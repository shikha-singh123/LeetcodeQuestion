class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int max=Math.max(nums1[nums1.length-1][0],nums2[nums2.length-1][0]);
        int [][]ans=new int [max][2];

        for(int []ints:nums1){
            ans[ints[0]-1][0]=ints[0];
            ans[ints[0]-1][1]=ans[ints[0]-1][1]+ints[1];
        }
        for(int []ints:nums2){
            ans[ints[0]-1][0]=ints[0];
            ans[ints[0]-1][1]=ans[ints[0]-1][1]+ints[1];
        }
        int count=0;

        for(int []an:ans) if(an[0]!=0) count++;

              int[][]fans=new int[count][2];
              count=0;
              for(int []an:ans){
                if(an[0]!=0){
                    fans[count++]=an;
                }
              }
                    return fans;

    }
}