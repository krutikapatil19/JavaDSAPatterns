import java.util.Arrays;
public class MoveZeroo {
    public static int[] movingZeroes(int[] nums){

        int i = 0;
        int j = 0;

        for( i = 0; i<nums.length; i++){
            if(nums[i]!= 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for( i = j; i<nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {5,0,0,10,0,12,0,5};
        System.out.println(Arrays.toString(movingZeroes(nums)));
    }
}