import java.util.Arrays;
public class FirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {

        //find first ocurence
        int first = binarySearch(nums, target, true);

        //find last occurence
        int last = binarySearch(nums, target, false);

        return new int[]{first, last};
    }

    public static int binarySearch(int[] nums, int target, boolean findFirst) {

        int left = 0;
        int right = nums.length - 1;

        int ans = -1;

        while(left<= right) {
            int mid = left + (right - left) / 2;

            //target found
            if(nums[mid] == target) {

                ans = mid;

                //search left for first occurence
                if(findFirst) {
                    right = mid - 1;
                }

                //search right for last occurence
                else {
                    left = mid + 1;
                }
            }

            //move left
            else if(nums[mid] < target){
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {5, 7, 7, 8, 8, 8, 10};

        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}