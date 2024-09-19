class Solution {
    public String sortSentence(String s) {
        String[]arr1=s.split("\\s");
        String[]arr=new String[arr1.length];

       for(int i=0;i<arr1.length;i++){
        int j=arr1[i].charAt(arr1[i].length()-1)-'0';
        arr[j-1]=arr1[i].substring(0,arr1[i].length()-1);
       }              
       StringBuilder s1=new StringBuilder();
       for(int i=0;i<arr.length;i++){
        s1.append(arr[i]+" ");
       }
       return s1.toString().trim();
    }
}