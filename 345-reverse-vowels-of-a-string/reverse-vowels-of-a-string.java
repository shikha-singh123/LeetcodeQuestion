class Solution {
    static boolean isVowel(char c){
        return(c=='a'|| c=='e' || c=='i' ||c=='o' || c=='u'||
                c=='A' ||  c=='E' || c=='I' ||c=='O' || c=='U');
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] str1= s.toCharArray();
        while(i<j){
            if(!isVowel(str1[i])){
                i++;
                continue;
            }
            if(!isVowel(str1[j])){
                j--;
                continue;
            }
            char t= str1[i];
            str1[i]=str1[j];
            str1[j]=t;
            i++;
            j--;
        }
        return new String(str1);
    }
    
}