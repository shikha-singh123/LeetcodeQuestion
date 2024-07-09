class Solution {
    public boolean isValid(String word) {
        
        if(word.length()<=2){
            return false;
         }

        String v="aeiouAEIOU";
        int vc=0;
        int cc=0;
        for (int i=0;i<word.length();i++){
            if(Character.isLetter(word.charAt(i))){
                if(v.contains(Character.toString(word.charAt(i)))){
                    vc++;
                }else{
                    cc++;
                }
            }else{
                if(word.charAt(i)=='@' || word.charAt(i)=='#' || word.charAt(i)=='$'){
                    return false;
                }
            }
        }
        if(vc>=1 && cc>=1){

        return true;
        }else{
            return false;
        }
    }
}