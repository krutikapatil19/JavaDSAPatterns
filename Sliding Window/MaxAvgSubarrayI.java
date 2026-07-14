public class MaxAvgSubarrayI {
    public static double findMaxAverage(int[]nums, int k){

        int currentSum = 0;
        int maxSum = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i<k; i++){
            currentSum += nums[i];
        
        //take the prev sum -> remove the element leaving the window - add the element entering the window
        currentSum = currentSum - nums[start] + nums[end];
    }
}
    public static void main(String[] args){
        int[]nums = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
