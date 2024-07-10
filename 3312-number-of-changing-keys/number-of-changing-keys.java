class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            
            if(s.charAt(i+1)!=s.charAt(i))
             count++;
        }
        return count;
    }
}