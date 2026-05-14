import java.util.Arrays;
public class ReverseArray {
    public static int[] reverse(int[]nums){

        int i = nums[0];
        int j = nums.length-1;

        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,10,14,28,35};
        System.out.println(Arrays.toString(reverse(nums)));
    }
}
