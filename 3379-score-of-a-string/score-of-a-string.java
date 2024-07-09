class Solution {
    public int scoreOfString(String s) {
        int temp=0;
        for(int i=0;i<s.length()-1;i++){
            int ascii1=96+s.charAt(i);
            int ascii2=96+s.charAt(i+1);
             temp+=Math.abs(ascii2-ascii1);
        }
        return temp;
    }
}