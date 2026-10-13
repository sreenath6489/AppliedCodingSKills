class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            int left = nums[i] * i - leftSum;

            int rightSum = totalSum - leftSum - nums[i];
            int right = rightSum - nums[i] * (n - i - 1);

            ans[i] = left + right;

            leftSum += nums[i];
        }

        return ans;
    }
}