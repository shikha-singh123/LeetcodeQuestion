class Solution {

    


    public List<Integer> addToArrayForm(int[] num, int k) {
        
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        while(k>0){
            l2.add(0,k%10);
            k/=10;
        }


        // know add elments of num array and l2 list from right side

        int ind1 = num.length - 1;
        int ind2 = l2.size() - 1;
        int carry = 0;
        while(ind1>=0 && ind2>=0){
            int sum = num[ind1] + l2.get(ind2) + carry;
            ind1 = ind1-1;
            ind2 = ind2-1;
            if(sum>9){
                l1.add(0,sum%10);
                carry = sum/10;
            }
            else{
                l1.add(0,sum);
                carry = 0;
            }
        }

        while(ind1>=0){
            int sum = num[ind1--] + carry;
             if(sum>9){
                l1.add(0,sum%10);
                carry = sum/10;
            }
            else{
                l1.add(0,sum);
                carry = 0;
            }
        }
         while(ind2>=0){
            
              int sum = l2.get(ind2--) + carry;
             if(sum>9){
                l1.add(0,sum%10);
                carry = sum/10;
            }
            else{
                l1.add(0,sum);
                carry = 0;
            }

        
        }

           if(carry>0){
                l1.add(0,carry);
            }






return l1;
    
    }
}