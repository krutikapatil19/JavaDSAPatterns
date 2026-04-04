public class MinimumSubarraySumLen {
    public static int minimumLengthSubarray(int[] arr,int target){

        int left = 0;                           //start of window
        int minLength = Integer.MAX_VALUE;      //store minimum length
        int targetSum = 0;                      //current window sum

        for(int right = 0;right<arr.length;right++){

           targetSum += arr[right];             //add element to window (expand)

           //shrink window to find minimum length
            while(targetSum>=target){

                //update minimum length
                minLength = Math.min(minLength, right-left+1);
    
                //Remove element from left (shrink window)
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

