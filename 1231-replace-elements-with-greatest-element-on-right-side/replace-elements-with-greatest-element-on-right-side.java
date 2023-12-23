class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int gtr=-1;
        int temp;
        for(int i=n-1;i>=0;i--){
            temp=arr[i];
            arr[i]=gtr;
            gtr=Math.max(temp,gtr);
        }
             return arr;
    }
}