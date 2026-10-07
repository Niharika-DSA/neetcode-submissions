class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int total=rows*columns;
        int left=0;
        int right=total-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int val = matrix[mid / columns][mid % columns];
            if(val==target)
            {
                return true;
            }
            else if(val<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
           return false;
        
    }
}
