class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int count=0;
        if(password.length()<8) return false;
        boolean lower=false;
        boolean upper=false;
        boolean digit=false;
        boolean special=false;
        String specialChar="!@#$%&*()^-+";
        for(int i=0;i<password.length();i++){
            if(Character.isLowerCase(password.charAt(i))) lower=true;
            else if(Character.isUpperCase(password.charAt(i))) upper=true;
            else if(Character.isDigit(password.charAt(i))) digit=true;
            else if(specialChar.contains(""+password.charAt(i))) special=true;
            if(i>0){
                if(password.charAt(i)==password.charAt(i-1)) return false;
            }
        }
        return lower && upper && digit && special;
    }
}