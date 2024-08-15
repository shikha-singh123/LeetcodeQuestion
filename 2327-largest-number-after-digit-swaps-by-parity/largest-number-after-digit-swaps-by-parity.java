class Solution {
    public int largestInteger(int num) {
        String s=String.valueOf(num);
        int n=s.length();

        ArrayList<Integer>evens=new ArrayList<>();
        ArrayList<Integer>odds=new ArrayList<>();

        for(int i=0;i<n;i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0){
                evens.add(digit);
            }else{
                odds.add(digit);
            }
        }
        Collections.sort(evens,Collections.reverseOrder());
        Collections.sort(odds,Collections.reverseOrder());

        StringBuilder result =new StringBuilder();
        int evenIndex=0, oddIndex=0;
        for(int i=0;i<n;i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0){
                result.append(evens.get(evenIndex++));
            }else{
                result.append(odds.get(oddIndex++));
            }
        }
        return Integer.parseInt(result.toString());
    }
}