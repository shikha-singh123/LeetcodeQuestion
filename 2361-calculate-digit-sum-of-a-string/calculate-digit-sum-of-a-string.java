class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            s=roundTrips(s,k);
        }
        return s;
    }
    private String roundTrips(String s,int k){
        String ans="";
        int sum=0;
        int i=0;
        int j=0;
        for(;i<s.length();){
            while(j<k && i<s.length()){
                sum+=(s.charAt(i)-'0');
                i++;
                j++;
            }
            ans=ans+sum;
            j=0;
            sum=0;
        }
        return ans;
    }
}