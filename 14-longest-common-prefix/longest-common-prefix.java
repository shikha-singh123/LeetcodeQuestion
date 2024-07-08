import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        String first= strs[0];
        String last=strs[strs.length-1];
        StringBuilder result=new StringBuilder();
        for(int i=0;i<first.length();i++){
            if(i<last.length() && first.charAt(i)==last.charAt(i)){
                result.append(first.charAt(i));
            }else{
                break;
            }
        }
        return result.toString();
    }
}