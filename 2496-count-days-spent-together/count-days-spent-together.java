class Solution
{
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob)
    {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        String ar, dp; // ar is the latest arrival date, dp is the earliest departure date
        
        ar = arriveAlice.compareTo(arriveBob) <= 0 ? arriveBob : arriveAlice;
        
        dp = leaveAlice.compareTo(leaveBob) <= 0 ? leaveAlice : leaveBob;
        
        int ret = 1;
        
        if(ar.compareTo(dp) > 0) // ar is later than dp
            return 0;

        int amm = Integer.parseInt(ar.substring(0,2)), dmm = Integer.parseInt(dp.substring(0,2)), add = Integer.parseInt(ar.substring(3)), ddd = Integer.parseInt(dp.substring(3));
        // Month and day separated for arr and dp values
		
        for(int i = amm+1; i < dmm; i++)
            ret += days[i]; // Days of months between arrival and departure(exclusive)
        
        if(amm == dmm) // If arrival and departure in the same month, day difference is departure - arrival
            ret += (ddd-add);
        
        else // If arrival and departure in different months, day difference is number of days remaining in the arrival month + departure date
        {
            ret += days[amm]-add;
            ret += ddd;
        }
        
        return ret;
    }
}