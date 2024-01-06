class Solution {
    public int shipWithinDays(int[] weights, int days) {
         int n=weights.length;
         int maxi=Integer.MIN_VALUE;
         int sum=0;
        for(int i=0;i<n;i++){
            maxi=Math.max(weights[i],maxi);
            sum+=weights[i];
        }
        int low=maxi;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(findDays(weights,mid)<=days){
               int noOfDays=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return low;
    }
     static int findDays(int[]weights,int cap){
        int days=1;
        int load=0;
        int n=weights.length;
        for(int i=0;i<n;i++){
            if(load+weights[i]>cap){
                days=days+1;
                load=weights[i];
            }else{
                load=load+weights[i];
            }
        }
            return days;
    }
}