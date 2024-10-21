class Solution {
    public char kthCharacter(int k) {
        int size=1;
        String str="a";
        while(size<k){
            String res="";
            for(char ch:str.toCharArray()){
                char next= ch =='z'?'a':(char) (ch+1);
                res+=(ch+""+next);
            }
            size*=2;
            str=new String(res);

        }
        return str.charAt(k-1);
    }
}