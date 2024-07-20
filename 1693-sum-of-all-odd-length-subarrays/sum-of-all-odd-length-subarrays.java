class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = n - i;
            int end = i + 1;
            int totalPossibleSubArrs = start * end;
            int oddSubs = totalPossibleSubArrs / 2;
            if (totalPossibleSubArrs % 2 != 0) {
                oddSubs++;
            }
            sum += oddSubs * arr[i];
        }
        return sum;
    }
}