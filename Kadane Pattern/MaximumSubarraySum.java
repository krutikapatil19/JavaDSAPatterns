public class MaximumSubarraySum {
    public static int maximumSumSubarray (int[] nums){

        int currSum = nums[0];          //current running sum of subarray
        int maxSum = Integer.MIN_VALUE;     //stores best (maximum) sum found so far 

        for(int i = 0;i<nums.length;i++){
            currSum += nums[i];     //add current element to running sum

            //update maxSum if currentSum is better
            maxSum = Math.max(currSum , maxSum);

            //if running sum becomes negative -> drop it  , because negative sum will only decrease future results 

            if(currSum < 0){
                currSum = 0;    //restart from the next element
            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSumSubarray(nums));
    }
}
