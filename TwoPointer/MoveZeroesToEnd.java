import java.util.Arrays;

public class MoveZeroesToEnd {
    public static int[] moveZeroes(int[] nums) {

        // j -> is the position where the next non-zero number should be placed.
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) { // if the number is non-zero , then puttin it at j index.

                if (i != j) { //if i and j are different , move non-zero forward
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++; // expand non-zero section
            }
        }
        return nums; // Array modified in-place -> return for printing
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1, 2, 0, 9, 0 };
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}