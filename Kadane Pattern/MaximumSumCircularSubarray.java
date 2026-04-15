public class MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int currMax = 0, maxSum = Integer.MIN_VALUE;
        int currMin = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            // Total sum of array
            totalSum += nums[i];

             // Normal Kadane (maximum subarray)
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            // Reverse Kadane (minimum subarray)
            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }

        // edge case: if all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        System.out.println(maxSubarraySumCircular(nums));
    }
}