class Solution {
    public int minimumSum(int num) {
         final List<Integer> ls=new ArrayList<>();
         while(num>0){
             ls.add(num%10);
             num=num/10;
         }   
         Collections.sort(ls);
         int first=0,second=0;
         for(int i=0;i<ls.size();i++){
            if(i%2==0){
            first*=10;
            first+=ls.get(i);
         }else{
            second*=10;
            second+=ls.get(i);
         }

    }
    return first+second;
}
}