class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;


        int n1=haystack.length();
        int n2=needle.length();


        if (n2 > n1) return -1;
        for(int i=0;i<=n1-n2;i++){
            int j;
        for( j=0;j<n2;j++){
              char temp1=haystack.charAt(i+j);
              char temp2=needle.charAt(j);
              if(temp1!=temp2){
                break;
              }
        }
        if(j==n2){
        return i;
        }
        }
        return -1; 
    }
}