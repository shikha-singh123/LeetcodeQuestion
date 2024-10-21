class Solution {

    boolean gG(int n){
        if(n==1) return true;
        if(n%2==0) return gG(n/2);
        return false;
    }
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        return gG(n); 
    }
}