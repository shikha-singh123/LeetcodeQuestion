class Solution {
    boolean gG(int n){
        if(n==1) return true;
        if(n%4==0) return gG(n/4);
        return false;
    }
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        return gG(n);
    }
}