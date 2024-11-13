class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                list.add(matrix[i][j]);
            }
        }
        list.sort((a,b)->{
            return -1*b.compareTo(a);
        });
        return k>list.size()+1?0:list.get(k-1);
    }
}