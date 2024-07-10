class Solution {
    static boolean isValid(String a,String b){
        int n=a.length();
        if(b.length()<a.length()) return false;
         
         String prefix= b.substring(0,n);
         int last=b.length()-n;
         String suffix=b.substring(last,b.length());
         if(a.equals(prefix) && a.equals(suffix)){
            return true;
         }
         return false;
        
        
        
            }
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int n = words.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if( isValid(words[i],words[j])){

                count++;
                }
            }
        }
        return count;
    }
}