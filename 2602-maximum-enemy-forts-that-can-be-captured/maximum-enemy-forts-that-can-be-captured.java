class Solution {
    public int captureForts(int[] forts) {
        int ans=0;
        int n =forts.length;
        for(int i=0;i<n;i++){
                if(forts[i]==1){
                    int count=0;
                    for(int j=i-1;j>=0;j--){
                        if(forts[j]==0){
                            count++;
                        }else if(forts[j]==-1){
                            ans=Math.max(ans,count);
                               break;
                        }else{
                            break;
                        }
                    }
                    count=0;
                    for(int j=i+1;j<n;j++){
                        if(forts[j]==0){
                            count++;
                        }else if(forts[j]==-1){
                            ans=Math.max(ans,count);
                            break;
                        }else{
                            break;
                        }
                    }
                }
        }
        return ans;
    }
}