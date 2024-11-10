class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i=0;
        int j=0;
        int k=0;
        List<int[]>result=new ArrayList<>();
        while(i<firstList.length && j<secondList.length){
            if(firstList[i][0]>secondList[j][1]){
                j++;
            }else if (secondList[j][0]>firstList[i][1]){
                i++;
            }else{
                int a=Math.max(firstList[i][0],secondList[j][0]);
                int b=Math.min(firstList[i][1],secondList[j][1]);
                result.add(new int[]{a,b});
                if(firstList[i][1]<secondList[j][1])i++;
                else j++;
            }
        }
        int [][]ans=new int[result.size()][];
        for(int []t:result){
            ans[k++]=t;
        }
        return ans;
    }
}