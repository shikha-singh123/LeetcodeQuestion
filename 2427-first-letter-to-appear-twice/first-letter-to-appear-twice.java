class Solution {
    public char repeatedCharacter(String s) {
        boolean[]arr=new boolean[26];
        for(char x:s.toCharArray()){
             if(arr[x-'a'])
             return x;
              
              else arr[x-'a']=true;

        }
              return ' ';
    }
}