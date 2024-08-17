class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
       int count=0;
       for(int i=1;i<timeSeries.length;i++){
        if(timeSeries[i]-timeSeries[i-1]>=duration){
            count+=duration;
        }else{
            count+=timeSeries[i]-timeSeries[i-1];
        }
       }  
           count+=duration;
           return count;
       }
}