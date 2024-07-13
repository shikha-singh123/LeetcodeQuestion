class Solution {
    public int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        
        String[] segments = s.trim().split("\\s+");
        int count = 0;
        
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        
        return count;
    }
}
