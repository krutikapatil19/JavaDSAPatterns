public class MaxAvgSubarrayI {
    public static int maxAverageSubarray(int[]nums, int k){

        int start = 0;
        int end = 0;

        //take the prev sum -> remove the element leaving the window - add the element entering the window
        int currentSum = currentSum - nums[start] + nums[end];
    }
    public static void main(String[] args){
        int[]nums = {};
        int k;
        System.out.println(maxAverageSubarray(nums,k));
    }
}
