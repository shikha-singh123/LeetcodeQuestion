class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val=(long)m*k;
        if(val>bloomDay.length) return -1;

        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
        mini=Math.min(bloomDay[i],mini);
         maxi=Math.max(bloomDay[i],maxi);

    }
    int low=mini;int high=maxi;
    while(low<=high){
        int mid=(low+high)/2;
        if(possible(bloomDay,mid,m,k)){
            high=mid-1;
        }else
        low=mid+1;
    }
    
    return low;

    }
    static boolean possible(int[]bloomDay,int day,int m,int k){
        int count=0;
        int noOfBouquet=0;
        int n= bloomDay.length;
        for(int i=0;i<n;i++){
          if(bloomDay[i]<=day){
              count++;
          }else{
              noOfBouquet+=count/k;
              count=0;
          }
        }
         noOfBouquet+=count/k;
              return noOfBouquet>=m;
    } 
}