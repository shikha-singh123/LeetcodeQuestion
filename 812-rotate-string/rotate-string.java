class Solution {
    public boolean rotateString(String s, String goal) {
        String whole=s+s;
        if(s.length()!=goal.length()){
            return false;
        }if(whole.indexOf(goal)==-1){
            return false;
        }
        else return true;
    }
}