public class MaximumSumCircularSubarray {
    public static int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;

        int currMax = 0, maxSum = Integer.MIN_VALUE;
        int currMin = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            totalSum += nums[i];
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] nums = {5, -3, 5};
        System.out.println(maxSubarraySumCircular(nums));
    }
}