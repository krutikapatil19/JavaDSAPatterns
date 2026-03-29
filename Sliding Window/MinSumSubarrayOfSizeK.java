public class MinSumSubarrayOfSizeK {
    public static int minimumSubarrayLength(int[] nums, int target){

        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int end = 0;end<nums.length;end++){
            sum += nums[end];

            while(sum >= target){
                minLength = Math.min(minLength, end-start+1);
                sum -= nums[start];
                start++;
            }
        }
        return minLength;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minimumSubarrayLength(nums,target));
    }
}
