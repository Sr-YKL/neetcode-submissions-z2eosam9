class Solution {
    // Kadane's Algorithm - Two Pointers
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = nums[0];
        for (int n : nums){
            currentSum = Math.max(currentSum,0);
            currentSum += n;
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
