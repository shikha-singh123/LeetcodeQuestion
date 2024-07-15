class Solution {
    public boolean isIsomorphic(String s, String t) {

        int []indexS=new int [200];
        int []indexT=new int [200];

        int n1=s.length();
        int n2=t.length();
        if(n1!=n2) return false;
        for(int i=0;i<n1;i++){
            if (indexS[s.charAt(i)]!= indexT[t.charAt(i)]){
                return false;
            }
        indexS[s.charAt(i)]=i+1;
        indexT[t.charAt(i)]=i+1;
        }
        return true;
    }
}