class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==x){
                ans=mid;
                break;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }else
                end=mid-1;
            }
            ans=Math.max(ans,start);
            int l=(ans-k<0)?0:ans-k;
            int r=(ans+k>=arr.length)?arr.length-1:ans+k;

            while(r-l+1>k){
                if(x-arr[l]<=arr[r]-x) r--;
                else l++;
            }
        
        ArrayList<Integer>list=new ArrayList<>();
         int i=l;
         while(k-->0){
            list.add(arr[i]);
            i++;
         }
         return list;
    }
}