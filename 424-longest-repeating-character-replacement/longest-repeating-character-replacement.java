class Solution {
    public int characterReplacement(String s, int k) {
        int ans=0;
        int i=0;
        int j=-1;
        int n=s.length();
        int[] count=new int[26];
        while(i<n){
             count[s.charAt(i) - 'A']++;
            int maxCount = getMaxCount(count);

            if (i - j - maxCount > k) {
                // Slide the window
                count[s.charAt(j + 1) - 'A']--;
                j++;
            }

            ans = Math.max(ans, i - j);
            i++;
        }

        return ans;
}
private int getMaxCount(int[]count){
    int maxCount=0;
     for (int c : count) {
            maxCount = Math.max(maxCount, c);
        }
        return maxCount;
}
}