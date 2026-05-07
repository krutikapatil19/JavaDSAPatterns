public class CeilInASortedArray {
    public int static findCloseMaxNumber(int[] nums, int target){

        int ans = -1;

        int left = 0;
        int right = nums.length-1;

        while(left <= right){

        int mid = left+ (right-left)/2;

            if(nums[mid] >= target){
                ans = nums[mid];
                return mid;
            } else {
                left = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 8, 10, 11, 12, 19};
        int target = 6;
        System.out.println(findCloseMaxNumber(nums,target));
    }
}
