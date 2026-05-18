import java.util.Arrays;
public class MoveAllZeroesToEnd{

    public static int[] movingZeroestoEnd(int[]nums){

        //Using two-pointer approach , i keeps track of zeroes elements , and j points to where the next non-zero element should go.
        int i = 0;
        int j = 0;

        for(i = 0;i<nums.length; i++){

            //if current number is non zero , then assigning it to jth position, and then incrementing j pointer 
            if(nums[i]!= 0){
                nums[j]=nums[i];
                j++;
            } 
        }
        //In the end , filling the remaining indices with 0 , becuase all the non-zeroes are moved forward.
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