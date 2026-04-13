public class MaxAbsoluteSumOfAnySubarray {
    public static int maxAbsoluteSum(int[] nums){

        int maxSum = 0;
        int minSum = 0;

        int currMax = 0;
        int currMin = 0;

        for(int i = 0;i<nums.length;i++){
            
            currMax = Math.max(nums[i], currMax+nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
