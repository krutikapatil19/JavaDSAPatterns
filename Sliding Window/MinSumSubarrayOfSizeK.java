public class MinSumSubarrayOfSizeK {
    public static int minimumSubarrayLength(int[] nums, int target){

        int start = 0;  //left side of window
        int sum = 0;    //current window sum
        int minLength = Integer.MAX_VALUE;  //store minimum length

        //move right pointer (expand window)
        for(int end = 0;end<nums.length;end++){
            sum += nums[end];   //add current element to sum

            //if sum becomes >= target, try to shrink window
            while(sum >= target){

                //update minimum length
                minLength = Math.min(minLength, end-start+1);
                
                //remove left element from sum (shrink window)
                sum -= nums[start];

                //move left pointer forward
                start++;
            }
        }
        //if no valid subararray found , return 0
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int target = 9;
        System.out.println(minimumSubarrayLength(nums,target));
    }
}
