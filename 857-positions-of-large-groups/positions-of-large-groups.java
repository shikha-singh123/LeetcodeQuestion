class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans= new ArrayList<>();
            int n=s.length();
            int start=0;
            int end=0;
            char pre=s.charAt(0);
            for(int i=1;i<n;i++){
                char ch=s.charAt(i);
                if(ch==pre){
                    end=i;
                }else{
                    int size=end-start+1;
                    if(size>=3){
                        List<Integer> a=new ArrayList<>(List.of(start,end));
                        ans.add(a);
                    }
                    pre=ch;
                    start=i;
                    end=i;
                }
            }
            int size=end-start+1;
            if(size>=3){
                        List<Integer> a=new ArrayList<>(List.of(start,end));
                        ans.add(a);
    }
    return ans;
    }
}