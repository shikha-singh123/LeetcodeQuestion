class Solution {
    public int reverse(int x) {
        int rev=0;
        // int count=0;
        while(x!=0){
            int lastdigit=x%10;
            if (rev > Integer.MAX_VALUE / 10 ) {
                return 0;  
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            rev=(rev*10)+lastdigit;
            x=x/10;
        }
        return rev;
    }
}