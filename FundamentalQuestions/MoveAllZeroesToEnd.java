import java.util.Arrays;
public class MoveAllZeroesToEnd {
    public static int[] moveZeroes(int[]nums){

        int i = 0;
        int j = 0;

       for(i = 0; i<nums.length; i++){
    
        if(nums[i] != 0){
            //placing it at correct position(j)
            nums[j] = nums[i];
            j++;
            
        }
    }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {0,10,20,0};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
