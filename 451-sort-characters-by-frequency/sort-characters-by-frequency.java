class Solution {
    public String frequencySort(String s) {
        int[]freq=new int[128];
        char []ans=new char[s.length()];
        
        for(char c:s.toCharArray()){
            freq[c]++;
        }
        for(int i=0;i<s.length();){
            int max=0;
            int ind=0;
            for(int j=0;j<128;j++){
                if(max<freq[j]){
                    max=freq[j];
                    ind=j;
                }
            }
            while(freq[ind]>0){
                ans[i++]=(char)ind;
                freq[ind]--;
            }
        }
        return new String(ans);
    }
}