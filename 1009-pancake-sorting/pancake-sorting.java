class Solution {
    public void flip(int[] arr, int n) {
        int i = 0;
        int j = n - 1; 
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public int find_largest(int[] arr, int n) {
        int idx = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[idx]) {
                idx = i;
            }
        }
        return idx;
    }

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> res = new LinkedList<>();
        int n = arr.length;
        for (int i = n; i > 1; i--) {
            int idx = find_largest(arr, i);

            if (idx != 0) {
                flip(arr, idx + 1);
                res.add(idx + 1);
            }

            flip(arr, i); 
            res.add(i);
        }
        return res;
    }
}
