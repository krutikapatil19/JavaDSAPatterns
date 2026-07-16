public class MaximumSumSubarrayOfSizeK {
    public static int maxSubarraySum(int[]nums, int k){

        //Stores the current window sum
        int currSum = 0;

        //Stores the maximum sum found so far
        int maxSum = 0;
        
        //Calculate the first window sum
        for(int i = 0; i<k; i++){
            currSum += nums[i];
        }
        //First window is the maximum so far
        maxSum = currSum;

        //Slide the window
        for(int i = k; i<nums.length; i++){

            //Remove left element and add right one
            currSum = currSum - nums[i-k] + nums[i];

            //Update maxSum ..if currSum is greater than maxSum..
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        //Return the maximum sum
    return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {2,1,5,1,3,2};
        int k=3;
        System.out.println(maxSubarraySum(nums,k));
    }
}
