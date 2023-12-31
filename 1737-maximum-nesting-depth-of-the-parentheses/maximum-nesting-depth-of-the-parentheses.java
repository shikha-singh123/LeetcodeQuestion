class Solution {
    public int maxDepth(String s) {
        int curDepth=0;
        int maxDepth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                curDepth++;
                maxDepth=Math.max(curDepth,maxDepth);
            }else if(ch==')'){
                curDepth--;
            }
        }
        return maxDepth;
    }
}