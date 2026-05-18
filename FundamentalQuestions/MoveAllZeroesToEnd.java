import java.util.Arrays;
public class MoveAllZeroesToEnd {
    public static int[] moveZeroes(int[]nums){

        int i = 0;
        int j = nums.length;

        while(i<nums.length){
        //for(i = 0;i<nums.length ; i++){
            if(nums[i]==0){
                //swap with j 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]= temp;
                j--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {10,0,2,0,0,25};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
