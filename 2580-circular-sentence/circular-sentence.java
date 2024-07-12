class Solution {
    public boolean isCircularSentence(String sentence) {
        char c[] = sentence.toCharArray();
        int n = c.length;
        
        if (c[0] != c[n - 1]) return false;

        for (int i = 1; i < n - 1; i++) {
            if (c[i] == ' ') {
                if (c[i - 1] != c[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
