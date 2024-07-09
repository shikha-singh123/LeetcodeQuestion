class Solution {
    public int minimumChairs(String s) {
        int ans=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='E') count++;
            if(ch== 'L') count--;
        ans=Math.max(count,ans);
        }
        return ans;
    }
}