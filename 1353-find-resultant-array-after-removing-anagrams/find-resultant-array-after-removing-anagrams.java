class Solution {
    public List<String> removeAnagrams(String[] words) {
        String pre="";
        List<String>li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[]ch=words[i].toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            if(!curr.equals(pre)){
                li.add(words[i]);
                pre=curr;
            }
        }
        return li;
    }
}