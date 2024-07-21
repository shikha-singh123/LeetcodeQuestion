class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>setA=new HashSet<>();
        for(int a:nums1){
            setA.add(a);
        }
        Set<Integer>intersectionSet=new HashSet<>();
        for(int b:nums2){
            if(setA.contains(b)){
                intersectionSet.add(b);
            }
        }
        int[]result=new int[intersectionSet.size()];
        int index=0;
        for(int num:intersectionSet){
            result[index++]=num;
        }
        return result;
    }
}