class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxArea=0;
        int Area;
        while(l<r)
        {
            Area=(r-l)*Math.min(heights[r],heights[l]);
            maxArea=Math.max(maxArea,Area);
            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxArea;
    }
}
