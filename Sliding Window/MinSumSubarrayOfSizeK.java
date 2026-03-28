public class MinSumSubarrayOfSizeK {
    public static int minimumSubarraySum(int[] nums, int k){

        int currWindowSum = 0;
        int minSum;

        for(int i = 0;i<k;i++){
            currWindowSum += nums[i];
        }

        minSum = currWindowSum;

        for(int i = k;i<nums.length;i++) {
            currWindowSum = currWindowSum - nums[i-k] + nums[i];
            minSum = Math.min(currWindowSum, minSum);
        }
        return minSum;
    }
    public static void main(String[] args){
        int[] nums = {2,3,6,10,5,9};
        int k = 3;
        System.out.println(minimumSubarraySum(nums,k));
    }
}
