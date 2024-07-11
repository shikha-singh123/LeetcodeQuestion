class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int a=map.get(s.charAt(0));
        for(Character i:map.keySet()){
            if(map.get(i)!=a){
                return false;
            }
        }
        return true;
    }
}