public class MaxAvgSubarrayI {
    public static double findMaxAverage(int[]nums, int k){

        int currentSum = 0;
        int maxSum = 0;

        for(int i = 0; i<k; i++){
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for(int i = k; i<nums.length; i++){
        //Slide the window : remove leftmost element , add the right element.
        currentSum = currentSum - nums[i-k] + nums[i];

        if(currentSum > maxSum){
            maxSum = currentSum;
        }
    }
    return (double) maxSum/k;
}
    public static void main(String[] args){
        int[]nums = {1,12,-5,-6,50,0,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
