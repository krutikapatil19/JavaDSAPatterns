public class MaxAvgSubarrayI {
    public static double findMaxAverage(int[]nums, int k){

        //Stores the sum of the current window 
        int currentSum = 0;

        //Stores the maximum window sum found so far
        int maxSum = 0;

        //first loop : Calculate the sum of the first window 
        for(int i = 0; i<k; i++){
            currentSum += nums[i];
        }
        //lets assume that first window has the maximum sum seen so far 
        maxSum = currentSum;

        //Slide the window through the array 
        for(int i = k; i<nums.length; i++){

        //Slide the window : remove leftmost element , add the right element.
        currentSum = currentSum - nums[i-k] + nums[i];

        //update maximum sum if needed
        if(currentSum > maxSum){
            maxSum = currentSum;
        }
    }
    //return the maximum average
    return (double) maxSum/k;
}
    public static void main(String[] args){
        int[]nums = {1,12,-5,-6,50,0,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}

/*Approach:
1.Calculate the first window and its sum.
2.Store it as the maxSum.
3.Slide the window: Remove left element ,and add the right one.
4.Update the maximum , if current window sum is greater.
5.Return the answer.
*/