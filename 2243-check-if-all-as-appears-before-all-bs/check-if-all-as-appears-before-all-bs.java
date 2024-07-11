class Solution {
    public boolean checkString(String s) {
        int aIndex=-1;
        int bIndex=s.length();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                aIndex=i;
            }else if(s.charAt(i)=='b'){
                bIndex=i;
            }
            if(aIndex>bIndex){
                return false;
            }
        }
        return true;
    }
}