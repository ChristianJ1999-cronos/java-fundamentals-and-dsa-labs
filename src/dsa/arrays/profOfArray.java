/*
data structures practice for Products of Array Except Self
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];   // left[i] = product of nums[0..i-1]
        int[] right = new int[n];  // right[i] = product of nums[i+1..n-1]
        int[] res = new int[n];

        // build left[]
        left[0] = 1;                         // nothing left of index 0
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // build right[]
        right[n - 1] = 1;                    // nothing right of last index
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // res[i] = left[i] * right[i]
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
