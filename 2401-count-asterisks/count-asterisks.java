class Solution {
    public int countAsterisks(String s) {
        boolean inBetweenPipe=false;
        int res=0;
        for(char i:s.toCharArray()){
            if(!inBetweenPipe && i == '*'){
                res++;
            }
            if(i=='|'){
                inBetweenPipe=!inBetweenPipe;
            }
        }
        return res;
    }
}