public class MaximumSumSubarrayOfSizeK {
    public static int maxSubarraySum(int[]nums, int k){

        int maxSum = 0;
        int currSum = 0;
        
        for(int i = 0; i<k; i++){
            currSum += nums[i];
            maxSum = currSum;
        }
        for(int i = k; i<nums.length; i++){
            currSum += nums[i];

            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
    return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {2,1,5,1,3,2};
        int k=3;
        System.out.println(maxSubarraySum(nums,k));
    }
}
