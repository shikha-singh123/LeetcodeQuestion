class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder str=new StringBuilder(number);
        StringBuilder max=new StringBuilder(); 
        for(int i=0;i<number.length();i++){
            StringBuilder s=new StringBuilder(str);
            if(str.charAt(i)==digit){
                str.deleteCharAt(i);
                if(max.length()==0){
                    max=str;
                }else{
                    max=findgreat(max,str);
                }
            }
            str=s;
        }
        return max.toString();
    }
    public StringBuilder findgreat(StringBuilder a,StringBuilder b){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                return a;
            }
            if(a.charAt(i)<b.charAt(i)){
                return b;
            }
        }
        return a;
    }
}