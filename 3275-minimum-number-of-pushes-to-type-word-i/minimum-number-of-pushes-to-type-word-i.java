class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int k=n;
        int s=0;
        if(k>8){
            s=s+8;
        }else{
            s=s+k;
            return s;
        }
        if(k>16){
            s=s+8*2;

        }else{
            s=s+(k-8)*2;
            return s;
        }
        if(k>24){
            s=s+8*3;
        }else{
            s=s+(k-16)*3;
            return s;
        }
        if(k==25)
        s=s+4;
        if(k==26)
        s=s+8;
        return s;
    }
}