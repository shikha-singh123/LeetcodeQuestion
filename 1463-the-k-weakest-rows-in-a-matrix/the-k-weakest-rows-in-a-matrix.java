class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int [][]count=new int [mat.length][2];
        for(int i=0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) c++;
            }
            count[i][0]=c;
            count[i][1]=i;
        }
        Arrays.sort(count,Comparator.comparingInt((int[]r)->r[0]).thenComparingInt(r->r[1]));
        int[]res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=count[i][1];
        }
        return res;
    }
}