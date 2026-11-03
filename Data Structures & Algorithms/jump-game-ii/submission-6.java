class Solution {
    public int jump(int[] nums) {
        int currentEnd=0;
        int furthest=0;
        int jumps=0;
        for(int i=0;i<nums.length-1;i++)
        {
            furthest=Math.max(furthest,i+nums[i]);
            if(i==currentEnd)
            {
                jumps++;
                currentEnd=furthest;
            }
        }
        return jumps;
    }
}
