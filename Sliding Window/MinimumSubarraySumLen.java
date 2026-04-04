public class MinimumSubarraySumLen {
    public static int minimumLengthSubarray(int[] arr,int target){

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int targetSum = 0;

        for(int right = 0;right<arr.length;right++){

           targetSum += arr[right];

        // shrink window to find minimum length
        while(targetSum>=target){
            minLength = Math.min(minLength, right-left+1);
    
            targetSum -= arr[left];
            left++;
        }
    }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
        public static void main(String[] args){
            int[] arr = {2,3,1,2,4,3};
            int target = 7;
            System.out.println(minimumLengthSubarray(arr,target));
        }
    }

