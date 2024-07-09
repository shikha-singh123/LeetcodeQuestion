class Solution {
    public int numberOfSpecialChars(String word) {
      int[]a=new int[26];  
      int[]b=new int[26];

      for(char ch:word.toCharArray()){
        if(ch>='a' && ch<='z'){
            a[ch-'a']++;
        }else if(ch>='A' && ch<='Z'){
            b[ch-'A']++;
        }
      }  
      int count=0;
      for(int i=0;i<26;i++){
           if(a[i]!=0 && b[i]!=0)
        count++;
      }
      return count;
      
    }
}