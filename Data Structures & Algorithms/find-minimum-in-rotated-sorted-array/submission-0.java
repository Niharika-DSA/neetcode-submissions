class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = nums[0];

        while (l <= r) {

            // If the current subarray is already sorted
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = l + (r - l) / 2;
            res = Math.min(res, nums[m]);

            // Left half is sorted
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } 
            // Right half is sorted
            else {
                r = m - 1;
            }
        }
        return res;
    }
}
