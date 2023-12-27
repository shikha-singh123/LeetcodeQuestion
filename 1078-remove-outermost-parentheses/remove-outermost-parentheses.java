class Solution {
    public String removeOuterParentheses(String s) {
        int n =s.length();
        int count=0;
        StringBuilder str=new StringBuilder();
        boolean flag=true;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                count++;
            }else if(c==')'){
                count--;
            } if(count==1 && flag){
                flag=false;
                continue;
            }else if(count ==0 && !flag){
                flag=true;
                continue;

            }
            str.append(c);
        }
        return str.toString();
    }
}