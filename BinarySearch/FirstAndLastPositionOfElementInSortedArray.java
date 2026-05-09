public class FirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {

        //find first ocurence
        int first = binarySearch(nums, target, true);

        int last = binarySearch(nums, target, false);

        return new int[]{first, last};
    }

    public static int binarySearch(int[] nums, int target, boolean findFirst) {

        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        while(left<= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {

                ans = mid;

                if(findFirst) {
                    right = mid - 1;
                }

                else {
                    left = mid + 1;
                }
            }

            else if(nums[mid] < target){
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return ans;
    }
}