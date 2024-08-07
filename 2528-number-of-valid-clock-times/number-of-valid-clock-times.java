class Solution {
    public int countTime(String time) {
        int h=1;
        int m=1;
        if(time.charAt(1)=='?' && time.charAt(0)=='?'){
            h=24;
        }else if(time.charAt(1)=='?'){
            int d=time.charAt(0)-'0';
            h=(d==2)?4:10;
        }  else if (time.charAt(0) == '?') {
            int d = time.charAt(1) - '0';
            if (d <= 3) {
                h = 3;
            } else {
                h = 2;
            }
        }
        
        if (time.charAt(3) == '?' && time.charAt(4) == '?') {
            m = 60;
        } else if (time.charAt(4) == '?') {
            m = 10;
        } else if (time.charAt(3) == '?') {
            m = 6;
        }
        
        return h * m;
    }
}