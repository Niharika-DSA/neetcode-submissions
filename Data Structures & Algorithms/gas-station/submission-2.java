class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tanks=0;
        int total=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
            total+=gas[i]-cost[i];
            tanks+=gas[i]-cost[i];
            if(tanks<0)
            {
                tanks=0;
                start=i+1;
            }
        }
        if(total<0)
        {   
            return -1;
        }
        return start;
    }
}
