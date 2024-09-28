class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
         
           int ans[]=new int[points.length];
           for(int i=0;i<points.length;i++){
            ans[i]=points[i][0];

           }
           int max=0;
           int diff=0;
           Arrays.sort(ans);
           for(int i=1;i<points.length;i++){
              diff=ans[i]-ans[i-1];
              if(diff>max){
                max=diff;
              }
           }
           return max;


    }
}