import java.util.Arrays;
public class ReverseArray {
    public static int[] reverse(int[]nums){

        //Used two-pointer approach here , i and j , i is the start of the array and j is the end element of array , loop will run until i crosses j, and along with that swapping of i and j index numbers will happen.
        int i = 0;              
        int j = nums.length-1;

        while(i<j){
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
