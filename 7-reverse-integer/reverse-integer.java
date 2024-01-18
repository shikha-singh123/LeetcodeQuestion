class Solution {
    public int reverse(int x) {
        int rev=0;
        // int count=0;
        while(x!=0){
            int lastdigit=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;  // Overflow will occur
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;  // Overflow will occur
            }
            rev=(rev*10)+lastdigit;
            x=x/10;
        }
        return rev;
    }
}