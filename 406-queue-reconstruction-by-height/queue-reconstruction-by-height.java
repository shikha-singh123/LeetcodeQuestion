class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List <int []>ans=new LinkedList<>();
        Arrays.sort(people,(a,b)->b[0]==a[0]?a[1]-b[1]:b[0]-a[0]);

        for(int []person:people){
            ans.add(person[1],person);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}