class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int a=n*5/100;
        int sum=0;
        for(int i=a;i<n-a;i++){
            sum+=arr[i];
        }
        return (double)sum/(n-2*a);
    }
}