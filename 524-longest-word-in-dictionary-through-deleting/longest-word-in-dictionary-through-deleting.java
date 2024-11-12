class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String toCompare : dictionary) {
            int len = toCompare.length();
            if (isSubseq(s, toCompare)) {
                if (res.length() < len) {
                    res = toCompare;
                } else if (res.length() == len) {
                    if (res.compareTo(toCompare) > 0) {
                        res = toCompare;
                    }
                }
            }
        }
        return res;
    }

    private boolean isSubseq(String a, String b) {
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == b.length();
    }
}
