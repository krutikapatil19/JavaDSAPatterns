public class MaxSumSubarray {
    public static int maximumSubarraySum(int[] nums,int k){

        int currWindowSum  = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<k;i++){
            currWindowSum += nums[i];
        }

        maxSum = currWindowSum;

        for(int i = k;i<nums.length; i++){
            currWindowSum = currWindowSum - nums[i-k] + nums[i];
            maxSum = Math.max(currWindowSum, maxSum);
        }
        
        return maxSum;
    }
    public static void main(String[] args){
        int [] nums = {2,3,6,10,5,4};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }
}
