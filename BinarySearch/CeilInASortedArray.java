public class CeilInASortedArray {
    public int static findCloseMaxNumber(int[] nums, int target){

        int ans = -1;

        int left = 0;
        int right = nums.length-1;
        int mid = left+ (right-left)/2;

        while(left<right){

            if(nums[mid] >= target){
                return mid;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 8, 10, 11, 12, 19};
        int target = 6;
        System.out.println(findCloseMaxNumber(nums,target));
    }
}
