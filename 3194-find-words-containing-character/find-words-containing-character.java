class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List <Integer> ans=new ArrayList<Integer>();
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].indexOf(x)!=-1){
               ans.add(i);
        }
        }
            return ans;
    }
}