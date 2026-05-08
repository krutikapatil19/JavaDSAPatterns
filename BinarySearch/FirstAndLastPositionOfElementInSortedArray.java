import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {

    public static int[] searchRange(int[] nums, int target) {

        // find first occurrence
        int first = findFirst(nums, target);

        // find last occurrence
        int last = findLast(nums, target);

        // return both answers
        return new int[]{first, last};
    }

    // function to find first occurrence
    public static int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // store answer
        int ans = -1;

        while(left <= right) {

            // find middle index
            int mid = left + (right - left) / 2;

            // target found
            if(nums[mid] == target) {

                // store answer
                ans = mid;

                // search on left side
                right = mid - 1;
            }

            // move right
            else if(nums[mid] < target) {
                left = mid + 1;
            }

            // move left
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // function to find last occurrence
    public static int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // store answer
        int ans = -1;

        while(left <= right) {

            // find middle index
            int mid = left + (right - left) / 2;

            // target found
            if(nums[mid] == target) {

                // store answer
                ans = mid;

                // search on right side
                left = mid + 1;
            }

            // move right
            else if(nums[mid] < target) {
                left = mid + 1;
            }

            // move left
            else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 8, 10};

        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}