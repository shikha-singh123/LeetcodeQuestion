class Solution {
    public int maximumRemovals(String s, String p, int[] rem) {
            int l = 0, r = rem.length;
    int[] map = new int[s.length()];
    Arrays.fill(map, rem.length);
    for (int i = 0; i < rem.length; ++i)
         map[rem[i]] = i;    
    while (l < r) {
        int m = (l + r + 1) / 2, j = 0;
        for (int i = 0; i < s.length() && j < p.length(); ++i)
            if (map[i] >= m && s.charAt(i) == p.charAt(j))
                ++j;
        if (j == p.length())
            l = m;
        else
            r = m - 1;
    }
    return l;
    }
}