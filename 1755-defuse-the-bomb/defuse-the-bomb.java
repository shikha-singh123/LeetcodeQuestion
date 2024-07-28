class Solution {
    public int[] decrypt(int[] code, int k) {
        if(k==0){
        return new int[code.length];

        }

        int window=0;
        int[]ans=new int[code.length];

        if(k>0){
            for(int i=1;i<=k;i++){
               window+= code[i%code.length];
            }
            for(int i=0;i<code.length;i++){
                ans[i]=window;
                window-=code[(i+1)%code.length];
                window+=code[(i+1+k)%code.length];
            }
        }
        else if(k<0){
            for(int i=k;i<0;i++)
                {
                window += code[(code.length + i) % code.length];
            }
            for(int i=0;i<code.length;i++)
            {
                ans[i] = window;
                window -= code[(code.length + i + k) % code.length];
                window += code[i % code.length];
            }
        }

        return ans;

            
        
    }
}