import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> boxedRes = new ArrayList<>();
        if (nums == null || nums.length < 3) return boxedRes;

        Arrays.sort(nums);
        int n = nums.length;

        // Store primitives first to avoid boxing during the scan
        List<int[]> primitiveTriplets = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) break; // early exit: remaining numbers can't sum to 0
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    primitiveTriplets.add(new int[] { nums[i], nums[left], nums[right] });
                    left++;
                    right--;
                    // skip duplicates
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // Convert primitive triplets to List<List<Integer>> only once, at the end
        boxedRes = new ArrayList<>(primitiveTriplets.size());
        for (int[] t : primitiveTriplets) {
            List<Integer> trip = new ArrayList<>(3);
            trip.add(t[0]);
            trip.add(t[1]);
            trip.add(t[2]);
            boxedRes.add(trip);
        }
        return boxedRes;
    }
}
