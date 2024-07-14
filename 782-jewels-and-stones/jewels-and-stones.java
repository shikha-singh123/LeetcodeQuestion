class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>jewelSet=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            jewelSet.add(jewels.charAt(i));
        }
        int count=0;
        for(int j=0;j<stones.length();j++){
            if(jewelSet.contains(stones.charAt(j))){
                count++;
            }
        }
        return count;
    }
}