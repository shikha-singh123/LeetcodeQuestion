class Solution {
    static int merge(int[]arr,int low,int mid,int high){
        ArrayList<Integer>temp=new ArrayList<>();
           int left=low;
           int right=mid+1;
           int count=0;
            
             int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }


           left=low;
           right=mid+1;
           while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
           }
           while(left<=mid){
            temp.add(arr[left]);
            left++;
           }
           while(right<=high){
            temp.add(arr[right]);
            right++;
           }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return count;
    }
     private int mergeSort(int[]arr,int low,int high){
           if(low>=high) return 0;
            int mid=(low+high)/2;
            int count=mergeSort(arr,low,mid);
            count+=mergeSort(arr,mid+1,high);
            count+=merge(arr,low,mid,high);
            return count;
           
    }
    public int reversePairs(int[] nums) {
       return mergeSort(nums,0,nums.length-1);
        }
}