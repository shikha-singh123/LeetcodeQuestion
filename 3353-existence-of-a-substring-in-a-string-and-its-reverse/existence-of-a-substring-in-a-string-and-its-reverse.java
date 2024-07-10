class Solution {
    public boolean isSubstringPresent(String s) {
        String reversed=new StringBuilder(s).reverse().toString();
        HashSet <String> h=new HashSet<>();
        for(int i=0;i<s.length()-1;i++){
            h.add(s.substring(i,i+2));

        }
        for(int i=0;i<s.length()-1;i++){
           if(h.contains(reversed.substring(i,i+2)))
            return true;
        }
        return false;
    }
}