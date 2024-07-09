class Solution {
    public int findPermutationDifference(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int add=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(s.charAt(i)==t.charAt(j)){
                    add+=Math.abs(i-j);
                }
            }
        }
        return add;
    }
}