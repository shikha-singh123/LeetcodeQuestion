class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res=new ArrayList<>();
        Set<List<Integer>> has=new HashSet<>();
        Arrays.sort(items1, Comparator.comparingInt(arr -> arr[0]));
        Arrays.sort(items2, Comparator.comparingInt(arr -> arr[0]));
        int p1=0,p2=0;
        while(p1!=items1.length && p2!=items2.length){
            if(items1[p1][0]>items2[p2][0]){
                has.add(Arrays.asList(items2[p2][0],items2[p2][1]));
                p2++;
            }
            else if(items1[p1][0]<items2[p2][0]){
               has.add(Arrays.asList(items1[p1][0],items1[p1][1]));
                p1++;
            }
            else if(items1[p1][0]==items2[p2][0]){
                int weight=items1[p1][1]+items2[p2][1];
                has.add(Arrays.asList(items1[p1][0],weight));
                p1++;
                p2++;
            }
        }
        while(p1!=items1.length){
            has.add(Arrays.asList(items1[p1][0],items1[p1][1]));
                p1++;
        }
        while(p2!=items2.length){
            has.add(Arrays.asList(items2[p2][0],items2[p2][1]));
                p2++;
        }
        res.addAll(has);
        Collections.sort(res, Comparator.comparingInt(list -> list.get(0)));
        return res;
    }
}