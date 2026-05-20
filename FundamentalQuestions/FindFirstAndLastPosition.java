import java.util.Arrays;
public class FindFirstAndLastPosition {
    public static int[] searchRange(int[]nums , int target){

        int firstOccurence = -1;
        int lastOccurence = -1;

        for(int i = 0;i<nums.length; i++){
            if(nums[i] == target){
                if(firstOccurence == -1){
                    firstOccurence = i;
                }
                lastOccurence = i;
            }
        }
        int[] result = new int []{firstOccurence, lastOccurence};
        return result;
    }
    public static void main(String[] args){
        int[]nums ={5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
