public class MaxAbsoluteSumOfAnySubarray {
    public static int maxAbsoluteSum(int[] nums){

        //maxSum stores maximum subarray sum(positive side)
        //minSum stores minimum subarray sum(negative side)
        int maxSum = 0;     
        int minSum = 0;

        //currMax - running sum for max subarray
        //currMin - running sum for min subarray
        int currMax = 0;
        int currMin = 0;

        //Traverse the array
        for(int i = 0;i<nums.length;i++){
            
            currMax = Math.max(nums[i], currMax+nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
    public static void main(String[] args){
        int[] nums = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }
}
