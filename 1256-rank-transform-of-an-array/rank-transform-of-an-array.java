import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            rankMap.put(list.get(i), i + 1);
        }
        
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = rankMap.get(arr[i]);
        }
        
        return arr1;
    }
}
