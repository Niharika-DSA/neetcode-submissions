class Solution {
    public int jump(int[] nums) {
        int furthest=0;
        int jumps=0;
        int currentEnd=0;
        for(int i=0;i<nums.length;i++)
        {
            furthest=Math.max(furthest,i+nums[i]);
            if(i==currentEnd && i<nums.length-1)
            {
               jumps++;
               currentEnd=furthest; 
            }
        }
        return jumps;
    }
}
