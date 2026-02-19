import java.util.Arrays;
public class MoveZeroesToEnd{
    public static int[] moveZeroes(int[]nums){
        int j = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;   
                j++;
            } 
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,0,1,2,0,9,0};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}