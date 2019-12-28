https://leetcode.com/problems/maximum-product-subarray/
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n < 1) return 0;
        int left = nums[0], right = nums[n-1];
        int left_max = left, right_max = right;
        for (int i = 1; i < n; i++) {
            if (left == 0) left = nums[i];
            else left *= nums[i];
            left_max = Math.max(left, left_max);
        }
        for (int i = n-2; i >= 0; i--) {
            if (right == 0) right = nums[i];
            else right *= nums[i];
            right_max = Math.max(right, right_max);
        }
        return Math.max(right_max, left_max);
    }
