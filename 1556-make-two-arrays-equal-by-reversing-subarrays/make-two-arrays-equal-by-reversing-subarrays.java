class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target[i])){
                map.put(target[i],map.get(target[i])+1);
            }else{
                map.put(target[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                if(map.get(arr[i])==0){
                    return false;
                }
                map.put(arr[i],map.get(arr[i])-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}