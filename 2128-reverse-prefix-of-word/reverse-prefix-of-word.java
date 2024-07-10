class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        StringBuilder sb=new StringBuilder(word);
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                sb=new StringBuilder(sb.substring(0,i+1)).reverse().append(word.substring(i+1));
                break;
            }
        }
        return sb.toString();
    }
}