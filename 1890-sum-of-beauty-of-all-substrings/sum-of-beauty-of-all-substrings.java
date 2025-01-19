class Solution {
    public int beautySum(String s) {
        int max=0;
        char [] ar=s.toCharArray();
         
         for(int i=0;i<ar.length;i++){
            int[]freq=new int[26];

            for(int j=i;j<ar.length;j++){
                int mx=Integer.MIN_VALUE;
                int mn=Integer.MAX_VALUE;

                freq[ar[j]-'a']++;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        mx=Math.max(mx,freq[k]);
                        mn=Math.min(mn,freq[k]);
                    }
                }
                max+=(mx-mn);
            }
         }
         return max;
    }
}