class Solution {
    public int magicalString(int n) {
        int index=1;
        int ans=1;
        String str="1";

        while(str.length()<n){
            if(index%2==1){
                if(index==1){
                    str=str+"22";
                }else{
                    if(str.charAt(index)=='2'){
                        str=str+"22";
                    }else{
                        str=str+"2";
                    }
                }
            }else{
                if(str.charAt(index)=='2'){
                    str=str+"11";
                    ans=ans+2;
                }else{
                    str=str+"1";
                    ans=ans+1;
                }
            }
            index++;
        }
        if(str.length()>n && str.charAt(str.length()-1)=='1'){
            ans--;
        }
        return ans;
    }
}