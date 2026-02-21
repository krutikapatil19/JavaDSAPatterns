public class MaxSumSubarrayOfSizeK {
    public static int maximumSubarraySum(int[] nums,int k){

        int currWindowSum  = 0;     //sum of current window 
        int maxSum;         //best sum found so far 

        for(int i = 0;i<k;i++){
            currWindowSum += nums[i];       //first window becomes starting answer  
        }

        maxSum = currWindowSum;         //assuming the first window as the maxSum 

        for(int i = k;i<nums.length; i++){  //sliding the window 
            currWindowSum = currWindowSum - nums[i-k] + nums[i];    //removing the leftmost element from the window ,and adding the next one to the rightmost element
            maxSum = Math.max(currWindowSum, maxSum);       //update max if current window is better or gives maximum sum 
        }

        return maxSum;
    }
    public static void main(String[] args){
        int [] nums = {2,3,6,10,5,4};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }
}
