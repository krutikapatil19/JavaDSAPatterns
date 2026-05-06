
public class binarySeach {
    public static int search(int[] nums, int target) {
        
        int left = 0;       //starting index 
        int right = nums.length - 1;    //ending index 

        //loop runs until left crosses right
        while (left <= right) {

            //find middle index 
            int mid = left + (right - left) / 2;

            //if target found at mid
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {2,3,5,7,12,26};
        int target = 5;
        System.out.println(search(nums, target));
    }
} 