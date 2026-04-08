public class MinimumSubarraySum {
    public static int minimumSubarraySum(int[] nums){
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        for(int i = 0; i<nums.length; i++){
            currSum += nums[i];

            minSum = Math.min(currSum, minSum);

            if(currSum>0){
                currSum = 0;
            }
        }
        return minSum;
    }
    public static void main(String[] args){
        int[] nums = {3,-4, 2,-3,-1, 7,-5};
        System.out.println(minimumSubarraySum(nums));
    }
}
