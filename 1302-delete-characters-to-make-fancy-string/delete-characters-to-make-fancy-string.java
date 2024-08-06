class Solution {
    public String makeFancyString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        char pre = s.charAt(0);
        int freq = 1;
        res.append(pre);

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == pre) {
                freq++;
            } else {
                pre = current;
                freq = 1;
            }

            if (freq < 3) {
                res.append(current);
            }
        }

        return res.toString();
    }
}
