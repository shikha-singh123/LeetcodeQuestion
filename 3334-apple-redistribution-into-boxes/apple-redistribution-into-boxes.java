class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sumA=0;
        int sumC=0;
        int count=0;
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++){
            sumA=sumA+apple[i];
        }
        for(int i=capacity.length-1;i>=0;i--){
            sumC=sumC+capacity[i];
            count++;
            if(sumA<=sumC){
                return count;
            }
        }
    
          return -1;
    }
}