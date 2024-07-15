class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int carry=1;
        for(int i=n-1;i>=0;i--)
        {
            int sum=digits[i]+carry;
            digits[i]=sum%10;
            carry=sum/10;
        }
        int count=0;
        if(digits[0]==0 && carry==0)
        {
            for(int i=0;i<n;i++)
            {
                if(digits[i]==0)
                {
                    count++;
                }
                else
                {
                    break;
                }
            }

            int A[]=new int[n-count];
            for(int i=0;i<n-count;i++)
            {
                A[i]=digits[i+count];
            }
            return A;
        }
        if(carry>0)
        {
            int A[]=new int[n+1];
            A[0]=1;
            for(int i=1;i<n;i++)
            {
                A[i]=0;
            }
            return A;
        }
        
        return digits;



    }
}