import java.util.Arrays;
public class MoveAllZeroesToEnd{

    public static int[] movingZeroestoEnd(int[]nums){

        int i = 0;
        int j = 0;

        for(i = 0;i<nums.length; i++){
            if(nums[i]!= 0){
                nums[j]=nums[i];
                j++;
            } 
        }
        for( i = j; i<nums.length; i++){
            nums[i]=0;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {10,2,0,54,0,0,62};
        System.out.println(Arrays.toString(movingZeroestoEnd(nums)));
    }
}