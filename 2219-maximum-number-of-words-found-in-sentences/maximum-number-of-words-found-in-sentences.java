class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String word:sentences){
            int spacesCount=1;
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==' '){
                    spacesCount++;
                }
            }
            if(spacesCount>count){
                count=spacesCount;
            }
        }
        return count;
    }
}