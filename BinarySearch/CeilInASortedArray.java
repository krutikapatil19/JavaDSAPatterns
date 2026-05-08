public class CeilInASortedArray {
    public static int findCloseMaxNumber(int[] nums, int target){

        //store final ceil answer 
        int ans = -1;

        //starting index
        int left = 0;

        //ending index
        int right = nums.length-1;

        //loop until search space exists
        while(left <= right){

        //find middle index 
        int mid = left+ (right-left)/2;

        //if current number is greater than or equal to target
            if(nums[mid] >= target){

                //store possible answer
                ans = nums[mid];

                //search left side for smaller valid answer
                right = mid - 1;
            } 
            //if current number is smaller than target 
            else {

                //move to right side
                left = mid +1;
            }
        }
        //return final ceil
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 8, 10, 11, 12, 19};
        int target = 6;
        System.out.println(findCloseMaxNumber(nums,target));
    }
}
